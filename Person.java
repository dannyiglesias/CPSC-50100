package Person;

public class Person 
{
	private String firstName; //store the first name
	private String lastName;  //store the last name
	
	public Person()           //Default constructor
	{         
		firstName = "";
		lastName = "";
	}							
	public Person(String first, String last)  //Constructor with parameters
	{
		setName(first, last);
	}							
	public String toString()    //Method to output the first name and last name
	{
		return (firstName + " " + lastName); 
	}							

	public void setName(String first, String last)  //Method to set firstName and lastName
	{
		firstName = first;
		lastName = last;
	}							

	public String getFirstName() //Method to return the firstName
	{
		return firstName;
	}							

	public String getLasttName() //Method to return the lastName
	{
		return lastName;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
