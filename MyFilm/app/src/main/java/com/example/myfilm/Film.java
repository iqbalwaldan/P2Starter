package com.example.myfilm;

public class Film {
    private String judul;
    private String sutradara;
    private String tahun;
    private String deskripsi;

    public Film(String judul, String sutradara, String tahun, String deskripsi) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahun = tahun;
        this.deskripsi = deskripsi;
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
}
