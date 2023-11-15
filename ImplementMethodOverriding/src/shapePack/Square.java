package shapePack;
import java.util.Scanner;

public class Square extends Rectangle {
	
	public void printSquare() {
		
		System.out.println("This is Square. Subclass of Rectangle");
		
	}
	
	public void calculateArea() {
		
		Scanner scanner = new Scanner(System.in);
		double side, area;
		System.out.println("Area of Square:");
		System.out.println("Enter the measure of a side: ");
		
		side = scanner.nextDouble();
		area = side * side;

		System.out.println("RESULT: Area of Square = " + area);
		
	}
	
}