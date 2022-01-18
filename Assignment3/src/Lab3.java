import java.util.Scanner;

// Author’s name: ALIF ZUHAIRI BIN ZULKIFLI
// Matric number: 198489	
// Lab Group: 4
// Lab Assignment No: 3
	
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in); // create Scanner
		InventoryItem[] item =new InventoryItem[5]; // create an Array
		int nombor;
		String barang;

		
		System.out.println("Enter data for 5 inventory items");
		//Create a loop to enter 5 item
		for ( int i=0 ; i < 5 ; i++ ) {
			
			
		//Enter the description item
			System.out.print("\nEnter the description for item "+(i+1)+": ");
			barang= input.next();
		//Enter the units for the item
			System.out.print("Enter the units for item "+(i+1)+": ");
			nombor = input.nextInt();
			// send the information to the constructor
			
			item[i]=new InventoryItem(barang, nombor);
		}
	
	System.out.println("Inventory Item");
	//create the loop to print the result
	for ( int i=0 ; i < item.length ; i++ ) {
	System.out.println("item " +(i+1)+ "\t" + "Description : "+"\t"+ item[i].getDescription()+ "\t"+ "Units: "+ "\t" + item[i].getUnits());
	}
	
	}

}


class InventoryItem {
	
	private String description ;
	private int units ;
	
	//Constructor for the non argument
	InventoryItem(){
		description = " ";
		units = 0;
	}
	//constructor to accept the name for description
	InventoryItem(String d){
		description = d;
		units = 0;
		
    }
	//constructor to accept the description  and units
	InventoryItem(String d, int u){
		description = d;
		units = u;
	}
	
	//set new name for description

	//return the value for the description
	public String getDescription () {
		return description;
	}
	//return the number of units
	public int getUnits () {
		return units;
	}
	
	
}