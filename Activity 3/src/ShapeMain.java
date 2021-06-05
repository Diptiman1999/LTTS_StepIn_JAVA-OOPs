import java.util.*;
public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the shape");
		String type = sc.next();
		
		if(type.equals("Square"))
		{
			System.out.println("Enter the side");
			int side = sc.nextInt();
			Square sq = new Square();
			sq.calculateArea(side);
		}
		else if(type.equals("Circle"))
		{
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			Circle cr = new Circle();
			cr.calculateArea(radius);
		}
		else
			System.out.println("Invalid Input (Valid Types are Circle/Square)");
	}

}
