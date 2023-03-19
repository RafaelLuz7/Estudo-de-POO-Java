/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.bean;

import java.util.Objects;

/**
 * Toda classe deve ser criado:
 * getters e setters
 * Construtores
 * toString() - para apresentação em combobox
 * equals() e hashCode() - para comparação de objetos
 * 
 * @author Rafael
 */
public class Proprietario {
    private int codProprietario;
    private String nome;

    public Proprietario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
    //equals() e hashCode()

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codProprietario;
        hash = 53 * hash + Objects.hashCode(this.nome);
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
        final Proprietario other = (Proprietario) obj;
        return true;
    }
    
    
    
    //toString

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + '}';
    }
    
    
    
    //construtores
    

    public Proprietario(int codProprietario, String nome) {
        this.codProprietario = codProprietario;
        this.nome = nome;
    }

     //getters e setters
    public int getCodProprietario() {
        return codProprietario;
    }

    public void setCodProprietario(int codProprietario) {
        this.codProprietario = codProprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
