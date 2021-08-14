package com.example.myfilm;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {
    private List<Film> listFilm;

    private Context context;

    public class FilmViewHolder extends RecyclerView.ViewHolder {
        ImageView imageFilm;
        TextView txtJudul, txtTahun;
        ConstraintLayout parent_layout;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFilm = itemView.findViewById(R.id.imageFilm);
            txtJudul = itemView.findViewById(R.id.txtJudul);
            txtTahun = itemView.findViewById(R.id.txtTahun);
            parent_layout = itemView.findViewById(R.id.parent_layout);
        }
    }

    public FilmAdapter(Context context, List<Film> listFilm) {
        this.context = context;
        this.listFilm = listFilm;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false);
        FilmViewHolder viewHolder = new FilmViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder filmViewHolder, int position) {
        Film item = listFilm.get(position);
        filmViewHolder.txtJudul.setText(item.getJudul());
        filmViewHolder.txtTahun.setText(item.getTahun());
        filmViewHolder.imageFilm.setImageResource(item.getBanner());


        filmViewHolder.parent_layout.setOnClickListener(v ->{
            Toast.makeText(context, listFilm.get(position).getJudul(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }
}