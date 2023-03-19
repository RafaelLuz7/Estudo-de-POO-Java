/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.bean;

/**
 *
 * @author Rafael
 */
public class Processador {
    private int codProcessador;
    private String modeloProcessador;
    private String descricaoProcessador;
    private double valorProcessador;

    public Processador() {
    }

    @Override
    public String toString() {
        return "Processador{" + "modeloProcessador=" + modeloProcessador + '}';
    }

 

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codProcessador;
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
        final Processador other = (Processador) obj;
        if (this.codProcessador != other.codProcessador) {
            return false;
        }
        return true;
    }

    
    
    public Processador(int codProcessador, String modeloProcessador, String descricaoProcessador, double valorProcessador) {
        this.codProcessador = codProcessador;
        this.modeloProcessador = modeloProcessador;
        this.descricaoProcessador = descricaoProcessador;
        this.valorProcessador = valorProcessador;
    }

    
    
    public int getCodProcessador() {
        return codProcessador;
    }

    public void setCodProcessador(int codProcessador) {
        this.codProcessador = codProcessador;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public String getDescricaoProcessador() {
        return descricaoProcessador;
    }

    public void setDescricaoProcessador(String descricaoProcessador) {
        this.descricaoProcessador = descricaoProcessador;
    }

    public double getValorProcessador() {
        return valorProcessador;
    }

    public void setValorProcessador(double valorProcessador) {
        this.valorProcessador = valorProcessador;
    }
    
    
}
