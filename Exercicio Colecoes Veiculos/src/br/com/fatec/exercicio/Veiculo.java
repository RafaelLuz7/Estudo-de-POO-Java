/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exercicio;

import java.util.Objects;

/**
 *
 * @author Rafael
 */
public class Veiculo {
    private String placa;
    private float valor;

    public Veiculo() {
    }

    public Veiculo(String placa, float valor) {
        this.placa = placa;
        this.valor = valor;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
