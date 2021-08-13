package com.example.myfilm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder>{
    List<Film> listFilm;

    public FilmAdapter(List<Film> listFilm) {
        this.listFilm = listFilm;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public FilmAdapter.FilmViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View superHeroView = layoutInflater.inflate(R.layout.item_film,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        FilmViewHolder viewHolder = new FilmViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull FilmAdapter.FilmViewHolder holder, int position) {
        //ambil satu item hero
        Film hero = listFilm.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.judulFilm.setText(hero.getJudul());
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    public class FilmViewHolder extends RecyclerView.ViewHolder {
        public TextView judulFilm;
        public FilmViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            judulFilm = itemView.findViewById(R.id.txtJudul);
        }
    }
}
