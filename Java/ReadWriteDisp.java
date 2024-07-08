import java.io.*;
import java.util.Scanner;
public class ReadWriteDisp
{
public static void main(String[] args)
{
String fileName;
String content;
Scanner sc1 = new Scanner(System.in);
System.out.print("Enter the Name of File: ");
 fileName = sc1.nextLine();

try
{
FileWriter f1 = new FileWriter(fileName);
 System.out.print("\nEnter the Content:\n");
 while (sc1.hasNextLine())
{
content = sc1.nextLine();
f1.write(content);}
f1.close();
System.out.println("\nContent written to the file successfully.");
}
catch (IOException ioe)
{
System.out.println("\nException:"  +ioe);
}
try
{
FileReader fr = new FileReader(fileName);
Scanner sc2=new Scanner(fr);
System.out.println("\n Content of the file:");
while(sc2.hasNextLine())
{
content = sc2.nextLine();
 System.out.println(content);
}
sc2.close();
fr.close();}
catch (IOException ioe){
System.out.println("\nException: " + ioe);
}
}
}