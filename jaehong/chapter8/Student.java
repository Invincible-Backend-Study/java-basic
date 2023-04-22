
public class Student{
	private String name;
	private String address;
	private String phone;
	private String email;

	public Student(final String name, String address, String phone, String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Student(final String name){

		this.name = name;
	}


	@Override
	public String toString(){
		return name + " " + address + " " + phone + " " + email;
	}

}
