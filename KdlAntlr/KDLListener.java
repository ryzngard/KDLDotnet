// Generated from .\KDL.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KDLParser}.
 */
public interface KDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KDLParser#node_list}.
	 * @param ctx the parse tree
	 */
	void enterNode_list(KDLParser.Node_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#node_list}.
	 * @param ctx the parse tree
	 */
	void exitNode_list(KDLParser.Node_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(KDLParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(KDLParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#node_props_and_values}.
	 * @param ctx the parse tree
	 */
	void enterNode_props_and_values(KDLParser.Node_props_and_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#node_props_and_values}.
	 * @param ctx the parse tree
	 */
	void exitNode_props_and_values(KDLParser.Node_props_and_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#node_children}.
	 * @param ctx the parse tree
	 */
	void enterNode_children(KDLParser.Node_childrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#node_children}.
	 * @param ctx the parse tree
	 */
	void exitNode_children(KDLParser.Node_childrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#node_terminator}.
	 * @param ctx the parse tree
	 */
	void enterNode_terminator(KDLParser.Node_terminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#node_terminator}.
	 * @param ctx the parse tree
	 */
	void exitNode_terminator(KDLParser.Node_terminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KDLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KDLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(KDLParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(KDLParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KDLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#node_space}.
	 * @param ctx the parse tree
	 */
	void enterNode_space(KDLParser.Node_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#node_space}.
	 * @param ctx the parse tree
	 */
	void exitNode_space(KDLParser.Node_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#line_escape}.
	 * @param ctx the parse tree
	 */
	void enterLine_escape(KDLParser.Line_escapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#line_escape}.
	 * @param ctx the parse tree
	 */
	void exitLine_escape(KDLParser.Line_escapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#raw_string}.
	 * @param ctx the parse tree
	 */
	void enterRaw_string(KDLParser.Raw_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#raw_string}.
	 * @param ctx the parse tree
	 */
	void exitRaw_string(KDLParser.Raw_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#raw_string_hash}.
	 * @param ctx the parse tree
	 */
	void enterRaw_string_hash(KDLParser.Raw_string_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#raw_string_hash}.
	 * @param ctx the parse tree
	 */
	void exitRaw_string_hash(KDLParser.Raw_string_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#escaped_string}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_string(KDLParser.Escaped_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#escaped_string}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_string(KDLParser.Escaped_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link KDLParser#line_end}.
	 * @param ctx the parse tree
	 */
	void enterLine_end(KDLParser.Line_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link KDLParser#line_end}.
	 * @param ctx the parse tree
	 */
	void exitLine_end(KDLParser.Line_endContext ctx);
}