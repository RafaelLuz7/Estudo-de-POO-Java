/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exercicio;

/**
 *
 * @author Rafael
 */
public class CartaoCredito {
    private String numero;
    private float limite;
    private int diaMelhorCompra;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getDiaMelhorCompra() {
        return diaMelhorCompra;
    }

    public void setDiaMelhorCompra(int diaMelhorCompra) {
        this.diaMelhorCompra = diaMelhorCompra;
    }
    
    
}
