import java.util.Scanner;
//************************************************************************
//Name : Alif zuhairi Bin Zulkifli
//Matric Number : 198489
//DateFinish : 9 October 2018
//Program : This program is used to calciulate the total marks obtained
//        by the student . In order to calculate the total marks , 
//        the lecturer need to input the marks obtained by each 
//        student for the first test , second test , assignment 1,2,3 
//        , final exam , grade and cgpa
//************************************************************************
public class Totalmark {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
         String grade;
         double gpa = 0;
		System.out.println("                                       COMPUTER PROGRAMMING 1                                          ");
		System.out.println("                                               (SKK3100)                                                ");
		System.out.println("**************************************MARKS EVALUATION APPLICATION**************************************");
		System.out.println("PLEASE ENTER MARKS:-");
		System.out.print("       FIRST TEST : ");
		double mark1 = scanner.nextDouble();
		System.out.print("     SECOND TEST : ");
		double mark2 = scanner.nextDouble();
		System.out.print("   ASSIGNMENT 1 : ");
		double markA1 = scanner.nextDouble();
		System.out.print("   ASSIGNMENT 2 : ");
		double markA2 = scanner.nextDouble();
		System.out.print("   ASSIGNMENT 3 : ");
		double markA3 = scanner.nextDouble();
		System.out.print("FINAL EXAMINATION : ");
		double markF = scanner.nextDouble();System.out.printf("%60s\n","CALCULATED MARKS");
		System.out.printf("%s%14s%7s%7s%7s%14s%13s%8s%8s%6s\n","FIRST TEST","SECOND TEST","ASS1","ASS2","ASS3","ASSIGNMENTS","FINAL EXAM","TOTAL","GRADE","GPA");
double percentagefirsttest = 20 * (mark1/50);
		double percentagesecondtest = 20 * (mark2/50);
		double percentageassignment = 30 * ((markA1 + markA2 + markA3)/150);
		double percentagefinal = 30 * (markF/100);
		double totalmark = percentagefirsttest + percentagesecondtest + percentageassignment + percentagefinal;
		if (totalmark >= 80) 
		{
	grade ="A";
		}
else if(totalmark >= 75 && totalmark < 80)
{
	grade ="A-";
}
else if (totalmark >= 70 && totalmark < 75)
{
	grade ="B+";
}
else if (totalmark >= 65 && totalmark < 70)
{
	grade ="B";
}
else if (totalmark >= 60 && totalmark < 65)
{
	grade ="B-";
}
else if (totalmark >= 55 && totalmark < 60)
{
	grade ="C+";
}
else if (totalmark >= 50 && totalmark < 55)
{
	grade ="C";
}
	else if (totalmark >= 47 && totalmark < 50)
	{
		grade ="C-";
	}
		else if (totalmark >= 44 && totalmark < 47)
		{
			grade ="D+";
		}
			else if (totalmark >= 40 && totalmark < 44)
			{
				grade ="D";
			}
				else {
					grade ="F";
				}
		
		if ( grade == "A" ) {
			gpa = 4.00;
		}
		else if (grade == "A-") {
		    gpa = 3.75;
		}
		else if (grade == "B+") {
		    gpa = 3.50;
		}
		else if (grade == "B") {
		    gpa = 3.00;
		}
		else if (grade == "B-") {
		    gpa = 2.75;
		}
		else if (grade == "C+") {
		    gpa = 2.50;
		}
		else if (grade == "C") {
		    gpa = 2.00;
		}
		else if (grade == "C-") {
		    gpa = 1.75;
		}
		else if (grade == "D+") {
		    gpa = 1.50;
		}
		else if (grade == "D") {
		    gpa = 1.00;
		}
		else if (grade == "F") {
		    gpa = 0;
		}
		System.out.println("__________________________________________________________________________________________________________________");
		System.out.printf("%.1f(%.2f%%)",mark1,percentagefirsttest);
		System.out.printf("%5.1f(%.2f%%)",mark2,percentagesecondtest);
		System.out.printf("%6.1f",markA1);
		System.out.printf("%7.1f",markA2);
		System.out.printf("%7.1f",markA3);
		System.out.printf("%7.1f",(markA1+markA2+markA3));
		System.out.printf("(%.2f%%)",percentageassignment);
		System.out.printf("%6.1f",markF);
		System.out.printf("%14.2f%%",totalmark);
		System.out.printf("%3.1s",grade);
		System.out.printf("%11.2f",gpa);
}
}