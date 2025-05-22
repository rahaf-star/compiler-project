package AST;

public class Parameter {
 String identifier;
BaseTypeAnnotation baseTypeAnnotation;
StructuredType structuredType;

    public  String getIdentifier() {
        return identifier;
    }

    public void setIdentifier( String identifier) {
        this.identifier = identifier;
    }

    public BaseTypeAnnotation getBaseTypeAnnotation() {
        return baseTypeAnnotation;
    }

    public void setBaseTypeAnnotation(BaseTypeAnnotation baseTypeAnnotation) {
        this.baseTypeAnnotation = baseTypeAnnotation;
    }

    public StructuredType getStructuredType() {
        return structuredType;
    }

    public void setStructuredType(StructuredType structuredType) {
        this.structuredType = structuredType;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "identifier=" + identifier +
                ", baseTypeAnnotation=" + baseTypeAnnotation +
                ", structuredType=" + structuredType +
                '}';
    }
}
