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
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game1", "Waldan1", "2021", "Iron Man Mati :')1",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game2", "Waldan2", "2022", "Iron Man Mati :')2",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game3", "Waldan3", "2023", "Iron Man Mati :')3",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game4", "Waldan4", "2024", "Iron Man Mati :')4",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game5", "Waldan5", "2025", "Iron Man Mati :')5",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game6", "Waldan6", "2026", "Iron Man Mati :')6",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game7", "Waldan7", "2027", "Iron Man Mati :')7",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game8", "Waldan8", "2028", "Iron Man Mati :')8",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
        films.add(new Film("End Game9", "Waldan9", "2029", "Iron Man Mati :')9",
                "htpps://www.cherymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a269b76034b5/img-thumb-mxRed%402x_100-80x80.png"));
    }

    public static List<Film> getItems() {
        return films;
    }
}
