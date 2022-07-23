package com.imobil.apiimobiliaria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imobil.apiimobiliaria.dto.TerrenoDtoRequest;
import com.imobil.apiimobiliaria.entity.Terreno;
import com.imobil.apiimobiliaria.repository.TerrenoRepository;

@Service
public class TerrenoService {
   
    @Autowired
    private TerrenoRepository terrenoRepository;

    public Terreno salvar(TerrenoDtoRequest terreno){
        return terrenoRepository.save(new TerrenoDtoRequest().toTerreno(terreno));
    }

    public List<Terreno> terrenoLoteadoraSituacao(String situacao, Long idLoteadora){
        return terrenoRepository.terrenoLoteadoraSituacao(situacao, idLoteadora);
    }

    public List<Terreno> aumentaValorTerreosDaLoteadora(Long idLocadora, double porcentagenAumento){
        List<Terreno> listaTerrenos = terrenoRepository.listaDeTerrenosDeAcordoComLoteadoraEStatusNaoVendidoList(idLocadora);

        for(Terreno terreno: listaTerrenos){
            terreno.setValorVenda(terreno.getValorVenda() + (terreno.getValorVenda() * porcentagenAumento));
        }
        terrenoRepository.saveAll(listaTerrenos);

        return listaTerrenos;
    }

}
