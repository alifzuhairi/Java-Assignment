import java.util.Scanner;
//************************************************************************
//Name : Alif zuhairi Bin Zulkifli
//Matric Number : 198489
//DateFinish : 9 October 2018
//Program : This program prompt the user to enter binary digit and display
//          its corresponding decimal value
//************************************************************************
public class Convert {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter binary digits(0000-1111): ");
		int binary=input.nextInt();
		int digit1=binary/10/10/10;
		int digit2=binary/10/10%10;
		int digit3=binary/10%10;
		int digit4=binary%10;
		
		int mul1=digit1*(2*2*2);
		int mul2=digit2*(2*2);
		int mul3=digit3*2;
		int mul4=digit4*1;
		
		int decimal=mul1+mul2+mul3+mul4;
		
		System.out.println("The decimal value is " + decimal);
		
	   	

	}
}