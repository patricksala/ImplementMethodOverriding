package shapeProcess;
import shapePack.*;

public class ShapeExecute {

	public static void main(String[] args) {
		
		Square SQ = new Square();
		Rectangle R = new Rectangle();
		SemiCircle SC = new SemiCircle();
		
		SQ.printShape();
		SQ.printRectangle();
		SQ.printSquare();
		System.out.println();
		SQ.calculateArea();
		System.out.println();
		R.calculateArea();
		System.out.println("----");
		SC.printShape();
		SC.printSemiCircle();
		SC.printCircle();
		
	}

}