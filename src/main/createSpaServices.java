package main;

import java.util.Scanner;

public class createSpaServices {
	public static void main(String[] args) {
		
		String service;
		double price;
		
		spaService firstService= new spaService();
		spaService secondService= new spaService();
		Scanner input = new Scanner(System.in);
			
	System.out.println("enter service >>>");
	service = input.nextLine();
	System.out.println("enter price >>>");
	price = input.nextDouble();
	
	firstService.setServiceDesc(service);
	firstService.setPrice(price);
	
	input.nextLine();
	println("enter Service >>>>");
	service = input.nextLine();
	
	println("enter price >>>>");
	price = input.nextDouble();
	
	secondService.setServiceDesc(service);
	secondService.setPrice(price);
	
	println(" first service detals:");
	println(firstService.getServiceDesc() + " $"+ firstService.getPrice());
	
	println(" second service detals:");
	println(secondService.getServiceDesc() + " $"+ secondService.getPrice());
	
	}
	
	
	
public static void println(String string) 
{System.out.println(string);}

	
}
