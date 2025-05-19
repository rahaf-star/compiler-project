// Generated from C:/Users/Lenovo/Desktop/compiler/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngulerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngulerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngulerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AngulerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngulerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(AngulerParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(AngulerParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(AngulerParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#variable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_statement(AngulerParser.Variable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#export_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_statement(AngulerParser.Export_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(AngulerParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(AngulerParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_clause(AngulerParser.Case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(AngulerParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(AngulerParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(AngulerParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(AngulerParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(AngulerParser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clause(AngulerParser.Catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#finally_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_clause(AngulerParser.Finally_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(AngulerParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(AngulerParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(AngulerParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngulerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(AngulerParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(AngulerParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(AngulerParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#anguler_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnguler_import(AngulerParser.Anguler_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#component_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration(AngulerParser.Component_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_metadata(AngulerParser.Component_metadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata_property(AngulerParser.Metadata_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(AngulerParser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(AngulerParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullType(AngulerParser.NullTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(AngulerParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structuredType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(AngulerParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AngulerParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(AngulerParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#structured_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_type(AngulerParser.Structured_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#type_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_pair(AngulerParser.Type_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(AngulerParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(AngulerParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(AngulerParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(AngulerParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(AngulerParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(AngulerParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngulerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AngulerParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(AngulerParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngulerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallValue(AngulerParser.FunctionCallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValue(AngulerParser.IdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(AngulerParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AngulerParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(AngulerParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(AngulerParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(AngulerParser.NullValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(AngulerParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#dot_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_value(AngulerParser.Dot_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(AngulerParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#json_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_object(AngulerParser.Json_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#json_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_pair(AngulerParser.Json_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#imports_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports_array(AngulerParser.Imports_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngulerParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(AngulerParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngulerParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(AngulerParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AngulerParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngulerParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngulerParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngulerParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedHtml}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedHtml(AngulerParser.NestedHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngulerParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interpolation}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngulerParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(AngulerParser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#open_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_tag(AngulerParser.Open_tagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardAttribute}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttribute(AngulerParser.StandardAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveAttribute}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveAttribute(AngulerParser.DirectiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyBinding}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngulerParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eventBinding}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngulerParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#close_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_tag(AngulerParser.Close_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#single_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_tag(AngulerParser.Single_tagContext ctx);
}