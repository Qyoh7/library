import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Library
{
    private ArrayList<Book> books;
    BufferedWriter writer = new BufferedWriter(new FileWriter("library.txt"));


    public Library(Book... args)
    {
        this.books = new ArrayList<Book>();
        for (Book book : args)
        {
            this.books.add(book);
        }
    }
    public Library()
    {
        books = new ArrayList<Book>();
    }

    public void save(String fileName)
    {
        for (Book book : books)
        {
            writer.write(book.getTitle() + "\n");
            writer.write(book.getAuthor() + "\n");
            writer.write(book.getGenre() + "\n");
            writer.write(book.getStatus() + "\n");
            writer.write(book.getRating() + "\n");
        }
        writer.close();
    }

    public void load(String fileName)
    {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        String line = "";
        String title = "";
        String author = "";
        String genre = "";
        String status = "";
        String rating = "";
    
        while (line = reader.nextLine() != null)
        {
            for (int i = 0; i < 4; i++)
            {
                
            }
        }
    }
    
    public String toString()
    {
        StringBuilder thing = new StringBuilder();
        int num = 1;
        for (Book book : books)
        {
            thing.append(num + ": " + book + "\n");
            num++;
        }
        return thing.toString();
    }

}
