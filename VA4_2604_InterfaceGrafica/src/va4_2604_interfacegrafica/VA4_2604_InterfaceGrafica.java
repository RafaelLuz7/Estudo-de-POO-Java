/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package va4_2604_interfacegrafica;

import br.com.fatec.view.DadosPessoais;

/**
 *
 * @author Rafael
 */
public class VA4_2604_InterfaceGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DadosPessoais tela = new DadosPessoais(); //instancia o formulário
        //tela.setVisible(true); //exibe a tela
        
        //Classes de conversões - Wrappers
        /*
        Integer
        Double
        Float
        Character
        Boolean
        String
        */
        
        String numero1, numero2;
        
        numero1 = "10";
        numero2 = "20";
        
        System.out.println("numero1 + numero2 = " + 
                            numero1 + numero2);
        
        System.out.println("numero1 + numero2 = " + 
                            (Integer.parseInt(numero1) + Integer.parseInt(numero2)));
    }
    
}
