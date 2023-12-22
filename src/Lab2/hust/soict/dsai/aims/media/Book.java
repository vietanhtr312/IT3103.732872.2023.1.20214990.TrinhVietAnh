package Lab2.hust.soict.dsai.aims.media;                                           // Trinh Viet Anh - 20214990

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String authorName){
        if (authors.contains(authorName)) System.out.println("The author has been added");
        else authors.add(authorName);
    }

    public void removeAuthor(String authorName) throws NoSuchElementException {                 // Trinh Viet Anh 20214990
        if(!authors.contains(authorName)) {
            throw new NoSuchElementException("ERROR: No such author");
        }
        else authors.remove(authorName);
    }
    @Override
    public String toString(){
        return "Book - " + super.getTitle()+ " - " + category + " - " + getAuthors() + " - " +
                " : " + cost + "$";
    }
}
