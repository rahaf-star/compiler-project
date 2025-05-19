// Generated from C:/Users/Lenovo/Desktop/compiler/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngulerParser}.
 */
public interface AngulerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngulerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AngulerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AngulerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngulerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngulerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(AngulerParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(AngulerParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(AngulerParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(AngulerParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(AngulerParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(AngulerParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void enterVariable_statement(AngulerParser.Variable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#variable_statement}.
	 * @param ctx the parse tree
	 */
	void exitVariable_statement(AngulerParser.Variable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#export_statement}.
	 * @param ctx the parse tree
	 */
	void enterExport_statement(AngulerParser.Export_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#export_statement}.
	 * @param ctx the parse tree
	 */
	void exitExport_statement(AngulerParser.Export_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(AngulerParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(AngulerParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(AngulerParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(AngulerParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void enterCase_clause(AngulerParser.Case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#case_clause}.
	 * @param ctx the parse tree
	 */
	void exitCase_clause(AngulerParser.Case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(AngulerParser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(AngulerParser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(AngulerParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(AngulerParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(AngulerParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(AngulerParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(AngulerParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(AngulerParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(AngulerParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(AngulerParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(AngulerParser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(AngulerParser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(AngulerParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(AngulerParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(AngulerParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(AngulerParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(AngulerParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(AngulerParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(AngulerParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(AngulerParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AngulerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AngulerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(AngulerParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(AngulerParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(AngulerParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(AngulerParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(AngulerParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(AngulerParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#anguler_import}.
	 * @param ctx the parse tree
	 */
	void enterAnguler_import(AngulerParser.Anguler_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#anguler_import}.
	 * @param ctx the parse tree
	 */
	void exitAnguler_import(AngulerParser.Anguler_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration(AngulerParser.Component_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration(AngulerParser.Component_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterComponent_metadata(AngulerParser.Component_metadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitComponent_metadata(AngulerParser.Component_metadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadata_property(AngulerParser.Metadata_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadata_property(AngulerParser.Metadata_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(AngulerParser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(AngulerParser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(AngulerParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(AngulerParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterNullType(AngulerParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitNullType(AngulerParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(AngulerParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(AngulerParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structuredType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(AngulerParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structuredType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(AngulerParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AngulerParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AngulerParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(AngulerParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(AngulerParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#structured_type}.
	 * @param ctx the parse tree
	 */
	void enterStructured_type(AngulerParser.Structured_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#structured_type}.
	 * @param ctx the parse tree
	 */
	void exitStructured_type(AngulerParser.Structured_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#type_pair}.
	 * @param ctx the parse tree
	 */
	void enterType_pair(AngulerParser.Type_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#type_pair}.
	 * @param ctx the parse tree
	 */
	void exitType_pair(AngulerParser.Type_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(AngulerParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(AngulerParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(AngulerParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(AngulerParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(AngulerParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(AngulerParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(AngulerParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(AngulerParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(AngulerParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(AngulerParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(AngulerParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(AngulerParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngulerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngulerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AngulerParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AngulerParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(AngulerParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(AngulerParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngulerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngulerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallValue(AngulerParser.FunctionCallValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallValue(AngulerParser.FunctionCallValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierValue(AngulerParser.IdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierValue(AngulerParser.IdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(AngulerParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(AngulerParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AngulerParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AngulerParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(AngulerParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(AngulerParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(AngulerParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(AngulerParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(AngulerParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(AngulerParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(AngulerParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(AngulerParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#dot_value}.
	 * @param ctx the parse tree
	 */
	void enterDot_value(AngulerParser.Dot_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#dot_value}.
	 * @param ctx the parse tree
	 */
	void exitDot_value(AngulerParser.Dot_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(AngulerParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(AngulerParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#json_object}.
	 * @param ctx the parse tree
	 */
	void enterJson_object(AngulerParser.Json_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#json_object}.
	 * @param ctx the parse tree
	 */
	void exitJson_object(AngulerParser.Json_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#json_pair}.
	 * @param ctx the parse tree
	 */
	void enterJson_pair(AngulerParser.Json_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#json_pair}.
	 * @param ctx the parse tree
	 */
	void exitJson_pair(AngulerParser.Json_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#imports_array}.
	 * @param ctx the parse tree
	 */
	void enterImports_array(AngulerParser.Imports_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#imports_array}.
	 * @param ctx the parse tree
	 */
	void exitImports_array(AngulerParser.Imports_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngulerParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngulerParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(AngulerParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(AngulerParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngulerParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngulerParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(AngulerParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(AngulerParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AngulerParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AngulerParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngulerParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngulerParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngulerParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngulerParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngulerParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngulerParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedHtml}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterNestedHtml(AngulerParser.NestedHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedHtml}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitNestedHtml(AngulerParser.NestedHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngulerParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngulerParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interpolation}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngulerParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interpolation}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngulerParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(AngulerParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(AngulerParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tag(AngulerParser.Open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tag(AngulerParser.Open_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standardAttribute}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void enterStandardAttribute(AngulerParser.StandardAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardAttribute}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void exitStandardAttribute(AngulerParser.StandardAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveAttribute}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveAttribute(AngulerParser.DirectiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveAttribute}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveAttribute(AngulerParser.DirectiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyBinding}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngulerParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyBinding}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngulerParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eventBinding}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngulerParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eventBinding}
	 * labeled alternative in {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngulerParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterClose_tag(AngulerParser.Close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitClose_tag(AngulerParser.Close_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void enterSingle_tag(AngulerParser.Single_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void exitSingle_tag(AngulerParser.Single_tagContext ctx);
}