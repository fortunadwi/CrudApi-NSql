package com.example.CrudApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudApi.model.Buku;
import com.example.CrudApi.service.BukuService;

@RestController
public class BukuController {

    @GetMapping("/buku")
    public List<Buku> getAllBuku() {
        return BukuService.getAllBuku();
    }

    @GetMapping("/buku/{bukuId}")
    public Buku getBukuId(@PathVariable Integer bukuId) {
        return BukuService.getBukuId(bukuId);
    }
}
