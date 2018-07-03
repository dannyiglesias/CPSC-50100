import java.util.Scanner;

class gcdException extends Exception{
	gcdException(int value){}
	}

class GCD {
	public static int gcd(int a, int b) 
	{
		if (a == 0 || b == 0) 
			return 0;
		if (a == b) 
			return a; 
		if (a > b) // If first number is greater than second number
			return gcd(a-b, b); // recursive calling function
		return gcd(a, b-a); // recursive calling function
	}

	public static void main(String[] args)
	{
		try
		{
			int num1,num2,value; 
			System.out.print("Enter two positive integers: ");
			Scanner input = new Scanner(System.in);
			num1=input.nextInt();
			num2=input.nextInt();
			value = gcd(num1, num2); // calling function
			if(value==1){
				throw new gcdException(value); // throw an exception
			}
			else{
				System.out.println("GCD of "+num1+" and "+num2+" is "+value);
			}
		}

		catch (gcdException d) // catch the exception
		{
			System.out.print("GCD is 1\n");
		}

	}

}
