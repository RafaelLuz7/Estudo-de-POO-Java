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
public class ADSVA4_Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro a=new Carro();
        a.setAno_modelo(1994);
        a.setLigado(false);
        a.setMarchaAtual(1);
        a.setProprietario("Senna");
        a.setValor(72000.00f);
        
        
        a.ligarDesligar();
        a.ligarDesligar();
        a.acelerar();
        a.ligarDesligar();
        a.acelerar();
        a.frear();
        a.frear();
       
        while(a.getVelocidadeAtual()<100){
            a.acelerar();
            
        }
        a.acelerar();
        System.out.println(a.status());
        
    }
    
}
