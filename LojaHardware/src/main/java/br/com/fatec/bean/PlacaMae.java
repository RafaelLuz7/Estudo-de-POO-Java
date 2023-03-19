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
public class PlacaMae {
    private int codPlacaMae;
    private String modeloPlacaMae;
    private String descricaoPlacaMae;
    private double valorPlacaMae;

    
    
    public PlacaMae() {
    }

    @Override
    public String toString() {
        return "PlacaMae{" + "modeloPlacaMae=" + modeloPlacaMae + '}';
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codPlacaMae;
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
        final PlacaMae other = (PlacaMae) obj;
        if (this.codPlacaMae != other.codPlacaMae) {
            return false;
        }
        return true;
    }

    
    
    
    public PlacaMae(int codPlacaMae, String modeloPlacaMae, String descricaoPlacaMae, double valorPlacaMae) {
        this.codPlacaMae = codPlacaMae;
        this.modeloPlacaMae = modeloPlacaMae;
        this.descricaoPlacaMae = descricaoPlacaMae;
        this.valorPlacaMae = valorPlacaMae;
    }

    
    
    public int getCodPlacaMae() {
        return codPlacaMae;
    }

    public void setCodPlacaMae(int codPlacaMae) {
        this.codPlacaMae = codPlacaMae;
    }

    public String getModeloPlacaMae() {
        return modeloPlacaMae;
    }

    public void setModeloPlacaMae(String modeloPlacaMae) {
        this.modeloPlacaMae = modeloPlacaMae;
    }

    public String getDescricaoPlacaMae() {
        return descricaoPlacaMae;
    }

    public void setDescricaoPlacaMae(String descricaoPlacaMae) {
        this.descricaoPlacaMae = descricaoPlacaMae;
    }

    public double getValorPlacaMae() {
        return valorPlacaMae;
    }

    public void setValorPlacaMae(double valorPlacaMae) {
        this.valorPlacaMae = valorPlacaMae;
    }
    
    
}
