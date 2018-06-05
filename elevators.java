package week3;

import java.util.Random;

public class elevators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pushArray = {0,1,2};
		String[] floorArray = {"Basement Floor", "1st Floor", "2nd Floor"};
		String[] eTravel = {"Traveling Down 2 Floors", "Traveling Down 1 Floor", "Staying on this Floor", "Traveling Up 1 Floor", "Traveling Up 2 Floors"};
		int elevatorFloor = 0;
		String DistanceTraveled = null;
		Random generator = new Random();//Floor selection is generated at Random using the Random Generator with the pushArray
		int randomButtonPush = 0;
		
		for(int i=0; i<10; i++) {
			while(elevatorFloor==0) {
				randomButtonPush = generator.nextInt(pushArray.length);
				if(randomButtonPush==0) {
					DistanceTraveled = eTravel[2];
					elevatorFloor = 0;
					System.out.println("Elevator is located on the "+floorArray[0] + "\nThe Elevator will be "+ DistanceTraveled);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				else if(randomButtonPush==1) {
					DistanceTraveled = eTravel[3];
					elevatorFloor = 1;
					System.out.println("Elevator is located on the "+floorArray[0] + "\nThe Elevator will be " + DistanceTraveled + " to the " + floorArray[1]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at the " + floorArray[1]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				else if(randomButtonPush==2) {
					DistanceTraveled = eTravel[4];
					elevatorFloor = 2;
					System.out.println("Elevator is located on the "+ floorArray[0] + "\nThe Elevator will be " + DistanceTraveled + " to the " + floorArray[2]);
					try {
						//wait 4 seconds
						Thread.sleep(4000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at the " + floorArray[2]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("=================================================================================");
			}
			while(elevatorFloor==1) {
				randomButtonPush = generator.nextInt(pushArray.length);
				if(randomButtonPush==0) {
					DistanceTraveled = eTravel[1];
					elevatorFloor = 0;
					System.out.println("Elevator is located on the "+floorArray[1] + "\nThe Elevator will be "+ DistanceTraveled + " to the " + floorArray[0]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at the " + floorArray[0]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				else if(randomButtonPush==1) {
					DistanceTraveled = eTravel[2];
					elevatorFloor = 1;
					System.out.println("Elevator is located on the "+floorArray[1] + "\nThe Elevator will be " + DistanceTraveled);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					
				}
				else if(randomButtonPush==2) {
					DistanceTraveled = eTravel[3];
					elevatorFloor = 2;
					System.out.println("Elevator is located on the "+ floorArray[1] + "\nThe Elevator will be " + DistanceTraveled + " to the " + floorArray[2]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at the " + floorArray[2]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("=================================================================================");
			}
			while(elevatorFloor==2) {
				randomButtonPush = generator.nextInt(pushArray.length);
				if(randomButtonPush==0) {
					DistanceTraveled = eTravel[0];
					elevatorFloor = 0;
					System.out.println("Elevator is located on the "+floorArray[2] + "\nThe Elevator will be "+ DistanceTraveled + " to the " + floorArray[0]);
					try {
						//wait 4 seconds
						Thread.sleep(4000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at the " + floorArray[0]);
				}
				else if(randomButtonPush==1) {
					DistanceTraveled = eTravel[1];
					elevatorFloor = 1;
					System.out.println("Elevator is located on the "+floorArray[2] + "\nThe Elevator will be " + DistanceTraveled + " to the " + floorArray[1]);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Arriving at the " + floorArray[1]);
					
				}
				else if(randomButtonPush==2) {
					DistanceTraveled = eTravel[2];
					elevatorFloor = 2;
					System.out.println("Elevator is located on the "+ floorArray[2] + "\nThe Elevator will be " + DistanceTraveled);
					try {
						//wait 2 seconds
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("=================================================================================");
			}
			
		}
		
		
	}

}
