package com.example.myfilm;

import android.widget.ImageView;

public class Film {
    private String judul;
    private String sutradara;
    private String tahun;
    private String deskripsi;
    private int banner;

    public Film(String judul, String sutradara, String tahun, String deskripsi, int banner) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahun = tahun;
        this.deskripsi = deskripsi;
        this.banner = banner;
    }

    public String getJudul() {
        return judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public String getTahun() {
        return tahun;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getBanner() {
        return banner;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }
}
