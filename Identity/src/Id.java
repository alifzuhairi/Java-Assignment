import java.util.Scanner;
public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter an identification Number in format XXXXXX-XX-XXXX : ");
		String Id = scanner.nextLine();
		
		if (Id.matches ("\\d\\d\\d\\d\\d\\d-\\d\\d-\\d\\d\\d\\d"))
		
		System.out.println("The identification card is valid");
		
		
		else 
			
			System.out.println("The identification card is invalid");
		
	}

}
