import java.util.Scanner ;

public class Stringmix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j =0;
		int k =0;
		int l =0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string : ");
		String st = input.next();
		int length = st.length();
		
		for (int i =0; i < length ; i++) {
			
			char ch = st.charAt(i);
		
			if(Character.isDigit(ch))
				j=j+1;
			
			else if (Character.isLetter(ch))
				k=k+1;
			
		}
		
		l=j+k;
		
		if (j==length)
			System.out.println("The string is digit");
		
		else if (k==length)
			System.out.println("The string is letter");
		
		else if (l==length)
			System.out.println("The string is mixed");
	
		
	}

}
