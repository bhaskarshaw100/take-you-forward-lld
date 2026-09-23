package prototypeDesignPattern;

public class Student implements Protoype<Student> {
    private String name;
    private int age;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public Student() {}

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.studentPsp = student.studentPsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
