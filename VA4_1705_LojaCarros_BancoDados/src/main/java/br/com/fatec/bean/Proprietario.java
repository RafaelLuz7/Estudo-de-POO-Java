/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.bean;

/**
 * Toda classe deve ser criado:
 * Getters e Setters
 * Construtores
 * toString() --> para apresentação em comboBox
 * equals() e hashCode() --> para comparação de objetos
 * 
 * @author Rafael
 */
public class Proprietario {
    private int codProprietario;
    private String nome;

    //equals() e hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codProprietario;
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
        if (this.codProprietario != other.codProprietario) {
            return false;
        }
        return true;
    }

    
    //toString
    @Override
    public String toString() {
        return getNome();
    }
    
    //construtores
    public Proprietario() {
    }

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
