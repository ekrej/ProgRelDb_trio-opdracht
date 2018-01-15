package Constructors;

import Controllers.Serie;
<<<<<<< HEAD
=======
import Domains.Serie;
>>>>>>> origin/master

import java.util.ArrayList;

public class Series {

    ArrayList<Serie> series;

    public Series() {
        series = new ArrayList<>();
    }

    public void addSerie(Serie serie) {
        series.add(serie);
    }

}