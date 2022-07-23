package com.imobil.apiimobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imobil.apiimobiliaria.entity.Loteadora;
import com.imobil.apiimobiliaria.service.LoteadoraService;

@RestController
@RequestMapping("/api/loteadora")
public class LoteadoraController {
    
    @Autowired
    private LoteadoraService loteadoraService;

    @PostMapping("/")
    public ResponseEntity<Loteadora> salvar(@RequestBody Loteadora loteadora){
        System.out.println(loteadora.getNomeFantasia());
       return ResponseEntity.ok().body(loteadoraService.salvar(loteadora));
    }
}
