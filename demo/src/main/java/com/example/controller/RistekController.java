package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.KelompokOkkDTO;
import com.example.dto.NameDTO;
import com.example.dto.PanitiaDTO;
import com.example.dto.PesertaDTO;
import com.example.model.DivisiBph;
import com.example.model.Fakultas;
import com.example.model.KelompokOkk;
import com.example.model.Panitia;
import com.example.model.PosisiBph;
import com.example.model.PosisiPengurusInti;
import com.example.model.TipePanitia;
import com.example.model.Peserta;
import com.example.model.JalurMasuk;
import com.example.repository.DivisiBphRepository;
import com.example.repository.FakultasRepository;
import com.example.repository.JalurMasukRepository;
import com.example.repository.KelompokOkkRepository;
import com.example.repository.PanitiaRepository;
import com.example.repository.PesertaRepository;
import com.example.repository.PosisiBphRepository;
import com.example.repository.PosisiPengurusIntiRepository;
import com.example.repository.TipePanitiaRepository;

@RestController
@RequestMapping("/api-zoya") // controller untuk group api-zoya
public class RistekController {
  
    @Autowired
    FakultasRepository fakultasRepository;
    
    @Autowired
    DivisiBphRepository divisiBphRepository;

    @Autowired
    PosisiBphRepository posisiBphRepository;
    
    @Autowired
    TipePanitiaRepository tipePanitiaRepository;

    @Autowired
    PosisiPengurusIntiRepository posisiPengurusIntiRepository;

    @Autowired
    PanitiaRepository panitiaRepository;
    
    @Autowired
    KelompokOkkRepository kelompokOkkRepository;

    @Autowired
    PesertaRepository pesertaRepository;

    @Autowired
    JalurMasukRepository jalurMasukRepository;
    
