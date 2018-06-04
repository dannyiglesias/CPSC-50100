package week3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class elevators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentState=null;
		String currentFloor=null;
		String previousState=null;
		String previousFloor=null;
		String floorSelection=null;
		String[] floorArray = {"B", "1", "2", "B", "1", "2", "B", "1", "2","B", "1", "2","B", "1", "2","B", "1", "2","B", "1", "2","B", "1", "2"}; //floor the elevator is on
		int buttonPush=0; //0 is Basement, 1 is 1st Floor, 2 is 2nd Floor
		String[] stateArray = {"Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)","Opening(O)", "Closing(C)"}; //state of the elevator
		//String[] operateArray = {"2D", "D", "U", "2U"};  //when they push the buttons
		int[] pushArray = {0, 1, 2};//0 is Basement, 1 is 1st Floor, 2 is 2nd Floor
		//Random generator = new Random();//Random generator
		//int randomFloor = generator.nextInt(pushArray.length);//Selects Random floor from pushArray
		

		
		//Elevator on B doors O
		currentState = stateArray [0];//Elevator currently has doors open
		currentFloor = floorArray[0];//Elevator currently in Basement
			
		System.out.println("The Elevator doors are Open(O) and it is located on Floor: "+ currentFloor);
		for (int i=0; i<10; i++) {
			Random generator = new Random();//Random generator
			int randomFloor = generator.nextInt(pushArray.length);//Selects Random floor from pushArray
			if (randomFloor==0) {
				currentState = stateArray[i];
				currentFloor = floorArray[i];
				//previousState = stateArray[i];
				//previousFloor = floorArray[i+randomFloor*floorArray.length];
				System.out.println("The current Floor of "+currentFloor + " has been selected. The Elevator doors will remain Open, awaiting the next Floor selection...");
				//System.out.print(previousFloor);
			}
			
				if(randomFloor == 1) {
					currentState = stateArray[i+1];
					currentFloor = floorArray[i+1];
					//previousState = stateArray[i+0];
					//previousFloor = floorArray[i];
					System.out.println("Floor "+currentFloor + " has been selected. The Elevator doors are now Closing(C) and the Elevator is leaving for Floor "+ currentFloor + "\nTraveling...");
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at Floor "+currentFloor + " doors are now Opening(O)");
				}
					if(randomFloor == 2) {
						currentState = stateArray[i+1];
						currentFloor = floorArray[i+2];
						//previousState = stateArray[i+0];
						//previousFloor = floorArray[i];
						System.out.println("Floor "+currentFloor + " has been selected. The Elevator doors are now Closing(C) and the Elevator is leaving for Floor "+ currentFloor + "\nTraveling...");
						try {
							//wait 3 seconds
							Thread.sleep(3000);
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arriving at Floor "+currentFloor + " doors are now Opening(O)");
					}
					try {
						//wait 5 seconds
						Thread.sleep(5000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}		
				
				}
				
			}

			
	}
			
		
	
		
				
		
	


