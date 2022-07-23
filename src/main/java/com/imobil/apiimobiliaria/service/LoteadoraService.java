package com.imobil.apiimobiliaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imobil.apiimobiliaria.entity.Loteadora;
import com.imobil.apiimobiliaria.repository.LoteadoraRepository;

@Service
public class LoteadoraService {
    
    @Autowired
    private LoteadoraRepository loteadoraRepository;

    public Loteadora salvar(Loteadora loteadora){
       return loteadoraRepository.save(loteadora);    
    }

    public Loteadora alterar(Loteadora loteadora){
     
        return loteadoraRepository.save(loteadora);    
     }

    public void excluir(Long id){
        Loteadora loteadora = loteadoraRepository.findById(id).get();
        loteadoraRepository.delete(loteadora);    
     }
}
