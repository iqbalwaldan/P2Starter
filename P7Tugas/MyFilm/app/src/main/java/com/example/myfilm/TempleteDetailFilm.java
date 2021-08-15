package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myfilm.adapters.FilmAdapter;
import com.example.myfilm.models.Film;

import java.util.List;

public class TempleteDetailFilm extends AppCompatActivity {

    private static final String ITEM_EXTRA = "item_extra";

    private List<Film> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templete_detail_film);
        films = MyFilm.getItems();
        ImageView bannerFilm = findViewById(R.id.imageFilm);
        TextView judul = findViewById(R.id.judul);
        TextView sutradara = findViewById(R.id.sutradara);
        TextView tahun = findViewById(R.id.tahun);
        TextView deskripsi = findViewById(R.id.deskripsi);

        Film film = getIntent().getParcelableExtra(ITEM_EXTRA);
            bannerFilm.setImageResource(film.getBanner());
            judul.setText(film.getJudul());
            sutradara.setText(film.getSutradara());
            tahun.setText(film.getTahun());
            deskripsi.setText(film.getDeskripsi());
    }
}