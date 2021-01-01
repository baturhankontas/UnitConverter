package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Please select an option:\r\n" + 
				"1. Cups to Teaspoons\r\n" + 
				"2. Miles to Kilometers\r\n" + 
				"3. US Gallons to Liter\r\n" + 
				"4. Quit");
		
		int menuSelection=scan.nextInt();
		while(menuSelection!= 4)
		{
			
				
				switch (menuSelection) {
				case 1:
					System.out.println("Cups to Teaspoons");
					System.out.println("Please enter value");
					int cups=scan.nextInt();
					int teaspoon=cups*48;
					System.out.println(cups+" cups equals to "+ teaspoon+ " teaspoon.");
					break;
				case 2:
					System.out.println("Miles to Kilometers");
					System.out.println("Please enter value");
					int miles=scan.nextInt();
					double kilometers=miles*(1.7);
					System.out.println(miles+" miles equals to "+ kilometers+ " kilometers.");
					break;
				case 3:
					System.out.println("US Gallons to Liter");
					System.out.println("Please enter value");
					int gallon=scan.nextInt();
					double liter=gallon*3.78;
					System.out.println(gallon+" US gallon equals to "+ liter+ " liters.");
					break;
				}
				System.out.println("Please select an option:\r\n" + 
						"1. Cups to Teaspoons\r\n" + 
						"2. Miles to Kilometers\r\n" + 
						"3. US Gallons to Liter\r\n" + 
						"4. Quit");
				
				menuSelection=scan.nextInt();
					
				
		}
	}

}
