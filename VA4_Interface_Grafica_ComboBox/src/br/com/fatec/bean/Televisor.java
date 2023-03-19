/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.bean;

import java.util.Objects;

/**
 *Quando criar uma classe lembre de reprogramar os seguintes itens:
 * 1-toString(): Para exibir o conteudo correto em uma combobox
 * 2-equals() e hashCode() : para determinar quais atributos
 * farão parte da comparação
 * @author Rafael
 */
public class Televisor {
    private String descricao;
    private double preco;

    public Televisor(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Televisor() {
    }
    
    //toSting
    @Override
    public String toString() {
        return  descricao ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Televisor other = (Televisor) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
