import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Library lib = new Library();
        
        try 
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("library.txt"));
            writer.write("This is a huge test");
            writer.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        
    }
}
