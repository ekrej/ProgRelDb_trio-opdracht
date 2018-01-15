package Overviews;

import Constructors.Episodes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AvgSerie {
    private Container container;
    private ArrayList<Episodes> episodes;
    private int seriesID;

    public AvgSerie(Container container, ArrayList episodes) {
        this.container = container;
        this.episodes = episodes;
    }

    public void labelsSherlock(Container container, ArrayList episodes) {
        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        //initializing labels
        for(Object ep : episodes){
            String s = ep.toString();

            if(seriesID == 1){
                JLabel episodes1 = new JLabel(s);
                container.add(episodes1);
            }
        }
    }

    public void labelsBreakingBad(Container container, ArrayList episodes) {
        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        //initializing labels
        for(Object ep : episodes){
            String s = ep.toString();

            if(seriesID == 2){
                JLabel episodes2 = new JLabel(s);
                container.add(episodes2);
            }
        }
    }

    public void labelsFargo(Container container, ArrayList episodes) {
        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        //initializing labels
        for(Object ep : episodes){
            String s = ep.toString();

            if(seriesID == 3){
                JLabel episodes3 = new JLabel(s);
                container.add(episodes3);
            }
        }
    }
}

