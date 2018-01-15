package Overviews;

import Constructors.Films;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Longest {
    private Container container;
    private ArrayList<Films> films;

    public Longest(Container container) {
        this.container = container;
        Films episode = new Films();
        this.films = episode.getFilms();
    }

    public void longestLabels() {
        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        for(Object film : films){
            String s = film.toString();

            JLabel filmLabel = new JLabel(s);
            container.add(filmLabel);
        }
    }
}
