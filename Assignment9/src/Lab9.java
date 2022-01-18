import java.util.Scanner;
public class Lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//Your input will be the height and width for each object and your output will be the area of each object.
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		System.out.print("Enter the width: ");
		double width = input.nextDouble();
		
		Triangle tri = new Triangle(width,height);
		Square sq = new Square(width,height);
		
		System.out.println(sq.toString());
		System.out.println(tri.toString());
		// compare if two objects have the same area using equalArea() (refer to the example in the slides).
		if(tri.compareTo(sq) > 0)
		   	System.out.println("The Area of Triangle Bigger The Area of Square");
		else
		   	System.out.println("The Area of Square Bigger The Area of Triangle");
		
		sq.printSides();
		tri.printSides();
		sq.printObjectType();
		tri.printObjectType();
		

	}

}
//Create an abstract class called GeometricFigure
abstract class GeometricFigure {
	//private attribute called objectName
	 private String objectName() {
		return null;
		 
	 }
	 // Include an abstract method called findArea() to determine the area of the figure. 
	public abstract double findArea();


	}

	


class Square extends GeometricFigure implements SidedObject,ObjectType {
	private double width=1.0;
	  private double height=1.0;
	Square() {
	  }
	Square(double width, double height) {
		this.width = width;
	    this.height = height;
	  }

	  public void Square(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }

	  public double getWidth() {
	    return width;
	  }

	  public void setWidth(double width) {
	    this.width = width;
	  }
	  
	  public double getHeight() {
	    return height;
	  }

	  public void setHeight(double height) {
	    this.height = height;
	  }

	  public double getArea() {
	    return (height * width);
	  }
	  //Override the toString() method in the superclass to print the name and area of each geometric object.
	  public String toString() {
		  return ("The Area of the Square is "+getArea());
	  }
	  
	  static void printSides(){
			System.out.println ("The square has 4 sides");
			}
	  static void printObjectType(){
		  System.out.println ("The Object type is Square");
			
	  }
		

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Triangle extends GeometricFigure implements SidedObject,ObjectType {
	private double width=1.0;
	  private double height=1.0;
	 Triangle() {
	  }
	 public int compareTo(Square sq) {
		// TODO Auto-generated method stub
		return 0;
	}
	Triangle (double width, double height) {
			this.width = width;
		    this.height = height;
		  }

	  public void Triangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }

	  public double getWidth() {
	    return width;
	  }

	  public void setWidth(double width) {
	    this.width = width;
	  }
	  
	  public double getHeight() {
	    return height;
	  }

	  public void setHeight(double height) {
	    this.height = height;
	  }

	  public double getArea() {
	    return  0.5 * (height * width);
	  }
	  //Override the toString() method in the superclass to print the name and area of each geometric  object
	  public String toString() {
		  return ("The Area of the Triangle is "+getArea());
		  
	  }
	  static void printSides(){
			System.out.println ("The triangle has 3 sides");
			}
	  static void printObjectType(){
		  System.out.println ("The Object type is Triangle");
			
	  }

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	  }

class ComparableTriangle extends Triangle  implements Comparable {

    public ComparableTriangle(double width, double height) {
          super(width, height);
    }

    public int compareTo(Object o) {
       if (getArea() > ((ComparableTriangle)o).getArea())
          return 1;
       else 
           if (getArea() < ((ComparableTriangle)o).getArea())
              return -1;
           else
             return 0;
    }
} 
class ComparableSquare extends Triangle  implements Comparable {

    public ComparableSquare(double width, double height) {
          super(width, height);
    }

    public int compareTo(Object o) {
       if (getArea() > ((ComparableSquare)o).getArea())
          return 1;
       else 
           if (getArea() < ((ComparableSquare)o).getArea())
              return -1;
           else
             return 0;
    }
} 


