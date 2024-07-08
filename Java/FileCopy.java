import java.io.*; 
public class FileCopy
{
public static void main(String[] args)
{
FileInputStream fr = null;
FileOutputStream fc = null;
try
{
fr = new FileInputStream("abc.txt");
fc = new FileOutputStream("test3.txt");
int c;
do
{
c = fr.read();
if(c!=-1)
{
fc.write((char)c);
System.out.print((char)c); // Print characters while copying
}
 } while (c != - 1 );
}
catch (FileNotFoundException e)
{
System.out.println("File not found\nException: " + e);

} catch (IOException e)
{
System.out.println("An error occurred while copyinginException: " + e);
}
finally
{
try
{
if (fr != null)
 fr.close();
if (fc != null) 
fc.close();
}
catch (IOException e)
{
System.out.println("Error closing streams\nException: " + e);
}
}
}
}