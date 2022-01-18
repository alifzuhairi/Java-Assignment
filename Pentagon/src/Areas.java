import java.util.Scanner;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		double area,length,lengths;
		final double PI = 3.14159;
		
		System.out.print("Enter the length from the center to a vertex : ");
		lengths = input.nextDouble();
		
		length = 2*lengths*Math.sin(PI/5);
		
		area=((5*length*length)/(4*Math.tan(PI/5)));
		
		System.out.println("The area of the pentagon is " + area );

	}

}
