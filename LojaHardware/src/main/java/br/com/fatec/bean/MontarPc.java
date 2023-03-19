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
public class MontarPc {
    private int codPc;
    private double valor;
    private double desconto;
    private PlacaMae placamae;
    private Processador processador;
    
    
    

    public MontarPc(int codPc, double desconto, double valor, PlacaMae placamae, Processador processador) {
        this.codPc = codPc;
      
        this.valor = valor;
        this.placamae = placamae;
        this.processador = processador;
    }

    public MontarPc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getDesconto(){
        desconto = (placamae.getValorPlacaMae() + processador.getValorProcessador())*0.9f;
        return desconto;
    }
    
    public int getCodPc() {
        return codPc;
    }

    public void setCodPc(int codPc) {
        this.codPc = codPc;
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PlacaMae getPlacamae() {
        return placamae;
    }

    public void setPlacamae(PlacaMae placamae) {
        this.placamae = placamae;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.codPc;
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
        final MontarPc other = (MontarPc) obj;
        if (this.codPc != other.codPc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MontarPc{" + "codPc=" + codPc + '}';
    }

    public Object getPlacaMae() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
