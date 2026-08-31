package com.gabriel.controlefinanceiro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data;
    private BigDecimal valor;
    private String descricao;


    /*--- DEFININDO CONSTRUTOR ---*/

    public Despesa (Date despesaData, BigDecimal despesaValor, String despesaDescricao) {
        data = despesaData;
        valor = despesaValor;
        descricao = despesaDescricao;
    }

    public Despesa() {

    }

    /*--- DEFININDO GETTERS E SETTERS ---*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}