import java.util.Scanner;
//Author’s name: ALIF ZUHAIRI BIN ZULKIFLI
//Matric number: 198489	
//Lab Group: 4
//Lab Assignment No: 12
public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] array = new int[8];
		
		System.out.print("Enter your number : ");
		
		for (int i =0; i < array.length; i++) {
			
			System.out.print((i+1)+".");
			array[i]= input.nextInt();
			
		}
		int number = array.length;
		System.out.println("OUTPUT :"); 
		System.out.println("Largest Element :" + findmax(array, number)); 
		System.out.println("Smallest Element :" +findmin(array, number)); 
	}



public static int findmax (int array[] , int number) {
	
	if (number == 1)
		return array[0];
	
	return Math.max(array[number-1], findmax(array, number-1));
	
}

public static int findmin (int array[] , int number) {
	
	if (number == 1)
		return array[0];
	
	return Math.min(array[number-1], findmin(array, number-1));
	
}


}