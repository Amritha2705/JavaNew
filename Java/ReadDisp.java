import java.util.Scanner;
import java.io.*;

public class ReadDisp 
{
    public static void main(String[] args) 
    {
        String fname;
        Scanner sc = new Scanner(System.in);
        
        // Enter filename along with its extension
        System.out.print("Enter the Name of File: ");
        fname = sc.nextLine();
        
        String line = null;
        try 
        {
            File file1 = new File(fname);
            Scanner fileScanner = new Scanner(file1);
            
            while (fileScanner.hasNextLine()) 
            {
                line = fileScanner.nextLine();
                System.out.println(line);
            }     
            fileScanner.close();                // Always close the file after its use
        } 
        catch(IOException ex) 
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " + ex);
        }
    }
}
