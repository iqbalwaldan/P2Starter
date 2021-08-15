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
        films.add(new Film("Iron Man", "Jon Favreau", "2008",
                R.string.des_iron_man, R.drawable.iron_man));
        films.add(new Film("Iron Man 2", "Jon Favreau", "2010",
                R.string.des_iron_man_2, R.drawable.iron_man_2));
        films.add(new Film("Iron Man 3", "Shane Black", "2013",
                R.string.des_iron_man_3, R.drawable.iron_man_3));
        films.add(new Film("Spider-Man: Homecoming", "Jon Watts", "2017",
                R.string.des_spider_man_homecoming, R.drawable.spider_man_homecoming));
        films.add(new Film("Spider-Man: Far from Home", "Jon Watts", "2019",
                R.string.des_spider_man_far_from_home, R.drawable.spider_man_far_from_home));
        films.add(new Film("Avengers: Infinity War", "Joe Russo, Anthony Russo", "2018",
                R.string.des_the_avengers_infinity_war, R.drawable.the_avengers_infinity_war));
        films.add(new Film("Avengers: Endgame", "Joe Russo, Anthony Russo", "2019",
                R.string.des_the_avengers_end_game, R.drawable.avengers_endgame));
    }

    public static List<Film> getItems() {
        return films;
    }
}
