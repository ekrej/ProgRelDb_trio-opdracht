package Overviews;

import Constructors.Films;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Watched {
    private Container container;
    private ArrayList<Films> films;

    public Watched(Container container, ArrayList films) {
        this.container = container;
        this.films = films;
    }

    public void watchedLabels() {
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
