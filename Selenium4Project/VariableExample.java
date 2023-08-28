package test;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Java Rocks!");
		
		int passengers;
		passengers = 0;
		passengers = passengers + 5;
		passengers = passengers -3;
		passengers = passengers -1 + 5;
		
		System.out.println(passengers);
		
		String driver;
		driver = "Hamish";
		int letters = driver.length();
		System.out.println(letters);
		driver = driver.toUpperCase();
		System.out.println(driver);
		
		String DriverFirstName;
		DriverFirstName = "Hamish";
		String DriverLastName;
		DriverLastName = "Blake";
		
		//String DriverFullName = DriverFirstName + DriverLastName;
		String DriverFullName = DriverFirstName + " " + DriverLastName;
		System.out.println(DriverFullName);
		
		int stops;
		int fare;
		stops= 0;
		fare= 0;
		stops=stops+1;
		fare= fare+5;
		stops=stops+1;
		fare= fare+3;
		stops=stops+1;
		fare= fare+7;
		System.out.println("The Bus Made $"+fare+ " After "+ stops + " stops");
		
		//int x =2+3;
		//int y =4-5;
		//int z =x*y;
		//System.out.println(z);
		
		int temp= -20;
		int days =4*7;
		//double div = 5/2;
		System.out.println(days);
		double accurate = 5/2.0;
		//double accurate = (double)div;
		System.out.println(accurate);
		
		double paid = 10;
		double change = 3.25;
		double tip = (paid-change)*0.2;
		System.out.println(tip);
		
		double current =17;
		double rate = 1.5;
		double future = current*rate;
		System.out.println(future);
		int approx = (int)future;
		System.out.println(approx);
		
		int x =5;
		int y=2;
		double div=x/y;
	
		System.out.println(div);
		//double accurate = 5/2.0;
		double cast_value = (double)x/y;
		System.out.println("Casted Value = "+ cast_value);
		
		int bankBalance=500;
		bankBalance = bankBalance + 250;
		bankBalance= bankBalance-100;
		
		System.out.println(bankBalance);
		
		int day= 9;
		String month = "January";
		int year = 1993;
		
		System.out.println("My date of birth is "+ day+"th " + month+ " " + year);
		
		String firstName = "Amar";
		String lastName = "Chaudhary";
		String fullName = firstName +" " + lastName;
		int length1= firstName.length();
		int length2 = lastName.length();
		int nameLength = length1+length2;
		
		System.out.println("Hello, My name is "+ fullName+".");
		System.out.println("There are "+ nameLength+ " Letters in my Name.");
		
		double fahrenheit= 98.6;
		double celsius = ((fahrenheit-32)*5)/9;
		System.out.println(celsius);
		
		
		
	}

}
