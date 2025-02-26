public class Movie {
    private String id;
    private String name;
    private Director director;

    public Movie(String id, String name, Director director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }

    public String toString() {
        return id + " " + name + " direct by " + director.toString();
    }
}