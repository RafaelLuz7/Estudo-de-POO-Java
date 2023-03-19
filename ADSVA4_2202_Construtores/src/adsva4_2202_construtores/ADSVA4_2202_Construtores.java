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
public class ADSVA4_2202_Construtores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c = new Conta();
        Conta c2 = new Conta("Antonio Carlos", 4882.70); 
        Conta c3 = new Conta("pedro", 1500, 1423);
        
        //atribuindo dados manuais no objeto C
        c.getCliente().setTitular("Emerson Oliveira");//com agregação
       // c.setTitular("Emerson Oliveira"); sem agregação
        c.setSaldo(1250.00);
        c.setNumero(1235);
        
        //System.out.println("Titular Conta C: " + c.getTitular());sem agregação
        System.out.println("Titular da conta C:" + c.getCliente().getTitular());//com agregação
        System.out.println("Saldo da Conta C: " + c.getSaldo());
        
        
       // System.out.println("Titular Conta C2: " + c2.getTitular());
        System.out.println("Titular da conta C:" + c2.getCliente().getTitular());//com agregação
        System.out.println("Saldo da Conta C2: " + c2.getSaldo());

        
    }
    
}
