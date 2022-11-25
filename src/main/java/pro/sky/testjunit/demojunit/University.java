package pro.sky.testjunit.demojunit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private Map<Integer, Student> allStudents = new HashMap<>();
    private static int countId = 1;

    public void addStudent(Student student) {
        if (allStudents == null) {
            allStudents = new HashMap<>();
        }
        student.setId(countId);
        allStudents.put(countId, student);
        countId++;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(allStudents.values());
    }

    public List<Student> getAllStudents(boolean isMale) {
        List<Student> listAllStudent = new ArrayList<>();
        for (Student s :
                allStudents.values()) {
            if (isMale == s.isMale()) {
                listAllStudent.add(s);
            }
        }
        return listAllStudent;
    }
}
