package week3.day1;

public class Automation implements Language,TestTool {

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println(" Test1");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		
		System.out.println("Test2");
		
	}
	
	
	public static void main(String[] args)
	{
		Automation auto = new Automation();
		auto.selenium();
		auto.java();
		
	}

}
