import java.util.Scanner;
//******************************************************************
//Name : Alif zuhairi Bin Zulkifli
//Matric Number : 198489
//DateFinish : 9 October 2018
//Program : This program used for shipping company to calculate 
//          the cost in ringgit malaysia of shipping based on the 
//          weight of the package in pound. The program prompts the 
//          user to enter the weight of the package and it will 
//          display the shipping cost.
//******************************************************************

public class Costs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter the weight of the package : ");
		double weight = input.nextDouble();
		
		if(weight <=2 && weight > 0)
		System.out.println("The cost of shipping is RM2.5");
		
		else if(weight <=4 && weight > 2)
		System.out.println("The cost of shipping is RM4.5");
		
		else if(weight <=10 && weight > 4)
		System.out.println("The cost of shipping is RM7.5");
		
		else if(weight <=20 && weight > 10.)
		System.out.println("The cost of shipping is RM10.5");
		
		else
		System.out.println("The package cannot be shipped");

	}

}
