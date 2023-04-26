package C08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManageStudentTest {
    private final ManageStudent manageStudent = new ManageStudent();

    @Test
    void addStudent() {
        Student[] student;

        student = manageStudent.addStudent();

        assertAll(
                () -> assertEquals(student[0].toString(), "Lim null null null"),
                () -> assertEquals(student[1].toString(), "Min null null null"),
                () -> assertEquals(student[2].toString(), "Sook Seoul 010123456768 aaa@mail.com")
        );

    }

    @Test
    void printStudent() {
        Student[] student;

        student = manageStudent.addStudent();

        for (Student stu : student) {
            System.out.println(stu.toString());
        }
    }
}