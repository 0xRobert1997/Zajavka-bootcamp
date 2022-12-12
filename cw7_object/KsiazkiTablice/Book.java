package Zajavka.zadania.cw7_object.KsiazkiTablice;

public class Book {
    public int numberISBN;
    public String author;
    public String title;

    public Book(int numberISBN, String author, String title) {
        this.numberISBN = numberISBN;
        this.author = author;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "numberISBN=" + numberISBN +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


}
