package Convert;

public class Main {

	public static void main(String[] args) {

		UnitConvertor unit = new UnitConvertor();
		
		System.out.println("Feet after converting to cms is :"+unit.feetToCentimeter(10));
		System.out.println("Feet after converting to cms is :"+unit.feetToCentimeter(100.9808));
		
		

	}

}
