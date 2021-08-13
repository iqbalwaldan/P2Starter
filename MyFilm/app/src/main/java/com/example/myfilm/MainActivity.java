package com.example.myfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvContact;
    //instansiasi list superhero
    List<Film> listFilm = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvContact = findViewById(R.id.rvContact);
        //Membuat object hero
        Film film = new Film("End Game","Waldan", "2020", "Iron Man Mati :')");
        //menambahkan hero ke listSuperHero
        listFilm.add(film);
        //membuat object hero baru
        film = new Film("Minion","Iqbal","2021","Imut banget");
        //menambahkan hero baru ke listSuperhero
        listFilm.add(film);
        //Instansiasi Adapter
        FilmAdapter superHeroAdapter = new FilmAdapter(listFilm);
        //set adapter dan layoutmanager
        rvContact.setAdapter(superHeroAdapter);
        rvContact.setLayoutManager(new LinearLayoutManager(this));
    }
}