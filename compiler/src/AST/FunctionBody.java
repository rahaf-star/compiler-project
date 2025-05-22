package AST;

import java.util.List;

public class FunctionBody {
    ParameterList parameterList;
    List<Instruction> instruction;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public void setInstruction(List<Instruction> instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        if (parameterList != null) {
            return "\nFunctionBody {" + " parameterList=" + parameterList + "\n}";
        }
        return "FunctionBody{" +
                " instruction=" + instruction +
                '}';
    }
}
