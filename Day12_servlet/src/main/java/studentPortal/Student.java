package studentPortal;

public class Student {
	private String name ,email , password, dob ,gender,course ;
	public Student(String name , String email,String password,String dob,String gender ,String course  ) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.course = course;
	}
	@Override
	public String toString() {
		return "name:"+name+" email:"+email +" dob" +dob+" gender:"+gender+" course:"+course;
	}
}
