// Generated from C:/Users/Rahaf/Desktop/comp/compiler-project/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code metadataSelector}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataSelector(AngulerParser.MetadataSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataSelector}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataSelector(AngulerParser.MetadataSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataStandalone}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataStandalone(AngulerParser.MetadataStandaloneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataStandalone}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataStandalone(AngulerParser.MetadataStandaloneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataImports}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataImports(AngulerParser.MetadataImportsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataImports}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataImports(AngulerParser.MetadataImportsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataTemplate}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataTemplate(AngulerParser.MetadataTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataTemplate}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataTemplate(AngulerParser.MetadataTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataTemplateUrl}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataTemplateUrl(AngulerParser.MetadataTemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataTemplateUrl}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataTemplateUrl(AngulerParser.MetadataTemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataStyles}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataStyles(AngulerParser.MetadataStylesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataStyles}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataStyles(AngulerParser.MetadataStylesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataStyleUrls}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataStyleUrls(AngulerParser.MetadataStyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataStyleUrls}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataStyleUrls(AngulerParser.MetadataStyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#selector_property}.
	 * @param ctx the parse tree
	 */
	void enterSelector_property(AngulerParser.Selector_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#selector_property}.
	 * @param ctx the parse tree
	 */
	void exitSelector_property(AngulerParser.Selector_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#standalone_property}.
	 * @param ctx the parse tree
	 */
	void enterStandalone_property(AngulerParser.Standalone_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#standalone_property}.
	 * @param ctx the parse tree
	 */
	void exitStandalone_property(AngulerParser.Standalone_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#imports_property}.
	 * @param ctx the parse tree
	 */
	void enterImports_property(AngulerParser.Imports_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#imports_property}.
	 * @param ctx the parse tree
	 */
	void exitImports_property(AngulerParser.Imports_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#template_property}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_property(AngulerParser.Template_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#template_property}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_property(AngulerParser.Template_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#templateUrl_property}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl_property(AngulerParser.TemplateUrl_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#templateUrl_property}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl_property(AngulerParser.TemplateUrl_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#styles_property}.
	 * @param ctx the parse tree
	 */
	void enterStyles_property(AngulerParser.Styles_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#styles_property}.
	 * @param ctx the parse tree
	 */
	void exitStyles_property(AngulerParser.Styles_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#styleUrls_property}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrls_property(AngulerParser.StyleUrls_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#styleUrls_property}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrls_property(AngulerParser.StyleUrls_propertyContext ctx);
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
	 * Enter a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(AngulerParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(AngulerParser.PrimitiveTypeContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(AngulerParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(AngulerParser.Primitive_typeContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(AngulerParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(AngulerParser.Method_bodyContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#declaraiton_keywords}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraiton_keywords(AngulerParser.Declaraiton_keywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#declaraiton_keywords}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraiton_keywords(AngulerParser.Declaraiton_keywordsContext ctx);
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
	 * Enter a parse tree produced by the {@code parenthesizedValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedValue(AngulerParser.ParenthesizedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedValue(AngulerParser.ParenthesizedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(AngulerParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(AngulerParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code computedMemberAccess}
	 * labeled alternative in {@link AngulerParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void enterComputedMemberAccess(AngulerParser.ComputedMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code computedMemberAccess}
	 * labeled alternative in {@link AngulerParser#member_expression}.
	 * @param ctx the parse tree
	 */
	void exitComputedMemberAccess(AngulerParser.ComputedMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallOrPropertyAccess}
	 * labeled alternative in {@link AngulerParser#dot_value}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallOrPropertyAccess(AngulerParser.MethodCallOrPropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallOrPropertyAccess}
	 * labeled alternative in {@link AngulerParser#dot_value}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallOrPropertyAccess(AngulerParser.MethodCallOrPropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngulerParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngulerParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngulerParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngulerParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlusMinusExpression}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusMinusExpression(AngulerParser.UnaryPlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlusMinusExpression}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusMinusExpression(AngulerParser.UnaryPlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixUnaryOperation}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperation(AngulerParser.PrefixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixUnaryOperation}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperation(AngulerParser.PrefixUnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixUnaryOperation}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperation(AngulerParser.PostfixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixUnaryOperation}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperation(AngulerParser.PostfixUnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(AngulerParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(AngulerParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link AngulerParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(AngulerParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link AngulerParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(AngulerParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityComparison}
	 * labeled alternative in {@link AngulerParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(AngulerParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityComparison}
	 * labeled alternative in {@link AngulerParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(AngulerParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(AngulerParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(AngulerParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(AngulerParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(AngulerParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link AngulerParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(AngulerParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link AngulerParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(AngulerParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprConditional}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprConditional(AngulerParser.ExprConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprConditional}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprConditional(AngulerParser.ExprConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(AngulerParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(AngulerParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(AngulerParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(AngulerParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEquality}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprEquality(AngulerParser.ExprEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEquality}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprEquality(AngulerParser.ExprEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArithmetic}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprArithmetic(AngulerParser.ExprArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArithmetic}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprArithmetic(AngulerParser.ExprArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(AngulerParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(AngulerParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMemberAccess}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMemberAccess(AngulerParser.ExprMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMemberAccess}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMemberAccess(AngulerParser.ExprMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprValue}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprValue(AngulerParser.ExprValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprValue}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprValue(AngulerParser.ExprValueContext ctx);
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
	 * Enter a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngulerParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngulerParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngulerParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngulerParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(AngulerParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(AngulerParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngulerParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngulerParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(AngulerParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(AngulerParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSwitch}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtSwitch(AngulerParser.StmtSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSwitch}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtSwitch(AngulerParser.StmtSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(AngulerParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(AngulerParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtDoWhile}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtDoWhile(AngulerParser.StmtDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtDoWhile}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtDoWhile(AngulerParser.StmtDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(AngulerParser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(AngulerParser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtContinue(AngulerParser.StmtContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtContinue}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtContinue(AngulerParser.StmtContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(AngulerParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(AngulerParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtBreak(AngulerParser.StmtBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtBreak}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtBreak(AngulerParser.StmtBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngulerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngulerParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(AngulerParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(AngulerParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(AngulerParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(AngulerParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_default(AngulerParser.Switch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_default(AngulerParser.Switch_defaultContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#continue_Statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_Statement(AngulerParser.Continue_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#continue_Statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_Statement(AngulerParser.Continue_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#return_Statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_Statement(AngulerParser.Return_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#return_Statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_Statement(AngulerParser.Return_StatementContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(AngulerParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(AngulerParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#interface_Declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_Declaration(AngulerParser.Interface_DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#interface_Declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_Declaration(AngulerParser.Interface_DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#generic_Type}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_Type(AngulerParser.Generic_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#generic_Type}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_Type(AngulerParser.Generic_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngulerParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngulerParser.EosContext ctx);
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
	 * Enter a parse tree produced by the {@code templateVariable}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterTemplateVariable(AngulerParser.TemplateVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateVariable}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitTemplateVariable(AngulerParser.TemplateVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterNgContent(AngulerParser.NgContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitNgContent(AngulerParser.NgContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngTemplate}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterNgTemplate(AngulerParser.NgTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngTemplate}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitNgTemplate(AngulerParser.NgTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(AngulerParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(AngulerParser.TagsContext ctx);
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
	 * Enter a parse tree produced by {@link AngulerParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(AngulerParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(AngulerParser.AttrsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AngulerParser#template_variable}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_variable(AngulerParser.Template_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#template_variable}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_variable(AngulerParser.Template_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#ng_content}.
	 * @param ctx the parse tree
	 */
	void enterNg_content(AngulerParser.Ng_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#ng_content}.
	 * @param ctx the parse tree
	 */
	void exitNg_content(AngulerParser.Ng_contentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngTemplateWithContent}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void enterNgTemplateWithContent(AngulerParser.NgTemplateWithContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngTemplateWithContent}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void exitNgTemplateWithContent(AngulerParser.NgTemplateWithContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngTemplateSelfClosing}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void enterNgTemplateSelfClosing(AngulerParser.NgTemplateSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngTemplateSelfClosing}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void exitNgTemplateSelfClosing(AngulerParser.NgTemplateSelfClosingContext ctx);
}