import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
	
		System.out.print("Enter your message : "); 
        String st1 = input.nextLine();
		System.out.print("Enter 1 to continue , Enter 0 to stop : ");
		int st9=1;
		st9 = input.nextInt();
		
	
		
	    System.out.println("1 : A character at a psecified index");
		System.out.println("2 : Compare the string with new string");
		System.out.println("3 : Identify how many characters in the string");
		System.out.println("4 : Count number of letters in the string");
		System.out.println("5 : Count number of digits in the string");
		System.out.println("6 : Change any lowercase letter into uppercase letter and vice versa");
		System.out.println("7 : Replace any character in the string with a new character");
		System.out.println("8 : Delete any character or substring in the string");
		System.out.println("9 : Insert any character or string into the string");
		
		System.out.println("");
		
		while (st9!=0) {
			
		
        System.out.print("\nChoose your number : ");
		int menunumber = input.nextInt();
		
		if (menunumber == 1 ) {
			System.out.print("Enter any index : ");
			int index = input.nextInt();
			char ch = st1.charAt(index);
			System.out.println("The index is" +" " + ch);
		}
		
		else if (menunumber == 2 ) {
			System.out.print("Enter a new string : ");
			String st2 = input.next();
			
			if (st2.equals(st1))
				System.out.println("Equal");
				else
					System.out.println("Not equal");
		}
		
		else if (menunumber == 3 ) {
		System.out.println ("The length of " + st1 + " is " + st1.length());

		}
		
		else if (menunumber == 4 ) {
		
			int sum1 = 0;
			for (int i =0; i < st1.length(); i++) {
				char ch1 = st1.charAt(i);
			if (Character.isLetter(ch1))
				sum1 = sum1+1;
			}
				System.out.println("The number of the letter in the string is " + sum1);
		}
		
		else if (menunumber == 5 ) {
		
			int sum2 = 0;
			
			for (int i =0; i < st1.length(); i++) {
				char ch1 = st1.charAt(i);
			if (Character.isDigit(ch1))
				sum2 = sum2+1;
			}
				System.out.println("The number of the digit in the string is " + sum2);
			
		}
		
		else if (menunumber == 6 ) {
			
			for (int i =0; i < st1.length(); i++) {
				char ch1 = st1.charAt(i);
			
			if (Character.isUpperCase(ch1))
				System.out.print(Character.toLowerCase(ch1));
			else if (Character.isLowerCase(ch1))
				System.out.print(Character.toUpperCase(ch1));
			}
		}
		
		else if (menunumber == 7 ) {
		
			
			System.out.print("Enter a new character : ");
			String st3 = input.next();
			char ch1 = st3.charAt(0);
			
			System.out.print("Enter any character in the string : ");
			String st4 = input.next();
			char ch2 = st4.charAt(0);
			
			for (int i = 0 ; i < st1.length() ; i++ ) {
				char ch3 = st1.charAt(i);
			if ( ch3 == ch2)
				ch3=ch1;
			System.out.print(ch3);
			
			}
		

			
		}
		
		else if (menunumber == 8 ) {
			

			System.out.print("Enter any character in the string : ");
			String st4 = input.next();
			char ch2 = st4.charAt(0);
			
			for (int i = 0 ; i < st1.length() ; i = i+1 ) {
				char ch3 = st1.charAt(i);
			if ( ch3 == ch2)
				ch3=0;
			System.out.print(ch3);
			
			}

			
		}
		
		else if (menunumber == 9 ) {
		

			System.out.print("Enter any new string or character : ");
			String st5 = input.next();
			
			String st6 = st1.concat(st5);
			 System.out.println(st6);
			
			
		}
		
		
		System.out.print("\nEnter 1 to continue , Enter 0 to stop : ");
		st9 = input.nextInt();
		}
		
	
		
	}
		

}
