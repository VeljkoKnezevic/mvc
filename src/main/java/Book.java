public class Book {
    private String name;
    private int date;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("No name has been provided");
        }
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if(date < 0) {
            throw new IllegalArgumentException("No date provided");
        }
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0) {
            throw new IllegalArgumentException("No id provided");
        }
        this.id = id;
    }
}
