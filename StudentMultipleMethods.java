package week3.day1;

public class StudentMultipleMethods {

	public static void main(String[] args) {
		
		StudentMultipleMethods obj1 = new StudentMultipleMethods();
		 int id = obj1.getStudentInfo(100);
		 System.out.println(id);
		String studentInfo = obj1.getStudentInfo(100, "Nethaji");
		System.out.println(studentInfo);
		String studentInfo2 = obj1.getStudentInfo("net@gmail.com", 945);
		System.out.println(studentInfo2);
	
				}
	
	public int getStudentInfo(int id)
	{
		System.out.println(" giving the id");
		return id;
	}
	public String  getStudentInfo(int id, String name)
	{
		System.out.println(" giving the id and name");
		return name;
		
	}
	public String getStudentInfo(String email, int phonenumber)
	{
		System.out.println(" giving the email and phonenumber");
		return email;
		
	}

}
