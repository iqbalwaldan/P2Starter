package com.example.myfilm.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myfilm.R;
import com.example.myfilm.models.Film;

import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {

    private List<Film> films;
    private OnItemClickCallback listener;

    public FilmAdapter(List<Film> films, OnItemClickCallback listener){
        this.films = films;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FilmAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.film_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.ViewHolder holder, int position) {
        Film item = films.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(item.getBanner())
//                .into(holder.imageFilm);
        holder.imageFilm.setImageResource(item.getBanner());
        holder.txtJudul.setText(item.getJudul());
        holder.txtTahun.setText(item.getTahun());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageFilm;
        TextView txtJudul,txtTahun;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFilm = itemView.findViewById(R.id.imageFilm);
            txtJudul = itemView.findViewById(R.id.txtJudul);
            txtTahun = itemView.findViewById(R.id.txtTahun);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Film film);
    }
}
