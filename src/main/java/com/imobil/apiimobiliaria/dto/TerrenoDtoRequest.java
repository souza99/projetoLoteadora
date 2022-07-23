package com.imobil.apiimobiliaria.dto;


import org.springframework.beans.BeanUtils;

import com.imobil.apiimobiliaria.entity.Loteadora;
import com.imobil.apiimobiliaria.entity.Terreno;

import lombok.Data;

@Data
public class TerrenoDtoRequest {

    private Long id;
    private String endereco;
    private Double valorPedida;
    private String medidas;
    private String situacao="livre";
    private Loteadora loteadora;


    public Terreno toTerreno(TerrenoDtoRequest terrenoDto){
        Terreno terreno  = new Terreno();
        BeanUtils.copyProperties(terrenoDto, terreno);
        return terreno;
    }
}