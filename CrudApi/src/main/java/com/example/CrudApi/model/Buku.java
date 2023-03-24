package com.example.CrudApi.model;

public class Buku {

    private int id;
    private String namaBuku;
    private String namaPenulis;

    public Buku(int id, String namaBuku, String namaPenulis) {
        this.id = id;
        this.namaBuku = namaBuku;
        this.namaPenulis = namaPenulis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

}
