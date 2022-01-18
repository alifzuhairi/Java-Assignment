import java.util.Scanner;


//******************************************************************
//Name : Alif zuhairi Bin Zulkifli
//Matric Number : 198489
//DateFinish : 9 October 2018
//Program : This program used to add the digits of four-digit number 
//          and then adds a fifth digit of 0 or 1 to make the sum of 
//          the digit even.
//******************************************************************

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int digit1,digit2,digit3,digit4,total;
        
			
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		digit1 = num % 10;
		digit2 = num / 10 % 10;
		digit3 = num / 10 / 10 % 10;
		digit4 = num / 10 / 10 / 10 ;
		total = digit1 + digit2 + digit3 + digit4;
		
		
		 if (total % 2 == 0)
			 System.out.println("Original number is" + " "+ num + " and New number is" +" "+ (num * 10));
		 
			 else
				 System.out.println("Original number is " + " "+ num + " and New number is " +" "+ (num *10 + 1));
	
	}

}
