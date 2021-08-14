package com.example.myfilm.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private String judul;
    private String sutradara;
    private String tahun;
    private String deskripsi;
    private String banner;

    public Film(String judul, String sutradara, String tahun, String deskripsi, String banner) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahun = tahun;
        this.deskripsi = deskripsi;
        this.banner = banner;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public static Creator<Film> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.sutradara);
        dest.writeString(this.tahun);
        dest.writeString(this.deskripsi);
        dest.writeString(this.banner);
    }

    public void readFromParcel(Parcel source) {
        this.judul = source.readString();
        this.sutradara = source.readString();
        this.tahun = source.readString();
        this.deskripsi = source.readString();
        this.banner = source.readString();
    }

    protected Film(Parcel in) {
        this.judul = in.readString();
        this.sutradara = in.readString();
        this.tahun = in.readString();
        this.deskripsi = in.readString();
        this.banner = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    @Override
    public String toString() {
        return "Item{" +
                "judul='" + judul + '\'' +
                ", sutradara='" + sutradara + '\'' +
                ", tahun='" + tahun + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                ", banner='" + banner + '\'' +
                '}';
    }
}
