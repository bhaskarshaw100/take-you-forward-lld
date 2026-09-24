package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {
    Map<String, Student> students = new HashMap<>();
    private static final StudentRegistery instance = new StudentRegistery();

    private StudentRegistery() {}

    public static StudentRegistery getInstance() {
        return instance;
    }

    public void RegisterStudent(String key, Student student) {
        students.put(key, student);
    }

    public Student getStudent(String key) {
        return students.get(key);
    }
}
