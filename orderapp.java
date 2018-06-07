import java.util.Scanner;

public class order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//double cost1=0, cost2=0, cost3=0, cost4=0;
	//double totalcost=0;
	double tax=0.05;
	double finalcost=0;
	int menuItem=0;
	int ordertype=0; //initializes order type Delivery or Pick-Up
	Scanner input = new Scanner(System.in);
	String other;
	

	double cost=0;
	double sum = 0;


	//Questions customer on order type
	System.out.println("Thanks for dining with Flyers, will it be Pick-Up or Delivery? (1 for Pick-Up and 2 for Delivery)");
	ordertype = input.nextInt();
	
	//Checks for zipcode
	double zipcode = 0;
	double deliveryfee=0;
	double totalcost = 0;
	if(ordertype==2) {
		System.out.println("Please enter your Zipcode to determine if you qualify for Delivery?");
		zipcode = input.nextDouble();
		if(zipcode <= 60450 && zipcode >= 60442) {
			System.out.println("Delivery is available for your area with a $5.00 Delivery Fee");
			deliveryfee = 5.00;
			System.out.println("Please make your selections from our Take out Menu: ");
			for(int i=0; i<10; i++) {
				String add=null;
				System.out.println("For a Flyers' Burger: $4.50 (Type: 1) " + "\nFor a Flyers' Drink: $1.50 (Type: 2) " + "\nFor some Flyers' Fries: $2.50 (Type: 3) " + "\nFor a Flyers' Dessert: $3.00 (Type: 4) ");
				menuItem = input.nextInt();
				if(menuItem==1) {
					cost = 4.50;
				}
				else if (menuItem==2) {
					cost = 1.50;
				}
				else if (menuItem==3) { 
					cost = 2.50;
				}
				else if (menuItem==4) {
					cost = 3.00;
				}		
				
				sum = sum+cost;	
				totalcost = sum+(sum*tax);
				finalcost = totalcost + deliveryfee;
				System.out.println("Would you like to add anything else to your order? (Y or N)");
				add = input.next();
				if(add.equals("N")){
					break;
				}
				else if(add.equals("Y")){
					System.out.println("What else would you like: ");
				}
			}
			
			System.out.println("Your total comes to $"+finalcost+" including tax and delivery \nand will be ready in about 15 minutes.  \nThank you for choosing Flyers!");		
		}

			
		else if(zipcode==60451 || zipcode==60441) {
			System.out.println("Delivery is available for your area at an extra cost of $7.00");
			deliveryfee = 7.00;
			String add = null;
			System.out.println("Please make your selections from our Take out Menu: ");
			for(int i=0; i<10; i++) {
				System.out.println("For a Flyers' Burger: $4.50 (Type: 1) " + "\nFor a Flyers' Drink: $1.50 (Type: 2) " + "\nFor some Flyers' Fries: $2.50 (Type: 3) " + "\nFor a Flyers' Dessert: $3.00 (Type: 4) ");
				menuItem = input.nextInt();
				if(menuItem==1) {
					cost = 4.50;
				}
				else if (menuItem==2) {
					cost = 1.50;
				}
				else if (menuItem==3) { 
					cost = 2.50;
				}
				else if (menuItem==4) {
					cost = 3.00;
				}		
				
				sum = sum+cost;	
				totalcost = sum+(sum*tax);
				finalcost = totalcost + deliveryfee;
				System.out.println("Would you like to add anything else to your order? (Y or N)");
				add = input.next();
				if(add.equals("N")){
					break;
				}
				else if(add.equals("Y")){
					System.out.println("What else would you like: ");
				}
			}
			
			System.out.println("Your total comes to $"+finalcost+" including tax and delivery \nand will be ready in about 15 minutes.  \nThank you for choosing Flyers!");		
		}
			
		else if(zipcode >= 60452 || zipcode <= 60440) {
			System.out.println("I'm sorry we do not deliver to your zip code, would you like to place a Pick-Up order (Y or N)?");
			other = input.next();
			if(other.equals("N")) {
				System.out.println("Your order has been cancelled, thank you for contacting Flyers'");
				return;
			}
			else if(other.equals("Y")){
				String add = null;
				System.out.println("Please make your selections from our Take out Menu: ");
				for(int i=0; i<10; i++) {
					System.out.println("For a Flyers' Burger: $4.50 (Type: 1) " + "\nFor a Flyers' Drink: $1.50 (Type: 2) " + "\nFor some Flyers' Fries: $2.50 (Type: 3) " + "\nFor a Flyers' Dessert: $3.00 (Type: 4) ");
					menuItem = input.nextInt();
					if(menuItem==1) {
						cost = 4.50;
					}
					else if (menuItem==2) {
						cost = 1.50;
					}
					else if (menuItem==3) { 
						cost = 2.50;
					}
					else if (menuItem==4) {
						cost = 3.00;
					}		
					
					sum = sum+cost;	
					totalcost = sum+(sum*tax);
					finalcost = totalcost + deliveryfee;
					System.out.println("Would you like to add anything else to your order? (Y or N)");
					add = input.next();
					if(add.equals("N")){
						break;
					}
					else if(add.equals("Y")){
						System.out.println("What else would you like: ");
					}
				}
				
				System.out.println("Your total comes to $"+finalcost+" including tax \nand will be ready in about 15 minutes.  \nThank you for choosing Flyers!");	
			}

		}
	}					
	
	else if(ordertype==1) {
		String add = null;
		System.out.println("Please make your selections from our Take out Menu: ");
		for(int i=0; i<10; i++) {
			System.out.println("For a Flyers' Burger: $4.50 (Type: 1) " + "\nFor a Flyers' Drink: $1.50 (Type: 2) " + "\nFor some Flyers' Fries: $2.50 (Type: 3) " + "\nFor a Flyers' Dessert: $3.00 (Type: 4) ");
			menuItem = input.nextInt();
			if(menuItem==1) {
				cost = 4.50;
			}
			else if (menuItem==2) {
				cost = 1.50;
			}
			else if (menuItem==3) { 
				cost = 2.50;
			}
			else if (menuItem==4) {
				cost = 3.00;
			}		
			
			sum = sum+cost;	
			totalcost = sum+(sum*tax);
			finalcost = totalcost + deliveryfee;
			System.out.println("Would you like to add anything else to your order? (Y or N)");
			add = input.next();
			if(add.equals("N")){
				break;
			}
			else if(add.equals("Y")){
				System.out.println("What else would you like: ");
			}
		}
		
		System.out.println("Your total comes to $"+finalcost+" including tax \nand will be ready in about 15 minutes.  \nThank you for choosing Flyers!");	
	}
	}
}
	
		
		

