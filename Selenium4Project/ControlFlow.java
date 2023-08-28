package test;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean isCold = true;
		
		if(isCold) {
			
			System.out.println("Its cold, wear a cold");
		}
		
		/*
		boolean isLightGreen = true;
		
		if(isLightGreen) {
			
			double carSpeed = 100; //km/s
			System.out.println("Drive the Car!");
			System.out.println("Speed of the car is "+ carSpeed);
			
		}
		else
		{
			System.out.println("Wait for the light to turn Green!");
		}
		*/
		
		boolean isRaining= true;
		
		if(isRaining){
		    System.out.println("Windshield wipers on.");
		    
		}

		boolean isRecyclable = true;
		if(isRecyclable) {
			double weight =13.5;
			System.out.println("This is Recyclable");
			System.out.println("Weighs "+weight+ " Ounces");
		}
	
		boolean isLightGreen = false;
		boolean isLightYellow = true;
		
		if(isLightGreen) {
			System.out.println("Drive!");
			
		}
		else if(isLightYellow)
		{
			System.out.println("Slow-Down!");
		}
		
		else
		{
			System.out.println("STOP!");
		}
		
		int ticketPrice = 10;
		int age=25;
		boolean isStudent= true;
		
		/*
		if(age <= 15) {
			ticketPrice = 5;
		}
		//System.out.println(ticketPrice);
		
		else if(age >60) {
			ticketPrice = 5;
		}
		//System.out.println(ticketPrice);
		
		else if(isStudent) {
			ticketPrice = 5;
		}
		System.out.println(ticketPrice);
		*/
		
		if(age <= 15||age>60 || isStudent) {
			ticketPrice = 5;
		}
		System.out.println(ticketPrice);
		
		boolean passport= false;
		boolean birthCertificate = false;
		boolean driversLicense = false;
		
		if(passport) {
			System.out.println("A passport is a valid Passport");
		}
		else if(birthCertificate) {
			System.out.println("The Birth certificate is valid");
		}
		else if(driversLicense) {
			System.out.println("The Drives License is valid");
		}
		else {
			System.out.println("Invalid ID, your applications is denied");
		}
	}	
	}
