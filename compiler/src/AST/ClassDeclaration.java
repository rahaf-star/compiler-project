package AST;



public class ClassDeclaration extends Instruction {
    String identifiers;
    ClassBody classBody;



    public   String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(  String identifiers) {
        this.identifiers = identifiers;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "ClassDeclaration{" +
                "identifiers=" + identifiers +
                ", classBody=" + classBody +
                '}';
    }
}