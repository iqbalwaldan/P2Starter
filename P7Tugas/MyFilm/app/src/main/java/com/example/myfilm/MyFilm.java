package com.example.myfilm;

import android.app.Application;

import com.example.myfilm.models.Film;

import java.util.ArrayList;
import java.util.List;

public class MyFilm extends Application {
    private static List<Film> films;

    @Override
    public void onCreate() {
        super.onCreate();
        films = new ArrayList<>();
        films.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')",
                R.drawable.ic_launcher_background));
        films.add(new Film("End Game1", "Waldan1", "2021", "Iron Man Mati :')1",
                R.drawable.film_strip));
        films.add(new Film("End Game2", "Waldan2", "2022", "Iron Man Mati :')2",
                R.drawable.ic_launcher_background));
        films.add(new Film("End Game3", "Waldan3", "2023", "Iron Man Mati :')3",
                R.drawable.film_strip));
        films.add(new Film("End Game4", "Waldan4", "2024", "Iron Man Mati :')4",
                R.drawable.ic_launcher_background));
        films.add(new Film("End Game5", "Waldan5", "2025", "Iron Man Mati :')5",
                R.drawable.film_strip));
        films.add(new Film("End Game6", "Waldan6", "2026", "Iron Man Mati :')6",
                R.drawable.ic_launcher_background));
        films.add(new Film("End Game7", "Waldan7", "2027", "Iron Man Mati :')7",
                R.drawable.film_strip));
        films.add(new Film("End Game8", "Waldan8", "2028", "Iron Man Mati :')8",
                R.drawable.ic_launcher_background));
        films.add(new Film("End Game9", "Waldan9", "2029", "Iron Man Mati :')9",
                R.drawable.film_strip));
    }

    public static List<Film> getItems() {
        return films;
    }
}
