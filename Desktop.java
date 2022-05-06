package week3.day1;

public class Desktop extends Computer{

	public static void main(String[] args) {
		//If u dont give extends , u have to declare the objects separately, if u declare extends, u can use same objects for both class. 
		//Computer obj1 = new Computer();
		//obj1.computerModel();
		Desktop obj2= new Desktop();
		obj2.desktopSize(10);
		obj2.computerModel();
	
		
	}	
		
		public static int desktopSize(int a)
		{
			 System.out.println(" The desktopsize is " +a);
			 return a;			
			
		}

			
		
		

	}

	

