package figures;
public class Circles
{
 private double radius;
 public Circles(double radius)
 {
 this.radius = radius;
 }
 public double calcArea()
 { 
 double ar= Math.PI * radius * radius;
 return ar;
 }
}