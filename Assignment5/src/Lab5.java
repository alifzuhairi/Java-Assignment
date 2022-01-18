import java.io.IOException;
import java.util.Scanner;

public class Lab5 {


	static String Name ;
	static int NumberOfHours;
	 static int IDnumber ;
	static int PayRate ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll P = new Payroll(Name , IDnumber , PayRate , NumberOfHours);
		Scanner input = new Scanner (System.in);
		boolean count = true;
		
		
		do {
		System.out.print("Enter the employee's Name : ");
		String Name = input.nextLine(); 
		
		try {
			if(Name.isEmpty())
				throw new NullPointerException("Error, Please enter your real number \n");
			count = false;
		}
		catch (NullPointerException e){
			System.out.print(e.getMessage());
		}
		}while(count);
			
		do {
		System.out.print("Enter the employee's ID : ");
		int IDnumber = input.nextInt();
		
		try
	      {
	   		
	   	if (IDnumber < 0 )
	   	
	   	throw new Exception("negative number or zero would be invalid.\n" );
	   		count = false;
	   	}
	   	catch (Exception e)
	   		
	   	{
	   		
	   	System.out.println(" Error: " + e.getMessage());	
	   }
		}while(count);
			do {
		System.out.print("Enter the employee's PayRate : ");
		int PayRate = input.nextInt();
		P.PayRate = PayRate;
	      try
	      {
	   		
	   	if (PayRate < 0 || PayRate > 25)
	   	
	   	throw new Exception(" This would be a negative number or a number greater than 25\n" );
	   		count = false;
	   	}
	   	catch (Exception e)
	   		
	   	{
	   		
	   	System.out.println(" Error: " + e.getMessage());	
	   }
			}while(count);
			
			do {
		System.out.print("Enter the employee's Number of hours worked : ");
		int NumberOfHours = input.nextInt();
		P.NumberOfHours = NumberOfHours;
	      try
	      {
	   		
	   	if (NumberOfHours < 0 || NumberOfHours > 84)
	   	
	   	throw new Exception(" The hours cannot be less than 0 or greater than 84. Try again." );
	   		count = false;
	   	}
	   	catch (Exception e)
	   		
	   	{
	   		
	   	System.out.println(" Error: " + e.getMessage());	
	   }
			}while(count);
		
		

		System.out.println("The GrossPay is "+ P.GetGrossPay());
		
	}

}


class Payroll {
	String GetGrossPay ;
	String Name;
	int IDnumber;
	int PayRate;
	int NumberOfHours;
	
	Payroll(String newName , int newIDnumber , int newPayRate , int newNumberOfHours){
		Name = newName;
		IDnumber = newIDnumber;
		PayRate = newPayRate;
		NumberOfHours = newNumberOfHours;
		
		
	}
	
	
	public String GetName(){
		
		return Name;
	}
	
	public int GetIDnumber() {
		
		return IDnumber;
	}
	
	public int GetPayRate() {
		return PayRate;

	}
	
	public int GetNumberOfHours() {

	return NumberOfHours;
		
	}

	
	public int GetGrossPay() {
		
		int Grosspay = PayRate * NumberOfHours;
		return Grosspay;
	}
}