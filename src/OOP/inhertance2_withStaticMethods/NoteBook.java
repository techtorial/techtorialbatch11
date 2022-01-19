package OOP.inhertance2_withStaticMethods;

public class NoteBook extends Book {

     int numberOfPages;


    public static int getNumberOfPages() {

        return 500;
    }


    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.getNumberOfPages()); // 404


        NoteBook noteBook = new NoteBook();
        System.out.println(noteBook.getNumberOfPages()); // 500

    }
}
