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
        Book test = new Book("tmrw", "gabrielle zevin", "video games", "read", 5);
        Book test2 = new Book("test2", "brandon mull", "thriller", "to-read", -1);
        Book test3 = new Book("american history", "bob smith", "history", "read", 2.5);
        Library lib = new Library(test, test2, test3);
        lib.save("library.txt");
        
    }
}
