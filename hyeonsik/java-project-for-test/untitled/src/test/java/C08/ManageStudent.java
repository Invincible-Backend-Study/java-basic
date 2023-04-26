package C08;

public class ManageStudent {
    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010123456768", "aaa@mail.com");
        return student;
    }
}
