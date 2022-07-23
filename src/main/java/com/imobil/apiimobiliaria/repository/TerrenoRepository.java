package com.imobil.apiimobiliaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.imobil.apiimobiliaria.entity.Terreno;


public interface TerrenoRepository extends JpaRepository<Terreno, Long> {

    //QUERY DO TIPO (HQL)
    @Query("SELECT t FROM Terreno t where t.loteadora.id =?2 and t.situacao=?1")
    List<Terreno> terrenoLoteadoraSituacao(String situacao, Long idLoteadora);

    @Query("SELECT t FROM Terreno t where t.loteadora.id = ?1 and t.situacao <> 'vendido' ")
    List<Terreno> listaDeTerrenosDeAcordoComLoteadoraEStatusNaoVendidoList(Long idLoteadora);
}
