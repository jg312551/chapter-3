package converting;

import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
		double convertF;
		double entryC;
		
		get celsius1= new get();
		get ferinheit= new get();
		Scanner input = new Scanner(System.in);
		
		
		println("please enter a temputure in celsius");
		entryC = input.nextDouble();
		
		convertF = convertFmath(entryC);
		
		celsius1.settempC(entryC);
		
		ferinheit.setTempF(convertF);
		
		println("the temperature in farenheit is "+ convertF);
		
		System.out.println(celsius1.getcelsius1()+" celsius temp");
		System.out.println(ferinheit.getferinheit()+" fahrenheit temp");
	}
	
	
	
	
	
public static void println(String string) 
{System.out.println(string);}

	
public static double convertFmath(double c) {
double convertF;
convertF = (c* 9/5) +32 ;
return convertF;
}

}
