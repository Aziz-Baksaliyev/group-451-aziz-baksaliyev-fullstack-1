package classwork_11;

public class MainForBook {
    public static void main(String[] args) {
        Book myBook = new Book("Чистый код", "Роберт Мартин", 2008);

        System.out.println(myBook.getInfo());

        myBook.borrow();
        myBook.borrow();

        System.out.println(myBook.getInfo());

        myBook.returnBook();
        System.out.println(myBook.getInfo());
    }
}
