using Sprache;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;

namespace KdlDotnet
{
    internal static class SpracheGrammar
    {
        public static readonly Parser<KdlBool> TrueBoolean =
            Parse.String("true").Return(new KdlBool(true))
            .Token()
            .Named("TrueBool");

        public static readonly Parser<string> NewLine =
            Parse.String("\n")
            .Text()
            .Named("NewLine");

        public static readonly Parser<KdlBool> FalseBoolean =
            Parse.String("false").Return(new KdlBool(false))
            .Token()
            .Named("FalseBool");

        public static readonly Parser<KdlNull> Null =
            Parse.String("null").Return(new KdlNull())
            .Token()
            .Named("NullValue");

        public static readonly Parser<KdlInt> Int =
            (from number in Parse.Numeric.Many()
             select new KdlInt(int.TryParse(number.ToArray(), out var i) ? i : 0))
            .Token()
            .Named("IntValue");

        public static readonly Parser<KdlString> Text =
            (from text in Parse.Letter.Many().Text()
             select new KdlString(text))
            .Token()
            .Named("TextValue");

        public static readonly Parser<string> QuotedText =
            (from open in Parse.Char('"')
             from content in Parse.CharExcept('"').Many().Text()
             from close in Parse.Char('"')
             select content).Token()
            .Named("QuotedText");

        public static readonly Parser<string> CommentBlock =
            (from open in Parse.String("/*")
             from content in Parse.AnyChar.Many().Text()
             from close in Parse.String("*/")
             select open + content + close).Token()
            .Named("CommentBlock");

        public static readonly Parser<string> IdentifierName =
            (from first in Parse.Letter
             from remaining in Parse.LetterOrDigit.Many().Text()
             select first + remaining).Token()
            .Named("IdentifierName");

        public static readonly Parser<KdlValue> Value =
            TrueBoolean
                .Or<KdlValue>(FalseBoolean)
                .Or(Null)
                .Or(Int)
                .Or(Text)
                .Except(Parse.LineTerminator)
            .Named("ValueParser");

        public static readonly Parser<(string name, KdlValue)> Property =
            (from name in IdentifierName
             from equalSign in Parse.Char('=')
             from value in Value
             select (name, value))
            .Named("PropertyParser");

        public static readonly Parser<IEnumerable<KdlNode>> Children =
            (from childrenOpen in Parse.Char('{').Token()
            from children in Node.Many()
            from childrenClose in Parse.Char('}').Token()
            select children)
            .Named("Children");

        public static readonly Parser<KdlNode> Node =
            (from nodeName in IdentifierName
             from valuesAndProperties in Property
                .Or(Value.Select(value => ("", value)))
                .Many()
                .Optional()
             from children in Children.Optional()
             from terminator in Parse.LineTerminator
             select MakeNewNode(nodeName, valuesAndProperties.GetOrDefault(), children.GetOrDefault()))
            .Token()
            .Named("Node");

        private static KdlNode MakeNewNode(string nodeName, IEnumerable<(string name, KdlValue value)>? valuesAndProperties, IEnumerable<KdlNode>? children)
        {
            valuesAndProperties ??= Enumerable.Empty<(string name, KdlValue value)>();
            children ??= Enumerable.Empty<KdlNode>();

            return new KdlNode(
                nodeName,
                valuesAndProperties.Where(kvp => kvp.name == "").Select(kvp => kvp.value).ToImmutableArray(),
                valuesAndProperties.Where(kvp => kvp.name != "").ToImmutableDictionary(kvp => kvp.name, kvp => kvp.value),
                children.ToImmutableArray());

        }
    }
}
