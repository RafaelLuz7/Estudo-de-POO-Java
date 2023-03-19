/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_0103_exemplocomposicao;

/**
 *
 * @author Rafael
 */
public class ADSVA4_0103_ExemploComposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //antes de instanciar um carro deve-se criar um motor
       Motor m = new Motor();
       //criando um carro
       Car c1 = new Car(m);
       
       c1.setProprietario("Rafael");
       c1.setAnoModelo(2020);
       
       //há duas formas de colocar dados dentro do motor
       c1.getMotor().setCilindros(6);
       //ou
       m.setNumero("XB98753lRBR");
       
        System.out.println("Carro");
        System.out.println("Proprietario: "+c1.getProprietario());
        System.out.println("Motor:");
        System.out.println("Cilindros: "+c1.getMotor().getCilindros());
        System.out.println("Numero: "+c1.getMotor().getNumero());
        
       
    }
    
}
