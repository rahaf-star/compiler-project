package Visitor;

import AST.*;
import antlr.AngulerParser;
import antlr.AngulerParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngulerParserBaseVisitor {


    @Override
    public TypeAnnotation visitType_annotation(AngulerParser.Type_annotationContext ctx) {
        TypeAnnotation typeAnnotation = new TypeAnnotation();
        List<BaseTypeAnnotation> baseTypeAnnotationList = new ArrayList<>();
        for (int i = 0; i < ctx.base_type_annotation().size(); i++) {
            Object res = visit(ctx.base_type_annotation(i));
            baseTypeAnnotationList.add((BaseTypeAnnotation) res);
        }
        typeAnnotation.setBaseTypeAnnotation(baseTypeAnnotationList);
        return typeAnnotation;
    }

        @Override
        public TypePair visitType_pair (AngulerParser.Type_pairContext ctx){
            TypePair typePair = new TypePair();
            typePair.setIdentifier(ctx.IDENTIFIER().toString());

                BaseTypeAnnotation baseType = (BaseTypeAnnotation) visit(ctx.base_type_annotation());
                typePair.setBaseTypeAnnotations(baseType);

            return typePair;



        }



    @Override
    public StructuredType visitStructured_type(AngulerParser.Structured_typeContext ctx) {
        StructuredType structuredType=new StructuredType();
        List<TypePair> typePairs=new ArrayList<>();
        for (int i = 0; i < ctx.type_pair().size(); i++) {
            Object res = visit(ctx.type_pair(i));
            typePairs.add((TypePair) res);
        }

        structuredType.setTypePair(typePairs);
        return structuredType;
    }

    @Override
        public StructuredType visitStructuredType(AngulerParser.StructuredTypeContext ctx) {
            return visitStructured_type(ctx.structured_type());
        }







            @Override
            public ArrayType visitArrayType (AngulerParser.ArrayTypeContext ctx){

                return visitArray_type(ctx.array_type());



            }

             @Override
           public ArrayType visitArray_type(AngulerParser.Array_typeContext ctx) {
                 ArrayType arrayType = new ArrayType();
                 arrayType.setIdentifier(ctx.IDENTIFIER().toString());
                 return arrayType;

}



            @Override
            public   ClassDeclaration visitClass_declaration (AngulerParser.Class_declarationContext ctx){
               ClassDeclaration classDeclaration=new ClassDeclaration();
                classDeclaration.setIdentifiers(ctx.IDENTIFIER().toString());
                ClassBody body = (ClassBody) visit(ctx.class_body());
                classDeclaration.setClassBody(body);








              return classDeclaration;
            }

            @Override
            public ClassBody visitClass_body (AngulerParser.Class_bodyContext ctx){
              ClassBody classBody=new ClassBody();
              List <Instruction> instruction=new ArrayList<>();
                for (int i = 0; i < ctx.instruction().size(); i++) {
                    Object res = visit(ctx.instruction(i));
                    instruction.add((Instruction) res);
                    }
                classBody.setInstruction(instruction);
                return classBody;




            }

            @Override
            public  MethodDeclaration visitMethod_declaration (AngulerParser.Method_declarationContext ctx){
               MethodDeclaration methodDeclaration=new MethodDeclaration();
                methodDeclaration.setIdentifiers(ctx.IDENTIFIER().toString());

                MethodBody methodBody = new MethodBody();


                    ParameterList params = (ParameterList) visit(ctx.parameter_list());
                    methodBody.setParameterList(params);



                    TypeAnnotation typeAnnotation = (TypeAnnotation) visit(ctx.type_annotation());
                    methodBody.setTypeAnnotation(typeAnnotation);


                List<Instruction> instructions = new ArrayList<>();
                for (var instrCtx : ctx.instruction()) {
                    Instruction instr = (Instruction) visit(instrCtx);
                    instructions.add(instr);
                }
                methodBody.setInstructions(instructions);

                methodDeclaration.setMethodBody(methodBody);
                return methodDeclaration;
            }



            @Override
            public FunctionDeclaration visitFunction_declaration (AngulerParser.Function_declarationContext ctx){
               FunctionDeclaration functionDeclaration=new FunctionDeclaration();
                functionDeclaration.setIdentifier(ctx.IDENTIFIER().toString());
                FunctionBody functionBody = (FunctionBody) visit(ctx.function_body());
                functionDeclaration.setFunctionBody(functionBody);



                return functionDeclaration;

            }

            @Override
            public   FunctionBody visitFunction_body (AngulerParser.Function_bodyContext ctx){
                FunctionBody functionBody=new FunctionBody();
                List <ParameterList> parameterLists=new ArrayList<>();


                List <Instruction> instruction=new ArrayList<>();
                for (int i = 0; i < ctx.instruction().size(); i++) {
                    Object res = visit(ctx.instruction(i));
                    instruction.add((Instruction) res);
                }
                functionBody.setInstruction(instruction);
                return functionBody;


            }



            @Override
            public ParameterList visitParameter_list (AngulerParser.Parameter_listContext ctx){
               ParameterList parameterList=new ParameterList();
                List <Parameter> parameter=new ArrayList<>();

                for(int i=0;i<ctx.parameter().size();i++) {
                    Object res = visit(ctx.parameter(i));
                    parameter.add((Parameter) res);



                }
                parameterList.setParameter(parameter);
                return parameterList;

            }

            @Override
            public   Parameter visitParameter (AngulerParser.ParameterContext ctx){
        Parameter parameter=new Parameter();
                parameter.setIdentifier(ctx.IDENTIFIER().toString());

                    BaseTypeAnnotation baseType = (BaseTypeAnnotation) visit(ctx.base_type_annotation());
                    parameter.setBaseTypeAnnotation(baseType);

                    StructuredType structType = (StructuredType) visit(ctx.structured_type());
                    parameter.setStructuredType(structType);


                return parameter;



            }





    }