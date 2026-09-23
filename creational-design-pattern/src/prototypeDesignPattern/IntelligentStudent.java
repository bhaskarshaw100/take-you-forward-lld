package prototypeDesignPattern;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
