// Author’s name: Alif Zuhairi Bin Zulkifli
// Matric number: 198489
// Lab Group: 4
// Lab Assignment No: 2

public class Lab2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Rectangle segi = new Rectangle();
    System.out.println("The rectangle object using a no-arg constructor");
    System.out.println("The width of the object is "+ segi.width);
    System.out.println("The height of the object is "+ segi.height);
    System.out.println("The area of the object is "+ segi.getArea());
    System.out.println("The Perimeter of the object is "+ segi.getPerimeter());
	
    System.out.println("");
    Rectangle segi1 = new Rectangle(3.5 , 35.9);
    System.out.println("The rectangle object using a argument constructor");
    System.out.println("The width of the object is "+ segi1.width);
    System.out.println("The height of the object is "+ segi1.height);
    System.out.println("The area of the object is "+ segi1.getArea());
    System.out.println("The Perimeter of the object is "+ segi1.getPerimeter());
	
	
	
	}

}

class Rectangle {
	//The height and width of the rectangle
	double height=1.0;
	double width=1.0;
	
	//the constructor of the rectangle object without argument
	Rectangle(){
		
	}
	//the constructor of the rectangle object with argument
	Rectangle(double newheight , double newwidth){
		height = newheight;
		width = newwidth;
	}
	
	//return the area of the object
	 double getArea() {
		 return width*height;
		 
	 }
	 //return the perimeter of the object
	 double getPerimeter() {
		 return 2*(width+height);
	 }
	
}
