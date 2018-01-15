package Overviews;


import Constructors.Episodes;
import Controllers.Episode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AvgSerie {
    private Container container;
    private ArrayList<Episode> episodes;
    private int seriesID;

    public AvgSerie(Container container) {
        this.container = container;
        Episodes episode = new Episodes();
        this.episodes = episode.getEpisodes();
    }

    public void labelsSherlock() {

        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        for(Object ep : episodes){
            String s = ep.toString();

            if(seriesID == 1){
                JLabel episodes1 = new JLabel(s);
                container.add(episodes1);
            }
        }
    }
    public void labelsBreakingBad() {

        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        for(Object ep : episodes){
            String s = ep.toString();

            if(seriesID == 2){
                JLabel episodes2 = new JLabel(s);
                container.add(episodes2);
            }

        }
    }

    public void labelsFargo() {

        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        for(Object ep : episodes){
            String s = ep.toString();

            if(seriesID == 3){
                JLabel episodes3 = new JLabel(s);
                container.add(episodes3);
            }

        }
    }

}

