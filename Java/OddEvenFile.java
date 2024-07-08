import java.io.*;
public class OddEvenFile 
{
    public static void main(String[] args) 
    {
    String inFileName = "numbers.txt";
    String evFileName = "evnos.txt";
    String odFileName = "odnos.txt";
    try 
     {
         BufferedReader rd = new BufferedReader(new FileReader (inFileName));
         BufferedWriter ev = new BufferedWriter(new FileWriter(evFileName));
         BufferedWriter od = new BufferedWriter(new FileWriter(odFileName));

            String line;
            while ((line = rd.readLine()) != null) 
            {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) 
                {
                    ev.write (Integer.toString(number));
                    ev.newLine();           // Add newline after each number                 
                } 
                else 
                {
                    od.write (Integer.toString(number));
                    od.newLine(); // Add newline after each number
                }
            }
            rd.close();
            ev.close();
            od.close();
            System.out.println("Even & odd numbers have been copied to separate files");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e);
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading/writing file: " + e);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number format in file: " + e);
        }
    }
}
