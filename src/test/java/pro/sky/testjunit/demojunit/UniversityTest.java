package pro.sky.testjunit.demojunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniversityTest {
    private University university;
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    public void setUp(){
        student1 = new Student("Варфоломей", 17, true);
        student2 = new Student("Изекиль", 24, false);
        student3 = new Student("Архимандрит", 33, false);

        university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
    }


    @Test
    public void getAllStudents() {
        List<Student> expected = university.getAllStudents();

        List<Student> actual = new ArrayList<>();

        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        assertEquals(expected, actual);
    }
    @Test
    public void getAllStudentsIsMale() {
        List<Student> expected = university.getAllStudents(true);

        List<Student> actual = new ArrayList<>();

        actual.add(student1);
        //actual.add(student2);
        //actual.add(student3);

        assertEquals(expected, actual);
    }
@Test
    public void getAllStudentsNotNull(){
        List<Student> expected = university.getAllStudents();
        assertNotNull(expected);

    }

}
