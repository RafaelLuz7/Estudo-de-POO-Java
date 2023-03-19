/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_2203_colecoesbusca;

/**
 *
 * @author Rafael
 */
public class ADSVA4_2203_ColecoesBusca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        if(a == b) funciona bem para var do tipo primitivo(int, double, float)
        
        quando se usa a comparação de objetos
        if(objA == objB) Isso não funciona
        
        deve usar o equals() e reprograma-lo
        if(objA.equals(objB)
        
        */
        Carro c1 = new Carro("aaa", "jose");
        Carro c2 = new Carro("aaa", "jose");
        
        System.out.println("C1 hash" + c1.hashCode());
        System.out.println("C2 hash" + c2.hashCode());
        
        if(c1.equals(c2))
              System.out.println("C1 é igual a C2");
        
        //comparar objetos não é igual comparar variaveis primitivas
        //informar ao JAVA como comparar!
        //reprogramar métodos equals() e hashCode() da classe em questão
        
        
    }
    
}
