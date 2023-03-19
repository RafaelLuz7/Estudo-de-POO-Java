/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_2202_construtores;

/**
 *
 * @author Rafael
 */
public class Conta {
    private int numero;
    private double saldo;
    
    //classes externas
    private Cliente cliente;
    
    
    
    //construtores
    public Conta(){// Construtor DEFAULT.
        System.out.println("Estou criando um Objeto Conta");
       // setTitular("a definir");   //ou titular = "a definir"
       //instancia o objeto cliente
       cliente = new Cliente();
     
    }
    public Conta(String titular, double saldo){//construtor parâmetrico
        //instancia o objeto cliente
         cliente = new Cliente();
         //Coloca o titular recebido dentro do Objeto Cliente
         getCliente().setTitular(titular);
         //ou
         setSaldo(saldo);
        //this.titular = titular;
        
     
    }
    public Conta(String titular, double saldo, int numero){
         
       //chama construtor parametrico
       this(titular,saldo);
       //atribui o valor "numero" para o atributo
       setNumero(numero);
    }
    
    //getters e setters 

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
