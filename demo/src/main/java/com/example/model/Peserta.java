package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Peserta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String npm;
    private int angkatan;
    @JoinColumn(name = "fakultas_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Fakultas fakultas;
    @JoinColumn(name = "jalur_masuk_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private JalurMasuk jalurMasuk;
    @JoinColumn(name = "kelompok_okk_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private KelompokOkk kelompokOkk;

    public Peserta() {}
}  
