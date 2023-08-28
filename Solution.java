package tests;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	/*
    	System.out.println("Please Enter a number between 1 to 100");
        int N = scanner.nextInt();        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if(N%2==1){
            System.out.println("Weird");
                    }
        
        else if(N%2==0 && N>=2 && N<=5 ){
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N>=6 && N<=20){
            System.out.println("Weird");
        }
        else if(N%2==0&& N>=24){
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Number is invalid");
        }
        */
    	Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter an integer number");
    	int i = scan.nextInt();
        scan.nextLine();
        System.out.println("Please Enter a double number");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please Enter a String");
        String s = scan.next();
        scan.close();

        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
