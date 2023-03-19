/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_1502_primeiraclase;

/**
 *
 * @author Rafael
 */
public class ADSVA4_1502_PrimeiraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciar um objeto
        Pessoa p1;
        // criar uma estância na memória e fazer com que a varivel p1 aponte para essa memória, criando um objeto
        p1 = new Pessoa();
        //outra maneira 
        Pessoa p2 = new Pessoa();
        
        p1.setNome("Rafael");
        p1.setIdade(23);
        p1.setEmail("rafaeldraw97@hotmail.com");
        p1.setSalario(3000.00f);//não esquecer o f no final para float
        
        p2.setNome("Luci");
        p2.setIdade(27);
        p2.setEmail("lucidy137@gmail.com");
        p2.setSalario(5000);
        
        //chamando metodos
        //escreva "sout"  e aperte tab = System.out.println("");
        System.out.println("O valor do INSS é R$" + p1.calcularINSS() );
        System.out.println("Os dados de p1: "+ p1.dadosGerais());
        
        p1.fazerAniversario();
        System.out.println("A idade de p1 é: "+ p1.getIdade());
        
    }    
    
}
