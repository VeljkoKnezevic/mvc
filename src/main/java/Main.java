public class Main {

    public static void main(String[] args) {

        Book model = bookDb();
        BookView view = new BookView();
        BookController controller = new BookController(model,view);

        controller.display();

    }
    public static Book bookDb() {
        Book book = new Book();

        book.setName("Game of thrones");
        book.setDate(2001);
        book.setId(3);
        return book;
    }

}
