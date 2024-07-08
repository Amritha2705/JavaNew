package figures;
public class Triangles
{
 private double base;
 private double height;
 public Triangles(double base, double height)
 {
 this.base = base;
 this.height = height;
 }
 public double calcArea()
 {
 double ar=0.5 * base * height;
 return ar;
 }
}