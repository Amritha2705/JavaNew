import java.util.Scanner;
import figures.*;
public class TestGraphics2
{
 public static void main(String[] args) 
 { 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter length and breadth of the rectangle:");
 double length = sc.nextDouble();
 double breadth = sc.nextDouble();
 Rectangles rectObj = new Rectangles(length, breadth);
 System.out.println("Area of Rectangles: " + rectObj.calcArea());
 System.out.println("Enter base and height of the triangle:");
 double base = sc.nextDouble();
 double height = sc.nextDouble();
 Triangles triObj = new Triangles(base, height);
 System.out.println("Area of Triangles: " + triObj.calcArea());
 System.out.println("Enter side length of the squares:");
 double side= sc.nextDouble();
 Squares sqObj = new Squares(side);
 System.out.println("Area of Squares: " + sqObj.calcArea());
 System.out.println("Enter radius of the circle:");
 double radius = sc.nextDouble();
 Circles cirObj = new Circles(radius);
 System.out.println("Area of Circles: " + cirObj.calcArea()); 
 }
}
