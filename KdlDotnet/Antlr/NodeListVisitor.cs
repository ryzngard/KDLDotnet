using Antlr4.Runtime.Misc;
using KdlAntlr;
using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KdlDotnet.Antlr
{
    internal class NodeListVisitor : KDLBaseVisitor<ImmutableArray<KdlNode>>
    {
        public override ImmutableArray<KdlNode> VisitNode_list([NotNull] KDLParser.Node_listContext context)
        {
            var nodes = new List<KdlNode>();
            foreach (var node in context.node())
            {
                nodes.Add(VisitSingleNode(node));
            }

            return nodes.ToImmutableArray();
        }

        private KdlNode VisitSingleNode(KDLParser.NodeContext node)
        {
            var children = new List<KdlNode>();
            var valuesAndProperties = new List<KdlValueOrProperty>();

            var node_children = node.node_children();
            if (node_children is not null)
            {
                foreach (var child in node_children.node())
                {
                    children.Add(VisitSingleNode(child));
                }
            }

            foreach (var valueOrProperty in node.node_props_and_values())
            {
                valuesAndProperties.Add(VisitValueOrProperty(valueOrProperty));
            }

            var name = VisitName(node.identifier());

            var values = valuesAndProperties
                .Where(v => string.IsNullOrEmpty(v.Name))
                .Select(v => new KdlValue(v.ValueType, v.Value))
                .ToImmutableArray();

            var properties = valuesAndProperties
                .Where(v => !string.IsNullOrEmpty(v.Name))
                .ToImmutableDictionary(v => v.Name!, v => new KdlValue(v.ValueType, v.Value));

            return new KdlNode(name, values, properties, children.ToImmutableArray());
        }

        private string VisitName(KDLParser.IdentifierContext identifierContext)
        {
            // Is this right?
            return identifierContext.ToString();
        }

        private KdlValueOrProperty VisitValueOrProperty(KDLParser.Node_props_and_valuesContext valueOrProperty)
        {
            var prop = valueOrProperty.prop();
            if (prop is not null)
                return VisitSingleProp(prop);

            return VisitSingleValue(valueOrProperty.value());
        }

        private KdlValue VisitSingleValue(KDLParser.ValueContext valueContext)
        {
            if (valueContext.BOOLEAN() is not null)
            {
                return new KdlBool(bool.Parse(valueContext.BOOLEAN().Payload.ToString() ?? throw new Exception()));
            }
            else if (valueContext.NUMBER() is not null)
            {
                var numberText = valueContext.NUMBER().Payload.ToString()!;

                // binary
                if (numberText.StartsWith("0b"))
                {

                }
                // hex
                else if (numberText.StartsWith("0x"))
                {

                }
                // octal
                else if (numberText.StartsWith("Ox"))
                {

                }
                // decimal
                else if (numberText.Contains("."))
                {

                }
                // integer
                else
                {
                    return new KdlInt(int.Parse(numberText));
                }
            }
            else if (valueContext.CHARACTER() is not null)
            {
                return new KdlString(string.Join("", valueContext.CHARACTER().Select(c => c.GetText())));
            }

            throw new Exception();
        }

        private KdlValueOrProperty VisitSingleProp(KDLParser.PropContext prop)
        {
            throw new NotImplementedException();
        }
    }
}
