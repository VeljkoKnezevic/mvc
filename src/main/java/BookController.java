import io.javalin.Javalin;

public class BookController {
    private Book model;
    private BookView view;


    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("No name has been provided");
        }
        model.setName(name);
    }

    public String getName() {
        return model.getName();
    }

    public void setDate(int date) {
        if(date < 0) {
            throw new IllegalArgumentException("No date provided");
        }
        model.setDate(date);
    }

    public int getDate() {
        return model.getDate();
    }

    public void setName(int id) {
        if(id < 0) {
            throw new IllegalArgumentException("No id provided");
        }
        model.setId(id);
    }

    public int getId() {
        return model.getId();
    }

    public void runApp() {
        String result = view.runView(model.getName(), model.getDate(), model.getId());
        Javalin app = Javalin.create().start(7070);

        app.get("/", ctx -> ctx.html(result));
    }

}
