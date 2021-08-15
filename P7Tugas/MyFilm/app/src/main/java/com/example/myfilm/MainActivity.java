package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.myfilm.adapters.FilmAdapter;
import com.example.myfilm.models.Film;

import java.util.List;

public class MainActivity extends AppCompatActivity implements FilmAdapter.OnItemClickCallback {

    public static final String KEY_ITEM = "item";
    private RecyclerView filmsView;
    private List<Film> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filmsView = findViewById(R.id.rv_film);
        films = MyFilm.getItems();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        FilmAdapter adapter = new FilmAdapter(films, this);

        filmsView.setLayoutManager(layoutManager);
        filmsView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(Film films) {
        Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TempleteDetailFilm.class);
        intent.putExtra(KEY_ITEM, films);
        startActivity(intent);
    }
}