package Person;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaidAdvisor extends Person{
	private static double regularPayRate, specialPayRate, overtimePayRate, payment = 0;
	private static int totalHours, specialHours;
	private static String fname,lname,special;
	private static Person p;
	private static Object overtimeHours;
	
	PaidAdvisor(double regularPayRate, double specialPayRate, double overtimePayRate, int totalHours, int specialHours){
		super(fname,lname);
		PaidAdvisor.regularPayRate = regularPayRate;
		PaidAdvisor.specialPayRate = specialPayRate;
		PaidAdvisor.overtimePayRate = overtimePayRate;
		PaidAdvisor.totalHours = totalHours;
		PaidAdvisor.specialHours = specialHours;
	}

	PaidAdvisor() {
	}

	public double getPayRate() {
		Scanner sc = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.println("Would you like to know the regular, special, or overtime pay rate? (Type R for Regular, S for Special, or O for Overtime): ");
			System.out.print("R/O: ");
			input = sc.nextLine();
			if(input.equals("R")) {
				return regularPayRate;
			}
			else if(input.equals("S")) {
				return specialPayRate;
			}

			else if(input.equals("O")){
				return overtimePayRate;
			}

			else {
				System.out.println("Not a valid selection");
			}

		}

	}

	public void setNameRateHours(int totalHours, int specialHours, Object overtimeHours) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the consultant's first name: ");
		fname = sc.nextLine();
		System.out.print("Enter the consultant's last name: ");
		lname = sc.nextLine();
		p = new Person(fname,lname);
		double regularPayRate = 25; 
		double specialPayRate = 50; 
		double overtimePayRate = 25*1.5;
		System.out.print("Enter the total hours worked: ");
		totalHours = Integer.parseInt(sc.nextLine());
		System.out.println("Did this consultant work for a special session? (Y or N)");
		special = sc.nextLine();
		if(special.equals("Y")) {
			System.out.print("Enter the total special hours worked at a rate of $"+specialPayRate +":");
			specialHours = Integer.parseInt(sc.nextLine());
		}
		else if(special.equals("N")) {
			specialHours = 0;
		}
		else if(special.equals("")) {
			System.out.print("That was an invalid selection");
			specialHours = 0;
		}
		PaidAdvisor.regularPayRate = regularPayRate;
		PaidAdvisor.specialPayRate = specialPayRate;
		PaidAdvisor.overtimePayRate = overtimePayRate;
		PaidAdvisor.totalHours = totalHours;
		PaidAdvisor.specialHours = specialHours;
		PaidAdvisor.overtimeHours = overtimeHours;
	}
	
	public void calculatePay() {
		double regularHours = totalHours-specialHours;
		double overtimeHours = 0;
		if(regularHours>30) { 
			overtimeHours = regularHours - 30;
		}
		else if(regularHours<30){
			overtimeHours = 0;
		}
		payment = regularHours*regularPayRate + specialHours*specialPayRate + overtimeHours*overtimePayRate;
	}
	
	public int getHoursWorked() {
		return totalHours;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "Total payment due based on hours worked for "+p.getFirstName()+" "+p.getLasttName() + " is: $"+df.format(payment);
		
	}

}

