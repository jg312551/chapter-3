package main;

import java.util.Scanner;

//jake 1-22
public class ParadiseInfo2 {
	public static void main(String[] args)
	{
	double price;
	double discount;
	double savings;
	Scanner input = new Scanner(System.in);
	System.out.print("enter cutoff price for discount >>>>");
	price = input.nextDouble();
	System.out.print("enter discount rate as a whole number >>>>");
	discount= input.nextDouble();
	
		displayInfo();
		
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("special this week on any sevice over "+ price) ;
		System.out.println("discount of "+ discount +" percent");
		System.out.println("that's a saving of at least $"+savings) ;
		
	}
	

public static void displayInfo() {
	System.out.println("Paradise Day Spa wants to pamper you." );
	System.out.println("we will make you look good." );
 }
 
	public static double computeDiscountInfo(double pr, double dis) 
	{
		double savings;
		savings= pr*dis /100;
		return savings;
	}
	
 


}
