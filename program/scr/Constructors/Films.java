package Constructors;



import Controllers.Film;

import java.util.ArrayList;

public class Films {

    ArrayList<Film> films;

    public Films() {
        films = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public ArrayList<Film> getFilms() {
        return films;
    }
}
