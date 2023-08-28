package test;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		boolean action = true;
		boolean romance = true;
		boolean horror = false;
		boolean comedy = true;
		
		/*
		if(action && romance && (horror || comedy)) {
			System.out.println("Movie selected for watch");
		}
		//
		//Nested If statement
		if(action && romance) {
			System.out.println("This movie includes Action and romance");
			if(horror || comedy) {
				System.out.println("This movie includes Horror and comedy");
			}
		}
		else {
			System.out.println("Failed to select the correct movie");
		}
		
		//restaurant rating using the Logical operators
		int rating =2;
		if(rating>=2 && rating<5) {
			
			if(rating<=2) {
				System.out.println("What is the reason for your low rating");
			}
		System.out.println("Thank you for your feedback");
	}
	}
	
	*/
	/*
	boolean isSnowing = false; 
	boolean isRaining = false; 
	double temperature = 60;
	
	if (isRaining || isSnowing || temperature < 50) { 
		System.out.println("Let’s stay home.");
	}
	else {
		System.out.println("Let’s go out!");
	}
	
	*/
/*		
	int time = 20;
	String timeOfDay;
	
	if(time>=5 && time<12) {
		
		timeOfDay = "Morning";
	}

	else if(time >= 12 && time < 20) {
		timeOfDay = "daytime";
	}
	
	else {
		timeOfDay = "Night";
	}
	
	System.out.println(timeOfDay);
}
	
*/
		/*
		int dayOfTheWeek = 4;
		boolean holiday = false;
		
		if(!holiday && dayOfTheWeek >= 1 && dayOfTheWeek <= 5) {
				
				System.out.println("“Wake up at 7:00”");
			}
		
		else {
			System.out.println("Its a holiday, Sleep in");
		}
	
		*/
		int dayOfWeek = 2;
		String schedule;
		 
		switch(dayOfWeek) {
		
		case 1 : schedule = "Gym in the morning.";
		break;
		case 2 : schedule = "Class after work.";
		break;
		case 3 : schedule = "Meetings all day.";
		break;
		case 4 : schedule = "Work from home.";
		break;
		case 5 : schedule = "Game night after work.";
		break;
		case 6 : case 7 : default : schedule = "Free!";
		break;
		
		}
		System.out.println(schedule);
}
}
