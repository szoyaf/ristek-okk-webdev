package com.example.dto;

import lombok.Getter;

@Getter
public class PanitiaDTO {
   private long updated_panitia_id;
   private String npm;
   private String nama;
   private int angkatan;
   private long fakultas_id;
   private long tipe_panitia_id;
   private long posisi_pengurus_inti_id;
   private long posisi_bph_id;
   private long divisi_bph_id;
}
