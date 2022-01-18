// Author’s name: Alif Zuhairi Bin Zulkifli
// Matric number: 198489
// Lab Group: 4
// Lab Assignment No: 8
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Class
		Person object1 = new Person();
		Student object2 = new Student();
		Employee object3 = new Employee();
		Faculty object4 = new Faculty();
		Staff object5 = new Staff();
		Admin object6 = new Admin();
		Lecturer object7 = new Lecturer();
		
		//Print the data
		System.out.println("********************");
		System.out.println("QUESTION 1");
		System.out.println(object1.toString());
		System.out.println(object2.toString());
		System.out.println(object3.toString());
		System.out.println(object4.toString());
		System.out.println(object5.toString());
		System.out.println("********************");
		System.out.println("QUESTION 2");
		
		//Casting
		Admin.PrintDetails(object6);
		Lecturer.PrintDetails(object7);
		
		
	}

}

class Person {
	String Name,Address,Email ;
	int PhoneNum;
	final String status=null;
	
	Person(){
		
	}
	//return the data
	public String toString() {
		return "Person class Alif";
	}
	
}

class Student extends Person{
	Student(){
		
	}
	//return the data
	public String toString() {
		return "Student1 class extends from Person class Alif";
	}
}

class Employee extends Person{
	String Office;
	double Salary;
	Employee(){
		
	}
	//return the data
	public String toString() {
		return "Employee1 class extends from Person class Alif";
	}
}

class Faculty extends Employee{
	double OfficeHour;
	String Rank;
	Faculty(){
		
	}
	//return the data
	public String toString() {
		return "Faculty class extends from Employee1 class extends from Person class Alif";
	}
	
}
class Staff extends Employee{
	String Title;
	Staff(){
		
	}
	//return the data
	public String toString() {
		return "Staff class extends from Employee1 class extends from Person class Alif";
	}
	
	
	//Casting
	 public static void PrintDetails(Object O){
		if ( O instanceof Admin) {
			System.out.println(O.toString());
			((Admin)O).returnValue();
		}
		else if ( O instanceof Lecturer) {
			System.out.println(O.toString());
			((Lecturer)O).returnValue();
		}
		
		 
	 }
	
}

class Admin extends Staff{
	Admin(){
		
	}
	//return the data
	public String toString() {
		return "Class Admin";
	}
	//return the data
	public void returnValue() {
	System.out.println("2222");
	}
}

class Lecturer extends Staff{
	private int room_no=377;
	private String subject= "Programming II";
	
	Lecturer(){
		
	}
	int getRoom() {
		return room_no;
	}
	String getSubject() {
		return subject;
	}
	public String toString() {
		return ("Room Number : " +getRoom()+"\nSubject :" + getSubject());
	}
	public void returnValue() {
		System.out.println("3333");
		}
	
}



