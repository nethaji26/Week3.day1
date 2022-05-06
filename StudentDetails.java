package student;

import department.Department;

public class StudentDetails extends Department{
	
	
		public void studentName()
		{
			System.out.println(" The student name is nethe");
		}
		
		public void studentDept()
		{
			System.out.println(" The student dept is cse");
		}
		
		public void studentId()
		{
			System.out.println(" The student name is 901");
		}
		
		public static void main(String[] args) {
			
			StudentDetails stud = new StudentDetails();
			stud.collegeName();
			stud.collegeCode();
			stud.collegeRank();
			stud.departmentname();
			stud.studentDept();
			stud.studentName();
			stud.studentId();
		
		}
		
	}

	


