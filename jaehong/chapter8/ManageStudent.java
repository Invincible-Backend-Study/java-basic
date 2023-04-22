public class ManageStudent{

	public static void main(String...args){
		Student[] student;
		var manageStudent = new ManageStudent();
		student = manageStudent.addStudent();
		manageStudent.printStudent(student);
		
	}

	public Student[] addStudent(){
		var student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Seok", "Seoul", "010xxxxxxx","println@kakao.com");
		return student;
	}

	public void printStudent(Student[] student){
		for(var std: student){
			System.out.println(std.toString());
		}
	}
}
