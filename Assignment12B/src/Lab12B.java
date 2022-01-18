import java.util.Scanner;
//Author’s name: ALIF ZUHAIRI BIN ZULKIFLI
//Matric number: 198489	
//Lab Group: 4
//Lab Assignment No: 12
public class Lab12B {
    public static void main(String[]args){
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :  ");
        number = input.nextInt();
            if(number==0){
                System.out.print("NUMBER TO WORD: ZERO");
            } 
            else {
                System.out.print("NUMBER TO WORD: ");
                System.out.print(numToNames(((number / 100) % 10)));
                System.out.print(numToNames((number % 100)));
            }
    }    
    
    public static String numToNames(int n){
        String Array[] = {" Zero", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine"};
        if (n > 9) {
        	numToNames (n/10);
            return (Array[n / 10] + " " + Array[n % 10]);
        } 
        else {
            return(Array[n]);
        }         
    }
}