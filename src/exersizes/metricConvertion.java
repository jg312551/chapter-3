package exersizes;

import java.util.Scanner;

import converting.get;

public class metricConvertion {
	public static void main(String[] args) {
		double entry;
		double conversionI;
		double conversionL;
		
		getAmmont liters = new getAmmont();
		getAmmont centi = new getAmmont();
		
		 
	 
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter number >>>>");
		 entry = input.nextDouble();
		
		 conversionI = convertCentToInches(entry);
		 conversionL = convertLitersToGallons(entry);
		 
		 liters.setliters(conversionL);
		 centi.setcenti(conversionI);
		 
		 
		 
		 
		 System.out.println(centi.getCenti()+" number of inches & "+liters.getliters()+" number of gallons" );
		 
	}
	public static double convertCentToInches(double c) {
		double i;
		i= c* 2.54;			
		return i;
	}
	public static double convertLitersToGallons(double l) {
		double g;
		g= l*3.7854;
		return g;
	}
}
