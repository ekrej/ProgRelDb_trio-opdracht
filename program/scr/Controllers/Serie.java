package Controllers;
//Goede Column names nog invoeren!
public class Serie {
    private int id;
    private String name;
    private String language;
    private String recommendation;
    private String genre;
    private int age;

    public Serie(int id, String name, String language, String recommendation, String genre) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.recommendation = recommendation;
        this.genre = genre;

    }
}
