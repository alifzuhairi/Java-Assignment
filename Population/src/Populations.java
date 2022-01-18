import java.util.Scanner;
public class Populations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int currentpopulation = 312032486;
		int birth = 7;
		int death = 13;
		int immigrant = 45;
		int year = 31536000;
		int increasingbirth = year / birth ;
		int increasingdeath = year / death ;
		int increasingimmigrant = year / immigrant;
		int totalincrease = increasingbirth - increasingdeath + increasingimmigrant;
		int populations = currentpopulation + totalincrease ;
			
		System.out.println("First year population is " + (currentpopulation + totalincrease ));
		System.out.println("Second year population is " + (currentpopulation + totalincrease * 2 ));
		System.out.println("Third year population is " + (currentpopulation + totalincrease * 3 ));
		System.out.println("Fouth year population is " + (currentpopulation + totalincrease * 4 ));
		System.out.println("Fifth year population is " + (currentpopulation + totalincrease * 5));
	}
}
