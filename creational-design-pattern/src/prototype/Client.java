package prototype;

public class Client {

    public static void fillRegistry(StudentRegistery registry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setName("Bhaskar");
        aprBatchStudent.setAge(25);
        aprBatchStudent.setBatch("Java");
        aprBatchStudent.setAverageBatchPsp(80.0);
        aprBatchStudent.setStudentPsp(90.0);
        registry.RegisterStudent("aprBatchStudent", aprBatchStudent);

        IntelligentStudent aprIntelligentBatchStudent = new IntelligentStudent();
        aprIntelligentBatchStudent.setName("Bhaskar Shaw");
        aprIntelligentBatchStudent.setAge(23);
        aprIntelligentBatchStudent.setBatch("Python");
        aprIntelligentBatchStudent.setAverageBatchPsp(85.0);
        aprIntelligentBatchStudent.setStudentPsp(95.0);
        aprIntelligentBatchStudent.setIq(120);
        registry.RegisterStudent("aprIntelligentBatchStudent", aprIntelligentBatchStudent);
    }

    public static void main(String[] args) {
        StudentRegistery registry = StudentRegistery.getInstance();
        fillRegistry(registry);

        Student ashi = registry.getStudent("aprBatchStudent").clone();
        ashi.setName("Ashi");
        ashi.setAge(24);
        ashi.setStudentPsp(85.0);

        Student intelligentAshi = registry.getStudent("aprIntelligentBatchStudent").clone();
        intelligentAshi.setName("Ashi Bajpai");
        intelligentAshi.setAge(22);
        intelligentAshi.setStudentPsp(92.0);

        System.out.println("Intelligent Ashi: " + intelligentAshi);
        System.out.println("Ashi: " + ashi);
    }
}
