package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public FilmAdapter filmAdapter;

    //instansiasi Recyclerview
    RecyclerView rvFilm;
    RecyclerView.LayoutManager rvlmFilm;
    List<Film> listFilm = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilm = findViewById(R.id.rvFilm);

        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.film_strip));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.ic_launcher_background));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));
        listFilm.add(new Film("End Game", "Waldan", "2020", "Iron Man Mati :')", R.drawable.btn_login));

        filmAdapter = new FilmAdapter(this, listFilm);
        rvlmFilm = new LinearLayoutManager(getApplicationContext());
        rvFilm.setAdapter(filmAdapter);
        rvFilm.setLayoutManager(rvlmFilm);

    }
}

