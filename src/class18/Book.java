package class18;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    String color;
    String size;
    String author;
    int copiesOfBook;
    int ageOfAuthor;

    public Book(String author, int copiesOfBook, int ageOfAuthor) {
        this.author = author;
        this.copiesOfBook = copiesOfBook;
        this.ageOfAuthor = ageOfAuthor;

        System.out.println("The name of this author is "+author+".He is "+ageOfAuthor+"years old."+"He has around "+copiesOfBook+" copies.");

    }
    public Book(String color, String size) {
        this.color = color;
        this.size = size;

        System.out.println("The color of this book is "+color+" and it's a pretty "+size+" book.");

    }

    public static void main(String[] args) {
        Book b1=new Book("Dr.Suess",21,81);
        Book b2=new Book("black","heavy");
    }



}





