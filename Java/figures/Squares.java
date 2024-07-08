package figures;
public class Squares
{
 private double side;
 public Squares(double side)
 {
 this.side = side;
 }
 public double calcArea()
 {
 double ar= side * side;
 return ar;
 }
}