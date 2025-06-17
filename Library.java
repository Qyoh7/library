import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IO;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;

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
        try {
            for (Book book : books)
            {
                writer.write(book.getTitle() + "\n");
                writer.write(book.getAuthor() + "\n");
                writer.write(book.getGenre() + "\n");
                writer.write(book.getStatus() + "\n");
                writer.write(book.getRating() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String fileName)
    {
        try {
            Scanner reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File file = new File(fileName);
        ArrayList<String> libFile = new ArrayList<>();
        String line = "";

        while ((line = reader.nextLine()) != null)
        {
            libFile.add(line);
        }
        reader.close();


        for (int i = 0; i < libFile.size(); i+=5) 
        {
            Book tmp = new Book(
                    libFile.get(i), 
                    libFile.get(i+1), 
                    libFile.get(i+2), 
                    libFile.get(i+3), 
                    Integer.parseInt(libFile.get(i+4)));
            books.add(tmp);
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
