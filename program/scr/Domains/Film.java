package Domains;

public class Film {
    private int id;
    private String title;
    private String language;
    private String duration;
    private String genre;
    private int age;

    public Film(int id, String title, String language, String duration, String genre, int age) {
        this.id = id;
        this.title = title;
        this.language = language;
        this.duration = duration;
        this.genre = genre;
        this.age = age;
    }

}