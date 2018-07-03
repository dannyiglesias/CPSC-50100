package Person;

public class personPay extends Person{
	public static void main(String[] args) {
		PaidAdvisor consultant = new PaidAdvisor();
		consultant.setNameRateHours(0, 0, consultant);
		consultant.calculatePay();
		System.out.println(consultant.toString());
	}

}