    @GetMapping("/fakultas")
    public ResponseEntity<List<Fakultas>> getFakultas() {
        List<Fakultas> array = fakultasRepository.findAll();

         ResponseEntity<List<Fakultas>> response =  new ResponseEntity<List<Fakultas>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/fakultas")
    public ResponseEntity<Fakultas> createFakultas(@RequestBody NameDTO namaDTO) {
        Fakultas data = new Fakultas();
        data.setName(namaDTO.getName());

        fakultasRepository.save(data);
        
        return new ResponseEntity<Fakultas>(data, HttpStatus.OK);
    }

    @PostMapping("/fakultas/update")
    public ResponseEntity<Fakultas> updateFakultas(@RequestBody NameDTO namaDTO) {
        Optional<Fakultas> opt = fakultasRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        Fakultas data = opt.get();
        data.setName(namaDTO.getName());
        fakultasRepository.save(data);
        
        return new ResponseEntity<Fakultas>(data, HttpStatus.OK);
    }

    @PostMapping("/fakultas/delete")
    public ResponseEntity<Fakultas> deleteFakultas(@RequestBody NameDTO namaDTO) {
        Optional<Fakultas> opt = fakultasRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        Fakultas data = opt.get();

        fakultasRepository.delete(data);
        
        return new ResponseEntity<Fakultas>(data, HttpStatus.OK);
    }

    @GetMapping("/divisibph")
    public ResponseEntity<List<DivisiBph>> getDivisiBph() {
        List<DivisiBph> array = divisiBphRepository.findAll();

        ResponseEntity<List<DivisiBph>> response =  new ResponseEntity<List<DivisiBph>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/divisibph")
    public ResponseEntity<DivisiBph> createDivisiBPH(@RequestBody NameDTO namaDTO) {
        DivisiBph data = new DivisiBph();
        data.setName(namaDTO.getName());

        divisiBphRepository.save(data);
        
        return new ResponseEntity<DivisiBph>(data, HttpStatus.OK);
    }

    @PostMapping("/divisibph/update")
    public ResponseEntity<DivisiBph> updateDivisiBPH(@RequestBody NameDTO namaDTO) {
        Optional<DivisiBph> opt = divisiBphRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        DivisiBph data = opt.get();
        data.setName(namaDTO.getName());
        divisiBphRepository.save(data);
        
        return new ResponseEntity<DivisiBph>(data, HttpStatus.OK);
    }

    @PostMapping("/divisibph/delete")
    public ResponseEntity<DivisiBph> deleteDivisiBPH(@RequestBody NameDTO namaDTO) {
        Optional<DivisiBph> opt = divisiBphRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        DivisiBph data = opt.get();

        divisiBphRepository.delete(data);
        
        return new ResponseEntity<DivisiBph>(data, HttpStatus.OK);
    }

    @GetMapping("/posisibph")
    public ResponseEntity<List<PosisiBph>> getPosisiBph() {
        List<PosisiBph> array = posisiBphRepository.findAll();

        ResponseEntity<List<PosisiBph>> response =  new ResponseEntity<List<PosisiBph>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/posisibph")
    public ResponseEntity<PosisiBph> createPosisiBph(@RequestBody NameDTO namaDTO) {
        PosisiBph data = new PosisiBph();
        data.setName(namaDTO.getName());

        posisiBphRepository.save(data);
        
        return new ResponseEntity<PosisiBph>(data, HttpStatus.OK);
    }

    @PostMapping("/posisibph/update")
    public ResponseEntity<PosisiBph> updatePosisiBph(@RequestBody NameDTO namaDTO) {
        Optional<PosisiBph> opt = posisiBphRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        PosisiBph data = opt.get();
        data.setName(namaDTO.getName());
        posisiBphRepository.save(data);
        
        return new ResponseEntity<PosisiBph>(data, HttpStatus.OK);
    }

    @PostMapping("/posisibph/delete")
    public ResponseEntity<PosisiBph> deletePosisiBph(@RequestBody NameDTO namaDTO) {
        Optional<PosisiBph> opt = posisiBphRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        PosisiBph data = opt.get();

        posisiBphRepository.delete(data);
        
        return new ResponseEntity<PosisiBph>(data, HttpStatus.OK);
    }

    @GetMapping("/tipepanitia")
    public ResponseEntity<List<TipePanitia>> getTipePanitia() {
        List<TipePanitia> array = tipePanitiaRepository.findAll();

        ResponseEntity<List<TipePanitia>> response =  new ResponseEntity<List<TipePanitia>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/tipepanitia")
    public ResponseEntity<TipePanitia> createTipePanitia(@RequestBody NameDTO namaDTO) {
        TipePanitia data = new TipePanitia();
        data.setName(namaDTO.getName());

        tipePanitiaRepository.save(data);
        
        return new ResponseEntity<TipePanitia>(data, HttpStatus.OK);
    }

    @PostMapping("/tipepanitia/update")
    public ResponseEntity<TipePanitia> updateTipePanitia(@RequestBody NameDTO namaDTO) {
        Optional<TipePanitia> opt = tipePanitiaRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        TipePanitia data = opt.get();
        data.setName(namaDTO.getName());
        tipePanitiaRepository.save(data);
        
        return new ResponseEntity<TipePanitia>(data, HttpStatus.OK);
    }

    @PostMapping("/tipepanitia/delete")
    public ResponseEntity<TipePanitia> deleteTipePanitia(@RequestBody NameDTO namaDTO) {
        Optional<TipePanitia> opt = tipePanitiaRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        TipePanitia data = opt.get();

        tipePanitiaRepository.delete(data);
        
        return new ResponseEntity<TipePanitia>(data, HttpStatus.OK);
    }


    @GetMapping("/posisipengurusinti")
    public ResponseEntity<List<PosisiPengurusInti>> getPosisiPengurusInti() {
        List<PosisiPengurusInti> array = posisiPengurusIntiRepository.findAll();

        ResponseEntity<List<PosisiPengurusInti>> response =  new ResponseEntity<List<PosisiPengurusInti>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/posisipengurusinti")
    public ResponseEntity<PosisiPengurusInti> createPosisiPengurusInti(@RequestBody NameDTO namaDTO) {
        PosisiPengurusInti data = new PosisiPengurusInti();
        data.setName(namaDTO.getName());

        posisiPengurusIntiRepository.save(data);
        
        return new ResponseEntity<PosisiPengurusInti>(data, HttpStatus.OK);
    }

    @PostMapping("/posisipengurusinti/update")
    public ResponseEntity<PosisiPengurusInti> updatePosisiPengurusInti(@RequestBody NameDTO namaDTO) {
        Optional<PosisiPengurusInti> opt = posisiPengurusIntiRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        PosisiPengurusInti data = opt.get();
        data.setName(namaDTO.getName());
        posisiPengurusIntiRepository.save(data);
        
        return new ResponseEntity<PosisiPengurusInti>(data, HttpStatus.OK);
    }

    @PostMapping("/posisipengurusinti/delete")
    public ResponseEntity<PosisiPengurusInti> deletePosisiPengurusInti(@RequestBody NameDTO namaDTO) {
        Optional<PosisiPengurusInti> opt = posisiPengurusIntiRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        PosisiPengurusInti data = opt.get();

        posisiPengurusIntiRepository.delete(data);
        
        return new ResponseEntity<PosisiPengurusInti>(data, HttpStatus.OK);
    }

    @PostMapping("/panitia/update")
    public ResponseEntity<Panitia> updatePanitia(@RequestBody PanitiaDTO panitiaDTO) {
        if (panitiaDTO.getNama() == null || panitiaDTO.getNpm() == null || panitiaDTO.getAngkatan() == 0) {            
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        long updatedPanitiaID = panitiaDTO.getUpdated_panitia_id();

        Optional<Panitia> panitiaOptional = panitiaRepository.findById(updatedPanitiaID);
        if (!panitiaOptional.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        Panitia panitia = panitiaOptional.get();
        panitia.setName(panitiaDTO.getNama());
        panitia.setNpm(panitiaDTO.getNpm());
        panitia.setAngkatan(panitiaDTO.getAngkatan());
        
        long fakultasID = panitiaDTO.getFakultas_id();
        // Set fakultas
        Optional<Fakultas> fakultas = fakultasRepository.findById(fakultasID);
        if (!fakultas.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitia.setFakultas(fakultas.get());

    
        Optional<TipePanitia> tipePanitia = tipePanitiaRepository.findById(panitiaDTO.getTipe_panitia_id());
        if (!tipePanitia.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitia.setTipePanitia(tipePanitia.get());

        long posisiPengurusIntiID = panitiaDTO.getPosisi_pengurus_inti_id();
        long posisiBPHID = panitiaDTO.getPosisi_bph_id();
        long divisiBPHID = panitiaDTO.getDivisi_bph_id();

        
        panitia.setPosisiPengurusInti(null);
        panitia.setDivisiBph(null);
        panitia.setPosisiBph(null);

        //Validation
        if (tipePanitia.get().getName().equals("Panitia Inti")) {
            Optional<PosisiPengurusInti> posisiPengurusInti = posisiPengurusIntiRepository.findById(posisiPengurusIntiID);
            if (!posisiPengurusInti.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            Optional<DivisiBph> divisiBph = divisiBphRepository.findById(panitiaDTO.getDivisi_bph_id());
            if (divisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
            
            Optional<PosisiBph> posisiBph = posisiBphRepository.findById(panitiaDTO.getPosisi_bph_id());
            if (posisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            panitia.setPosisiPengurusInti(posisiPengurusInti.get());
        } else if (tipePanitia.get().getName().equals("Badan Pengurus Harian")){
            Optional<PosisiPengurusInti> posisiPengurusInti = posisiPengurusIntiRepository.findById(posisiPengurusIntiID);
            if (posisiPengurusInti.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            Optional<DivisiBph> divisiBph = divisiBphRepository.findById(panitiaDTO.getDivisi_bph_id());
            if (!divisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
            
            Optional<PosisiBph> posisiBph = posisiBphRepository.findById(panitiaDTO.getPosisi_bph_id());
            if (!posisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            panitia.setDivisiBph(divisiBph.get());
            panitia.setPosisiBph(posisiBph.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitiaRepository.save(panitia);

        ResponseEntity<Panitia> response =  new ResponseEntity<Panitia>(panitia, HttpStatus.OK);
        return response;

    
    }
    @PostMapping("/panitia")
    public ResponseEntity<Panitia> createPanitia(@RequestBody PanitiaDTO panitiaDTO) {
        if (panitiaDTO.getNama() == null || panitiaDTO.getNpm() == null || panitiaDTO.getAngkatan() == 0) {            
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        Panitia panitia = new Panitia();
        panitia.setName(panitiaDTO.getNama());
        panitia.setNpm(panitiaDTO.getNpm());
        panitia.setAngkatan(panitiaDTO.getAngkatan());
        
        long fakultasID = panitiaDTO.getFakultas_id();
        // Set fakultas
        Optional<Fakultas> fakultas = fakultasRepository.findById(fakultasID);
        if (!fakultas.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitia.setFakultas(fakultas.get());

    
        Optional<TipePanitia> tipePanitia = tipePanitiaRepository.findById(panitiaDTO.getTipe_panitia_id());
        if (!tipePanitia.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitia.setTipePanitia(tipePanitia.get());

        long posisiPengurusIntiID = panitiaDTO.getPosisi_pengurus_inti_id();
        long posisiBPHID = panitiaDTO.getPosisi_bph_id();
        long divisiBPHID = panitiaDTO.getDivisi_bph_id();

        //Validation
        if (tipePanitia.get().getName().equals("Panitia Inti")) {
           
            Optional<PosisiPengurusInti> posisiPengurusInti = posisiPengurusIntiRepository.findById(posisiPengurusIntiID);
            if (!posisiPengurusInti.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            Optional<DivisiBph> divisiBph = divisiBphRepository.findById(panitiaDTO.getDivisi_bph_id());
            if (divisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
            
            Optional<PosisiBph> posisiBph = posisiBphRepository.findById(panitiaDTO.getPosisi_bph_id());
            if (posisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            panitia.setPosisiPengurusInti(posisiPengurusInti.get());
        } else if (tipePanitia.get().getName().equals("Badan Pengurus Harian")){
            Optional<PosisiPengurusInti> posisiPengurusInti = posisiPengurusIntiRepository.findById(posisiPengurusIntiID);
            if (posisiPengurusInti.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            Optional<DivisiBph> divisiBph = divisiBphRepository.findById(panitiaDTO.getDivisi_bph_id());
            if (!divisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
            
            Optional<PosisiBph> posisiBph = posisiBphRepository.findById(panitiaDTO.getPosisi_bph_id());
            if (!posisiBph.isPresent()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }

            panitia.setDivisiBph(divisiBph.get());
            panitia.setPosisiBph(posisiBph.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitiaRepository.save(panitia);

        ResponseEntity<Panitia> response =  new ResponseEntity<Panitia>(panitia, HttpStatus.OK);
        return response;
    }


    @PostMapping("/mentor")
    public ResponseEntity<Panitia> createMentor(@RequestBody PanitiaDTO panitiaDTO) {
        if (panitiaDTO.getNama() == null || panitiaDTO.getNpm() == null || panitiaDTO.getAngkatan() == 0) {            
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        Panitia panitia = new Panitia();
        panitia.setName(panitiaDTO.getNama());
        panitia.setNpm(panitiaDTO.getNpm());
        panitia.setAngkatan(panitiaDTO.getAngkatan());
        
        long fakultasID = panitiaDTO.getFakultas_id();
        // Set fakultas
        Optional<Fakultas> fakultas = fakultasRepository.findById(fakultasID);
        if (!fakultas.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitia.setFakultas(fakultas.get());

        List<TipePanitia> tipePanitias = tipePanitiaRepository.findAll();
        for (TipePanitia tp : tipePanitias) {
            if (tp.getName().equals("Badan Pengurus Harian")) {
                panitia.setTipePanitia(tp);
                break;
            }
        }

        List<DivisiBph> divisiBphs = divisiBphRepository.findAll();
        for (DivisiBph db : divisiBphs) {
            if (db.getName().equals("Mentor")) {
                panitia.setDivisiBph(db);
            }
        }

        List<PosisiBph> posisiBphs = posisiBphRepository.findAll();
        for (PosisiBph pb : posisiBphs) {
            if (pb.getName().equals("Anggota")) {
                panitia.setPosisiBph(pb);
            }
        }

        panitiaRepository.save(panitia);

        ResponseEntity<Panitia> response =  new ResponseEntity<Panitia>(panitia, HttpStatus.OK);
        return response;
    }
    
    @PostMapping("/panitia/delete")
    public ResponseEntity<Panitia> deletePanitia(@RequestBody PanitiaDTO panitiaDTO) {
        long updatedPanitiaID = panitiaDTO.getUpdated_panitia_id();

        Optional<Panitia> panitiaOptional = panitiaRepository.findById(updatedPanitiaID);
        if (!panitiaOptional.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        Panitia panitia = panitiaOptional.get();

        KelompokOkk kelompokOkk = kelompokOkkRepository.findByMentorID(panitia.getId());
        if (kelompokOkk != null) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        panitiaRepository.delete(panitia);

        ResponseEntity<Panitia> response =  new ResponseEntity<Panitia>(panitia, HttpStatus.OK);
        
        return response;
    } 


    @GetMapping("/panitia")
    public ResponseEntity<List<Panitia>> getPanitia() {
        List<Panitia> array = panitiaRepository.findAll();

        ResponseEntity<List<Panitia>> response =  new ResponseEntity<List<Panitia>>(array, HttpStatus.OK);
        
        return response;
    } 

    @GetMapping("/available-mentors")
    public ResponseEntity<List<Panitia>> getMentors() {
        List<Panitia> array = panitiaRepository.findAll();

        List<Panitia> array2 = new ArrayList<>();

        for (Panitia panitia : array) {
            if (panitia.getTipePanitia().getName().equals("Badan Pengurus Harian")){
                if (panitia.getDivisiBph().getName().equals("Mentor")){
                    KelompokOkk kelompokOkk = kelompokOkkRepository.findByMentorID(panitia.getId());
                    if (kelompokOkk == null) {
                        array2.add(panitia);
                    }
                }
            }
        }

        ResponseEntity<List<Panitia>> response =  new ResponseEntity<List<Panitia>>(array2, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/kelompokokk")
    public ResponseEntity<KelompokOkk> createKelompokOkk(@RequestBody KelompokOkkDTO kelompokOkkDTO) {
        if (kelompokOkkDTO.getNomor_kelompok() == null || kelompokOkkDTO.getMentor_id() == 0) {            
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        KelompokOkk kelompokOkk = new KelompokOkk();
        kelompokOkk.setNomorKelompok(kelompokOkkDTO.getNomor_kelompok());
        Optional<Panitia> panitia = panitiaRepository.findById(kelompokOkkDTO.getMentor_id());
        if (!panitia.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        if (panitia.get().getTipePanitia().getName().equals("Badan Pengurus Harian") && panitia.get().getDivisiBph().getName().equals("Mentor")){
             kelompokOkk.setPanitia(panitia.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        
    
        kelompokOkkRepository.save(kelompokOkk); // ke repository

        ResponseEntity<KelompokOkk> response =  new ResponseEntity<KelompokOkk>(kelompokOkk, HttpStatus.OK);
        return response;
    }

    @PostMapping("/kelompokokk/update")
    public ResponseEntity<KelompokOkk> updateKelompokOkk(@RequestBody KelompokOkkDTO kelompokOkkDTO) {
        if (kelompokOkkDTO.getNomor_kelompok() == null || kelompokOkkDTO.getMentor_id() == 0) {            
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        long updatedKelompokOKkId = kelompokOkkDTO.getUpdated_kelompok_okk_id();

        Optional<KelompokOkk> kelompokOptional = kelompokOkkRepository.findById(updatedKelompokOKkId);
        if (!kelompokOptional.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        KelompokOkk kelompokOkk = kelompokOptional.get();

        kelompokOkk.setNomorKelompok(kelompokOkkDTO.getNomor_kelompok());
        Optional<Panitia> panitia = panitiaRepository.findById(kelompokOkkDTO.getMentor_id());
        if (!panitia.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        if (panitia.get().getTipePanitia().getName().equals("Badan Pengurus Harian") && panitia.get().getDivisiBph().getName().equals("Mentor")){
             kelompokOkk.setPanitia(panitia.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        
    
        kelompokOkkRepository.save(kelompokOkk); // ke repository

        ResponseEntity<KelompokOkk> response =  new ResponseEntity<KelompokOkk>(kelompokOkk, HttpStatus.OK);
        return response;
    }

    @PostMapping("/kelompokokk/delete")
    public ResponseEntity<KelompokOkk> deleteKelompokOkk(@RequestBody KelompokOkkDTO kelompokOkkDTO) {
        long updatedKelompokOKkId = kelompokOkkDTO.getUpdated_kelompok_okk_id();

        Optional<KelompokOkk> kelompokOptional = kelompokOkkRepository.findById(updatedKelompokOKkId);
        if (!kelompokOptional.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        KelompokOkk kelompokOkk = kelompokOptional.get();

        kelompokOkkRepository.deleteById(kelompokOkk.getId());

        ResponseEntity<KelompokOkk> response =  new ResponseEntity<KelompokOkk>(kelompokOkk, HttpStatus.OK);
        
        return response;
    }

    @GetMapping("/kelompokokk")
    public ResponseEntity<List<KelompokOkk>> getKelompokOkk() {
        List<KelompokOkk> array = kelompokOkkRepository.findAll();

        ResponseEntity<List<KelompokOkk>> response =  new ResponseEntity<List<KelompokOkk>>(array, HttpStatus.OK);
        
        return response;
    }

    @GetMapping("/peserta")
    public ResponseEntity<List<Peserta>> getPeserta() {
        List<Peserta> array = pesertaRepository.findAll();

        ResponseEntity<List<Peserta>> response =  new ResponseEntity<List<Peserta>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/peserta")
    public ResponseEntity<Peserta> createPeserta(@RequestBody PesertaDTO pesertaDTO) {
        Peserta peserta = new Peserta();
        peserta.setName(pesertaDTO.getNama());
        peserta.setNpm(pesertaDTO.getNpm());
        peserta.setAngkatan(pesertaDTO.getAngkatan());
       
        Optional<Fakultas> fakultas = fakultasRepository.findById(pesertaDTO.getFakultas_id());
        if (!fakultas.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        peserta.setFakultas(fakultas.get());

               
        Optional<JalurMasuk> jalurMasuk = jalurMasukRepository.findById(pesertaDTO.getJalur_masuk_id());
        if (!jalurMasuk.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        peserta.setJalurMasuk(jalurMasuk.get());

        Optional<KelompokOkk> kelompokOKK = kelompokOkkRepository.findById(pesertaDTO.getKelompok_okk_id());
        if (!kelompokOKK.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        peserta.setKelompokOkk(kelompokOKK.get());

        pesertaRepository.save(peserta);
        
        return new ResponseEntity<Peserta>(peserta, HttpStatus.OK);
    }

    @PostMapping("/peserta/update")
    public ResponseEntity<Peserta> updatePeserta(@RequestBody PesertaDTO pesertaDTO) {
        Optional<Peserta> optPeserta = pesertaRepository.findById(pesertaDTO.getUpdated_peserta_id());
        if (!optPeserta.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        Peserta peserta = optPeserta.get();
        peserta.setName(pesertaDTO.getNama());
        peserta.setNpm(peserta.getNpm());
        peserta.setAngkatan(peserta.getAngkatan());
       
        Optional<Fakultas> fakultas = fakultasRepository.findById(pesertaDTO.getFakultas_id());
        if (!fakultas.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        peserta.setFakultas(fakultas.get());

               
        Optional<JalurMasuk> jalurMasuk = jalurMasukRepository.findById(pesertaDTO.getJalur_masuk_id());
        if (!jalurMasuk.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        peserta.setJalurMasuk(jalurMasuk.get());

        Optional<KelompokOkk> kelompokOKK = kelompokOkkRepository.findById(pesertaDTO.getKelompok_okk_id());
        if (!kelompokOKK.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        peserta.setKelompokOkk(kelompokOKK.get());

        pesertaRepository.save(peserta);
        
        return new ResponseEntity<Peserta>(peserta, HttpStatus.OK);
    }

    @PostMapping("/peserta/delete")
    public ResponseEntity<Peserta> deletePeserta(@RequestBody PesertaDTO pesertaDTO) {
        Optional<Peserta> optPeserta = pesertaRepository.findById(pesertaDTO.getUpdated_peserta_id());
        if (!optPeserta.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        
        Peserta peserta = optPeserta.get();

        pesertaRepository.delete(peserta);
        
        return new ResponseEntity<Peserta>(peserta, HttpStatus.OK);
    }

    @GetMapping("/jalurmasuk")
    public ResponseEntity<List<JalurMasuk>> getJalurMasuk() {
        List<JalurMasuk> array = jalurMasukRepository.findAll();

         ResponseEntity<List<JalurMasuk>> response =  new ResponseEntity<List<JalurMasuk>>(array, HttpStatus.OK);
        
        return response;
    }

    @PostMapping("/jalurmasuk")
    public ResponseEntity<JalurMasuk> createJalurMasuk(@RequestBody NameDTO namaDTO) {
        JalurMasuk data = new JalurMasuk();
        data.setName(namaDTO.getName());

        jalurMasukRepository.save(data);
        
        return new ResponseEntity<JalurMasuk>(data, HttpStatus.OK);
    }

    @PostMapping("/jalurmasuk/update")
    public ResponseEntity<JalurMasuk> updateJalurMasuk(@RequestBody NameDTO namaDTO) {
        Optional<JalurMasuk> opt = jalurMasukRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        JalurMasuk data = opt.get();
        data.setName(namaDTO.getName());
        jalurMasukRepository.save(data);
        
        return new ResponseEntity<JalurMasuk>(data, HttpStatus.OK);
    }

    @PostMapping("/jalurmasuk/delete")
    public ResponseEntity<JalurMasuk> deleteJalurMasuk(@RequestBody NameDTO namaDTO) {
        Optional<JalurMasuk> opt = jalurMasukRepository.findById(namaDTO.getId());

        if (!opt.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        }

        JalurMasuk data = opt.get();

        jalurMasukRepository.delete(data);
        
        return new ResponseEntity<JalurMasuk>(data, HttpStatus.OK);
    }
}
