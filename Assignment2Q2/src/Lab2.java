// Author’s name: Alif Zuhairi Bin Zulkifli
// Matric number: 198489
// Lab Group: 4
// Lab Assignment No: 2

import java.io.*;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Create a scanner for this program
		Scanner input = new Scanner(System.in);
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		//make a declaration
	
		//Create an array for the student
		Student[] stu =new Student[4];
		//Make a loop for 4 student to enter 
		for (int x=0; x<stu.length;x++){
			
			stu[x]=new Student();
			
			System.out.print("Enter Student ID: ");
			stu[x].idStudent= input.nextInt();
			
			System.out.print("Enter Name: ");
			stu[x].name = input.next();
			
			System.out.print("Enter Department: ");
			stu[x].department = br.readLine();
			
			System.out.print("Enter Classification: ");
			stu[x].classification = br.readLine();		
			}		
		
		
		//print the student ID , Name , department and classification
		System.out.print("Id Student \t Name \t Department \t Classification \n");

		//Create a loop to print the output
		for (int x=0;x< stu.length;x++){
			System.out.print(stu[x].getIdStudent()+"\t");
			System.out.print(stu[x].getName()+"\t");
			System.out.print(stu[x].getDepartment()+"\t");
			System.out.print(stu[x].getClassification()+"\t\n");	
		}
		input.close();
	}
}


class Student{
	
	int idStudent;
	String name;
	String department;
	String classification;
	
	//Create the constructor for argument
	Student(int newIdStudent,String newName,String newDepartment,String newClass){
		idStudent = newIdStudent;
		name = newName;
		department = newDepartment;
		classification = newClass;
	}
	//Return the student ID
	int getIdStudent() {
		return idStudent;
	}
	//Return the student's classification
	String getClassification() {
		return classification;
	}
	//Return the student's department
	String getDepartment() {
		return department;
	}
	//Return the student's name
	String getName() {
		return name;
	}

	//Create the constructor for non-arg
	Student(){
	}
	
	

}
