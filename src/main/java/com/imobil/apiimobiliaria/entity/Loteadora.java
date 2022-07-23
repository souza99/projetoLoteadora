package com.imobil.apiimobiliaria.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Loteadora implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nomeFantasia;
    private String razaoSocial;
    private String endereco;
    private String telefone;
    private String porcentagemComissao;
}
