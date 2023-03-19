/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_carro;

/**
 *
 * @author Rafael
 */
public class Carro {
    private String proprietario;
    private int ano_modelo;
    private float valor;
    private int marchaAtual;
    private int velocidadeAtual=0;
    private boolean ligado;
    
    //construtores
   
    
    //getters e setters
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    private void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
        
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    //métodos
    public void ligarDesligar(){
        if(ligado == false){
           ligado=true;
           System.out.println("Carro ligou");
        }else if(ligado==true){
            ligado=false;
            System.out.println("Carro desligou");
        }
    }
    public int acelerar(){
        if(this.ligado==false){
            System.out.println("O carro precisa estar ligado para acelerar");
        }else if (velocidadeAtual>=100){
            System.out.println("Velocidade chegou no limite!(100km/h)");
        }else{
            setVelocidadeAtual(velocidadeAtual+5);
            if(velocidadeAtual>=20 && velocidadeAtual <40){
                marchaAtual=2;
            }else if(velocidadeAtual>=40 && velocidadeAtual <60){
                marchaAtual=3;
            }
            else if(velocidadeAtual>=60  && velocidadeAtual <80){
                marchaAtual=4;
            }else if(velocidadeAtual>=80){
                marchaAtual=5;
            }
            System.out.println("Velocidade Atual: "+velocidadeAtual+"km/h | Marcha Atual:"+marchaAtual);
        }
        return velocidadeAtual;
       
    }
    public int frear(){
     if(this.ligado==false){
            System.out.println("O carro está desligado!");
        }else if(velocidadeAtual<=0){
            System.out.println("O carro está parado!");
        }else{
         setVelocidadeAtual(velocidadeAtual-5);
         if(velocidadeAtual<=20){
                marchaAtual=1;
            }else if(velocidadeAtual<=40 && velocidadeAtual >20){
                marchaAtual=2;
            }
            else if(velocidadeAtual<=60  && velocidadeAtual >40){
                marchaAtual=3;
            }else if(velocidadeAtual<=80  && velocidadeAtual >60){
                marchaAtual=4;
            }
          System.out.println("Velocidade Atual: "+velocidadeAtual+"km/h | Marcha Atual:"+marchaAtual);
        }
        return velocidadeAtual;
    }
    public String status(){
        String retorno="";
        
        retorno = "\nStatus Atual do Carro \nProprietario: "  + proprietario+
                   "\nAno do Modelo: " + ano_modelo +
                    "\nValor: R$" + valor +
                    "\nMarcha Atual: "+ marchaAtual +
                    "\nVelocidade Atual: "+ velocidadeAtual +"km/h"+
                    "\nMotor: "+ (isLigado()? "Ligado" : "Desligado");
    
        return retorno;
    }
}
