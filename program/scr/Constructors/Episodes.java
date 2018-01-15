package Constructors;

import Domains.Episode;

import java.util.ArrayList;

public class Episodes {

    ArrayList<Episode> episodes;

    public Episodes() {
        episodes = new ArrayList<>();
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

}