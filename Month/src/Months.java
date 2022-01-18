import java.util.Scanner;

//*********************************
//Name : Alif zuhairi Bin Zulkifli
//Matric Number : 198489
//DateFinish : 9 October 2018
//Program : 

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int) (Math.random()*13.333+1);
		System.out.print(month + " ");
		
		if (month == 1)
		System.out.println ("January");
		else if (month == 2)
			System.out.println ("February");
		else if (month == 3)
			System.out.println ("March");
		else if (month == 4)
			System.out.println ("April");
		else if (month == 5)
			System.out.println ("May");
		else if (month == 6)
			System.out.println ("June");
		else if (month == 7)
			System.out.println ("July");
		else if (month == 8)
			System.out.println ("August");
		else if (month == 9)
			System.out.println ("September");
		else if (month == 10)
			System.out.println ("October");
		else if (month == 11)
			System.out.println ("November");
		else
			System.out.println ("December");
		
	}

}
