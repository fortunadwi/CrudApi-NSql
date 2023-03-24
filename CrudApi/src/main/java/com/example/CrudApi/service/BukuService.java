package com.example.CrudApi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.CrudApi.model.Buku;

public class BukuService {

    private static Map<Integer, Buku> buku = new HashMap<>();
    // private static Integer index = 2;

    static {
        Buku buku1 = new Buku(1, "Cantik Itu Luka", "Eka Kurniawan");
        Buku buku2 = new Buku(2, "Laut Bercerita", "Leila S. Chudori");
        Buku buku3 = new Buku(3, "Bumi Manusia", "Pramoedya Ananta Toer");
        Buku buku4 = new Buku(4, "Laskar Pelangi", "Andrea Hirata");

        buku.put(1, buku1);
        buku.put(2, buku2);
        buku.put(3, buku3);
        buku.put(4, buku4);
    }

    // Get All Buku
    public static List<Buku> getAllBuku() {
        return new ArrayList<>(buku.values());
    }

    // Get Buku By Id
    public static Buku getBukuId(Integer bukuId) {
        return buku.get(bukuId);
    }
}
