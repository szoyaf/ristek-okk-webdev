package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Panitia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String npm;
    private int angkatan;

    @JoinColumn(name = "fakultas_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Fakultas fakultas;
    @JoinColumn(name = "tipe_panitia_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipePanitia tipePanitia;
    @JoinColumn(name = "posisi_bph_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PosisiBph posisiBph;
    @JoinColumn(name = "divisi_bph_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private DivisiBph divisiBph;
    @JoinColumn(name = "posisi_pengurus_inti_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PosisiPengurusInti posisiPengurusInti;

    public Panitia(){}

    
}
