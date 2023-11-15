package shapePack;
import java.util.Scanner;

public class Rectangle extends Shape {
	
	public void printRectangle() {
		
		System.out.println("This is Rectangle. Subclass of Shape");
		
	}
	
	public void calculateArea() {
		
		Scanner scanner = new Scanner(System.in);
		
		double length, base, area;
		System.out.println("Area of Rectangle: ");
		System.out.println("Enter the measure of length: ");
		
		length = scanner.nextDouble();
		System.out.println("Enter the measure of base: ");
		base = scanner.nextDouble();
		area = length * base;
		scanner.close();
		
		System.out.println("RESULT: Area of Rectangle = " + area);
		
	}

}