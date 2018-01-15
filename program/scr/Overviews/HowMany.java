package Overviews;

import Constructors.Episodes;
import Constructors.Films;
import Controllers.Film;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HowMany {
    private Container container;
    private ArrayList<Film> films;

    public HowMany(Container container) {
        this.container = container;
        Films episode = new Films();
        this.films = episode.getFilms();
    }

    public void filmLabels() {
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
