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
public class Conta {
    private Correntista correntista; //composição
    private int numero;
    private float saldo;

    //construtor
    public Conta(Correntista correntista) {
        //recebe o objeto correntista como parâmetro do construtor
        this.correntista = correntista;
    }
    
    //métodos
    public boolean depositar(float valor) {
        saldo += valor;
        return true;
    }
    
    public boolean retirar(float valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        }
        else
            return false;
    }
    
    //getters e setters    
    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {    
        this.saldo = saldo;
    }

    
}
