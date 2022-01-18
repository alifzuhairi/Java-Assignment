import java.util.Scanner;

//Author’s name: ALIF ZUHAIRI BIN ZULKIFLI
//Matric number: 198489	
//Lab Group: 4
//Lab Assignment No: 4

public class Lab4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int number = 0;
		
		//enter number of scores
		System.out.print("Enter number of test scores: "); 
		number = input.nextInt();

		//create array 
		double[] Array = new double[number];

		//enter scores
		for (int i=0; i<number ; i++){ 
			System.out.print("Enter test score " + (i + 1)+ ": ");
			Array[i] = input.nextDouble(); 
			try {
				//pass to TestScore class
				TestScores test = new TestScores(Array[i]);
			}
			catch (IllegalArgumentException ex) {
				System.out.println(ex);
				i--;
			}
		}  

		TestScores test = new TestScores(Array);
		System.out.println("Average: "+test.getAverage(Array));
	}
}

class TestScores{ 
	double[] Array; //create array for scores
	int i=0; 
	
	//constructor 
	TestScores(double test) throws IllegalArgumentException{ 
	if (test > 0 && test < 100) {
		//assign value of Array 
	}
	else 
		//throw IllegalArgument Exception
		throw new IllegalArgumentException("\nThe test score is negative or greater than 100");
	}
 
	//constructor for array 
	TestScores(double[] test) {
		Array= new double[test.length];
	}
 
	//get method that returns the average of the test scores
	double getAverage(double[] test){
		double sum=0.0; 
		for(int i=0 ; i<test.length ; i++) {
			Array[i]=test[i];
		}
		for (int i=0; i < Array.length; i++){
			sum += Array[i]; //sum up all array
		}
		return (sum / Array.length); //returns the average of the test scores
	}
}

/**public class InvalidTestScore extends Exception {
	private double score;

	//Construct exception 
	public InvalidTestScore(double newScore) {
		super("Invalid test score " + newScore);
		this.score = newScore;
	} 
	public double getScore() {
		return score;
	}
}*/
