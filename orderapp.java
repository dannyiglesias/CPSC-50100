package Flyers;
import java.util.Scanner;

public class orderapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double cost1=0, cost2=0, cost3=0, cost4=0;
	double totalcost=0;
	double tax=0.05;
	double ordertax=0;
	double finalcost=0;
	String[] itemArray = {"Burger", "Drink","Fries", "Dessert"};
	int[] itemNumber = {1, 2, 3, 4};
	int menuItem=0;
	int ordertype=0; //initializes order type Delivery or Pick-Up
	Scanner input = new Scanner(System.in);
	String other;
	String menuorder = null;
	String menuorder2 = null;
	String menuorder3 = null;
	String menuorder4 = null;



	//Questions customer on order type
	System.out.println("Thanks for dining with Flyers, will it be Pick-Up or Delivery? (Input 1 for Pick-Up and 2 for Delivery");
	ordertype = input.nextInt();
	
	//Checks for zipcode
	double zipcode = 0;
	double deliveryfee=0;
	if(ordertype==2) {
		System.out.println("Please enter your Zipcode to determine if you qualify for Delivery?");
		zipcode = input.nextDouble();
		if(zipcode <= 60450 && zipcode >= 60442) {
			System.out.println("Delivery is available for your area with a $5.00 Delivery Fee");
			deliveryfee = 5.00;
			}
		else if(zipcode==60451 || zipcode==60441) {
			System.out.println("Delivery is available for your area at an extra cost of $7.00");
			deliveryfee = 7.00;	
			}
		else if(zipcode >= 60452 || zipcode <= 60440) {
			System.out.println("I'm sorry we do not deliver to your zip code, would you like to place a Pick-Up order (Y or N)?");
			other = input.next();
			if(other.equals("N")) {
				System.out.println("Your order has been cancelled, thank you for contacting Flyers'");
				return;
			}
			else if(other.equals("Y")){
					System.out.println("Thank you for contacting Flyers, have a great day!");
				}
						
		}
				
	}
	else if(ordertype==1) {
		System.out.println("Please make your selections from out Take Out Menu Below: \nFor a Flyers' Burger: $4.50 (Type: Burger) " + "\nFor a Flyers' Drink: $1.50 (Type: Drink) " + "\nFor some Flyers' Fries: $2.50 (Type: Fries) " + "\nFor a Flyers' Dessert: $3.00 (Type: Dessert) ");
		menuItem = input.nextInt();
		for(int i=0; i<10; i++) {
			if(menuItem==1) {
				cost1 = 4.50;
			}
			else if (menuItem==2) {
				cost1 = 1.50;
			}
			else if (menuItem==3) { 
				cost1 = 2.50;
			}
			else if (menuItem==4) {
				cost1 = 3.00;
			}
			System.out.println("Would you like anything else with that? (Y or N)");
			String extra=null;
			extra = input.nextLine();
			if(extra.equals("Y")) {
				i++;
			}
			else if(extra.equals("N")) {
				break;
			}
		}
	}
	
	
	if(ordertype.equals("Delivery")) {
		System.out.println("Can I have your zipcode please?");
		zipcode = input.nextDouble();
	}
	else if(ordertype.equals("Pick-Up")) {
		for(i=0; i<10; i++) {
			
		}
		System.out.println("What would you like to order?" + "\nFor a Flyers' Burger: $4.50 (Type: Burger) " + "\nFor a Flyers' Drink: $1.50 (Type: Drink) " + "\nFor some Flyers' Fries: $2.50 (Type: Fries) " + "\nFor a Flyers' Dessert: $3.00 (Type: Dessert) ");
	}
	else if(ordertype.equals(null)){
		System.out.println("Please choose Pick-Up or Delivery");
	}
		
	//Checks for delivery fee
	double deliveryfee = 0;
	if(zipcode <= 60450 && zipcode >= 60442) {
	System.out.println("Delivery is available for your area with a $5.00 Delivery Fee");
	deliveryfee = 5.00;
	}
	else if(zipcode==60451 || zipcode==60441) {
	System.out.println("Delivery is available for your area at an extra cost of $7.00");
	deliveryfee = 7.00;	
	}
	else if(zipcode >= 60452 || zipcode <= 60440) {
	System.out.println("I'm sorry we do not deliver to your zip code, would you like to place a Pick-Up order (Y or N)?");
	other = input.next();
	}
	if(other.equals("N")) {
	System.out.println("Your order has been cancelled, thank you for contacting Flyers'");
	return;
	else if(other.equals("Y")) {
	}}
	
	System.out.println("What would you like to order?" + "\nFor a Flyers' Burger: $4.50 (Type: Burger) " + "\nFor a Flyers' Drink: $1.50 (Type: Drink) " + "\nFor some Flyers' Fries: $2.50 (Type: Fries) " + "\nFor a Flyers' Dessert: $3.00 (Type: Dessert) ");
	menuorder = input.next();   //use nextLine()
	//Prompts user for order
	if (menuorder.equals("Burger")) {
		cost1 = 4.50;
	}
	else if (menuorder.equals("Drink")) {
		cost1 = 1.50;
	}
	else if (menuorder.equals("Fries")) { 
		cost1 = 2.50;
	}
	else if (menuorder.equals("Dessert")) {
		cost1 = 3.00;
	}
	
	//Option to add another item to order
	System.out.println("Would you like anything else? (You can name the item or enter 'No' to complete your order)");
	menuorder2 = input.next();
	if (menuorder2.equals("No")) {
		ordertax = (cost1*tax);
		totalcost = (cost1 + ordertax + deliveryfee);
		System.out.printf("That brings your total including tax and delivery to $: %.2f", totalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
		return;
		}	
	else if(menuorder2.equals("Burger")) {
	    cost2 = 4.50;
		}
	else if (menuorder2.equals("Drink")) {
		cost2 = 1.50;
		}
	else if (menuorder2.equals("Fries")) { 
		cost2 = 2.50;
		}
	else if (menuorder2.equals("Dessert")) {
		cost2 = 3.00;
		}
	
	//Option to add another item to order
	System.out.println("Would you like anything else? (You can name the item or enter 'No' to complete your order)");
	menuorder3 = input.next();
	if (menuorder3.equals("No")) {
		ordertax = ((cost1+cost2)*tax);
		totalcost = (cost1 + cost2 + ordertax + deliveryfee);
		System.out.printf("That brings your total including tax and delivery to $: %.2f", totalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
	    return;
		}	
		else if(menuorder3.equals("Burger")) {
		cost3 = 4.50;
		}
		else if (menuorder3.equals("Drink")) {
		cost3 = 1.50;
		}
		else if (menuorder3.equals("Fries")) { 
		cost3 = 2.50;
		}
		else if (menuorder3.equals("Dessert")) {
		cost3 = 3.00;
		}
	
	//Option to add another item to order and final price calculations
	System.out.println("Would you like anything else? (You can name the item or enter 'No' to complete your order)");
	menuorder4 = input.next();
	if (menuorder4.equals("No")) {
		ordertax = ((cost1+cost2+cost3)*tax);
		totalcost = (cost1 + cost2 + + cost3 + ordertax + deliveryfee);
		System.out.printf("That brings your total including tax and delivery to $: %.2f", totalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
		}
		else if(menuorder4.equals("Burger")) {
		cost4 = 4.50;
		ordertax = ((cost1+cost2+cost3+cost4)*tax);
		totalcost = (cost1 + cost2 + cost3 + cost4);
		finalcost = (totalcost + ordertax);
		System.out.printf("That brings your total including tax and delivery to $: %.2f", finalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
		}
		else if (menuorder4.equals("Drink")) {
		cost4 = 1.50;
		ordertax = ((cost1+cost2+cost3+cost4)*tax);
		totalcost = (cost1 + cost2 + cost3 + cost4);
		finalcost = (totalcost + ordertax);
		//System.out.println("");
		System.out.printf("That brings your total including tax and delivery to $: %.2f", finalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
		}
		else if (menuorder4.equals("Fries")) { 
		cost4 = 2.50;
		ordertax = ((cost1+cost2+cost3+cost4)*tax);
		totalcost = (cost1 + cost2 + cost3 + cost4);
		finalcost = (totalcost + ordertax);
		System.out.printf("That brings your total including tax and delivery to $: %.2f", finalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
		}
		else if (menuorder4.equals("Dessert")) {
		cost4 = 3.00;
		ordertax = ((cost1+cost2+cost3+cost4)*tax);
		totalcost = (cost1 + cost2 + cost3 + cost4);
		finalcost = (totalcost + ordertax);
		System.out.printf("That brings your total including tax and delivery to $: %.2f", finalcost);
		System.out.println("\nYour order should arrive at your doorstep in 30 minutes or less, thank you for dining with Flyers'");
		}
		
	
	
		}
	}

	
	

		
		

