import java.io.File;

public class DirectoryListing {
    public static void main(String[] args) {
        String dirPath = "C:/Users/AMRITHA/Desktop/Java";  
        listdirFiles(dirPath);
    }    
    
    // Method to list all subdirectories and files in a directory
    public static void listdirFiles(String dirPath) {
        File directory = new File(dirPath);
      
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Listing subdirectories and files in: " + dirPath);
            File[] files = directory.listFiles();
          
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                    } else {
                        System.out.println("File: " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory");
        }
    }
}
