import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner (System.in);
        

		System.out.print("Enter an integers between 100 and 999 : ");
		int integer = scanner.nextInt();
		
		int digit1 = integer % 10 ;
	    int digit2 = integer / 10 % 10 ; 
	    int digit3 = integer /10 / 10 ;
	    int multiplesofthreedigits = digit1 * digit2 * digit3;
	    System.out.println("The product of three digit is " + multiplesofthreedigits);
	    
		
	}

}
