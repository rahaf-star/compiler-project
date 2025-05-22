package AST;

import java.util.List;

public class MethodBody {
    List<Instruction> instruction;
    ParameterList parameterList;
    TypeAnnotation typeAnnotation;

    public List<Instruction> getInstructions() {
        return instruction;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instruction = instructions;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
         if (typeAnnotation != null) {
            return "\nMethodBody{" + "typeAnnotation=" +typeAnnotation + "\n}";

        } else if (parameterList != null) {
            return "\nMethodBody{" + " parameterList=" + parameterList + "\n}";
        }

        return "\nMethodBody{" + "instruction=" + instruction + "\n}";

    }
}
