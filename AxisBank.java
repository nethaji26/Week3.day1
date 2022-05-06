package week3.day1;

public class AxisBank extends BankInfo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BankInfo obj1 = new BankInfo();
		obj1.deposit();
		AxisBank obj2 = new AxisBank();
		obj2.deposit();
		BankInfo obj3 = new AxisBank();
		obj3.deposit();
	}
		
		public void deposit()
		{
			System.out.println("Deposit from child");
		}

	}

	

