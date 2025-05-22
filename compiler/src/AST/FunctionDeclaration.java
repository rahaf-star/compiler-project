package AST;

public class FunctionDeclaration extends Instruction {
    String identifier;
    FunctionBody functionBody;

    public String  getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String  identifier) {
        this.identifier = identifier;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" +
                "identifier=" + identifier +
                ", functionBody=" + functionBody +
                '}';
    }
}
