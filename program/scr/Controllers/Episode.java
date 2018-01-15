package Controllers;

public class Episode {
    private int id;
    private String title;
    private String runtime;
    private int episodeNo;
    private String season;
    private int seriesID;
    private int age;

    public Episode(int id, String title, String runtime, int episodeNo, String season, int seriesID, int age) {
        this.id = id;
        this.title = title;
        this.runtime = runtime;
        this.episodeNo = episodeNo;
        this.season = season;
        this.seriesID = seriesID;
        this.age = age;
    }
}
