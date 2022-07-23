package com.imobil.apiimobiliaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.TreeNode;
import com.imobil.apiimobiliaria.dto.TerrenoDtoRequest;
import com.imobil.apiimobiliaria.entity.Terreno;
import com.imobil.apiimobiliaria.repository.TerrenoRepository;
import com.imobil.apiimobiliaria.service.TerrenoService;

@Controller
@RequestMapping("/api/terreno")
public class TerrenoController {
    

    @Autowired
    private TerrenoService terrenoService;

    public Terreno salvar(@RequestBody TerrenoDtoRequest terrenoDTO) {
        return terrenoService.salvar(terrenoDTO);
    }

    @GetMapping("/buscarTerrenoLoteadoraSituacao")
    public List<Terreno> terrenosLoteadoraSituacao(
        @RequestParam String situacao, Long idLoteadora) {
        return terrenoService.terrenoLoteadoraSituacao(situacao, idLoteadora);
    }

    @PostMapping("/aumentaValorTerreosDaLoteadora")
    public List<Terreno> terrnosAumentaPreco(
        @RequestParam Long idLoteadora, double porcentagenAumento){
            return terrenoService.aumentaValorTerreosDaLoteadora(idLoteadora, porcentagenAumento);
        }
}
