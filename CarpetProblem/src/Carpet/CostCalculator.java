package Carpet;

import java.util.Scanner;

public class CostCalculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter length: ");  
		int length = sc.nextInt();
		System.out.print("Enter width: ");  
		int width = sc.nextInt();
		System.out.print("Enter cost per square: ");
		int costPerSquare = sc.nextInt();
		sc.close();
		
		
		RoomDimension roomDimension = new RoomDimension(length, width);
		
		RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSquare);
		
		int totalCost = roomCarpet.totalCost();
		
		System.out.println("The total cost for flooring the carpet is :" +totalCost);
		
		

	}

}
