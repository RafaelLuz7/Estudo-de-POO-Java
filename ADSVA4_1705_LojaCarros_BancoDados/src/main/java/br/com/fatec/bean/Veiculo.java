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
public class Veiculo {
    private String placa;
    private String modelo;
    private double valor;
    
    //composição
    private Proprietario proprietario;

    
    //equals e hashCode
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
        final Veiculo other = (Veiculo) obj;
        return true;
    }
    
   //toString()
/*
    @Override
    public int hashCode(){
    int hash=7;
 
    }*/
    
    
    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
    
    
    //construtores
    
    public Veiculo(String placa, String modelo, double valor, Proprietario proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.valor = valor;
        this.proprietario = proprietario;
    }
    
    
  
    public Veiculo(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    
    
    
 //get e set
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    
    
}
