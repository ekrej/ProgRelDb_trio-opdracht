package Domains;
//Goede Column names nog invoeren!
public class Account {
    private int id;
    private String name;
    private String language;
    private String duration;
    private String genre;
    private int age;

    public Account(int id, String name, String language, String duration, String genre, int age) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.duration = duration;
        this.genre = genre;
        this.age = age;
    }
}
