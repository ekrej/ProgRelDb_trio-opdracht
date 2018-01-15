package Controllers;

public class Watched {
    private int id;
    private int profileID;
    private String programName;
    private int percentWatched;

    public Watched(int id, int profileID, String programName, int percentWatched) {
        this.id = id;
        this.profileID = profileID;
        this.programName = programName;
        this.percentWatched = percentWatched;
    }
}
