package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassBody {
    List<Instruction> instruction= new ArrayList<>();

    public List<Instruction> getInstruction() {
        return instruction;
    }

    public void setInstruction(List<Instruction> instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "ClassBody{" +
                "instruction=" + instruction +
                '}';
    }
}
