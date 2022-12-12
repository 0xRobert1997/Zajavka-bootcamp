package Zajavka.zadania.cw7_object.KsiazkiTablice;

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[5];

        Book book1 = new Book(110, "Tomek", "Hory Pjoter");
        Book book2 = new Book(120, "Jas", "Hord of the rings");
        Book book3 = new Book(130, "Kamil", "Przygody Tibijczyka");
        Book book4 = new Book(140, "Seba", "Lubie placki");
        Book book5 = new Book(150, "Damek", "Horoba");

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

/*        for (Book book : books) {
            System.out.println(book);
        }*/

        int counter = 0;

        for (Book book : books) {
            String title = book.title;
            char firstChar = title.charAt(0);
            if (firstChar == 'H'){
                counter++;
            }
        }

        Book[] books2 = new Book[counter];

        int j = 0;
        for (int i = 0; i < books.length; i++) {
            String title = books[i].title;
            char firstChar = title.charAt(0);
            if (firstChar == 'H'){
                books2[j] = books[i];
                j++;
            }
        }

        for (Book book : books2) {
            System.out.println(book);
        }




    }
}
