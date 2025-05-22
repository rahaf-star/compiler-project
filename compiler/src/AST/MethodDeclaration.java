package AST;

public class MethodDeclaration {
    String identifiers;
    MethodBody methodBody;

    public  String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers( String identifiers) {
        this.identifiers = identifiers;
    }

    public MethodBody getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(MethodBody methodBody) {
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        return "MethodDeclaration{" +
                "identifiers=" + identifiers +
                ", methodBody=" + methodBody +
                '}';
    }
}
