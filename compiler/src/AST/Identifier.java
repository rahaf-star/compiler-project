package AST;



public class Identifier extends BaseTypeAnnotation{
    public String ID;



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Identifier{" +
                "ID='" + ID + '\'' +
                '}';
    }
}