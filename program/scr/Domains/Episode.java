package Domains;
//Goede Column names nog invoeren!
public class Episode {
    private int id;
    private String name;
    private String language;
    private String duration;
    private String Season;
    private int age;

    public Episode(int id, String name, String language, String duration, String Season, int age) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.duration = duration;
        this.Season = Season;
        this.age = age;
    }
}
