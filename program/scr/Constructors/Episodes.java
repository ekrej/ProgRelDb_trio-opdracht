package Constructors;

import Controllers.Episode;


import java.util.ArrayList;

public class Episodes {

    ArrayList<Episode> episodes;

    public Episodes() {
        episodes = new ArrayList<>();
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }
}