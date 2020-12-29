using Antlr4.Runtime;
using Sprache;
using System.Collections.Immutable;

namespace KdlDotnet
{
    public static class Parser
    {
        public static ImmutableArray<KdlNode> Parse(string input)
        {
#if SPRACHE
            // Sprache based parser
            var node = SpracheGrammar
                .Node
                .Many()
                .Parse(input);

            return node.ToImmutableArray();
#else
            
            var inputStream = new AntlrInputStream(input);
            var lexer = new KdlAntlr.KDLLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new KdlAntlr.KDLParser(commonTokenStream);
            var nodes = parser.node_list();
            nodes.Accept(KdlAntlr.)
            WriteLine("parse tree (LISP style): " + ectx.ToStringTree(parser));
#endif
        }
    }

    public record KdlNode(
        string Name,
        ImmutableArray<KdlValue> Values,
        ImmutableDictionary<string, KdlValue> Properties,
        ImmutableArray<KdlNode> Children);

    public record KdlValue(KdlValueType ValueType, object? Value);
    public record KdlValueOrProperty(string? Name, KdlValueType ValueType, object? Value)
    {
        public static implicit operator KdlValueOrProperty(KdlValue value) => new KdlValueOrProperty(null, value.ValueType, value.Value);
    }

    public record KdlInt(int IntValue) : KdlValue(KdlValueType.Int, IntValue);
    public record KdlFloat(float FValue) : KdlValue(KdlValueType.Float, FValue);
    public record KdlString(string SValue) : KdlValue(KdlValueType.String, SValue);
    public record KdlBool(bool BValue) : KdlValue(KdlValueType.Boolean, BValue);
    public record KdlNull() : KdlValue(KdlValueType.Null, null);

    public enum KdlValueType
    {
        Int,
        Float,
        String,
        Boolean,
        Null
    }
}
