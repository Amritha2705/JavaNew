package figures;
public class Rectangles
{
 private double length;
 private double breadth;
 public Rectangles(double length, double breadth)
 {
 this.length = length;
 this.breadth = breadth;
 }
 public double calcArea()
 {
 double ar=length * breadth;
 return ar;
 }
}