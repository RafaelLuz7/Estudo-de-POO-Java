/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_1503_colecoescomgerenerics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ADSVA4_1503_ColecoesComGerenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List colecaoTeste = new ArrayList();
        
        Carro c1 = new Carro();
        c1.setPlaca("AAA-1111");
        
        colecaoTeste.add(c1);
        colecaoTeste.add("Marcos");
        
        //listar 
        for(int i = 0; i < colecaoTeste.size(); i++){
            //System.out.println("Dados: " + colecaoTeste.get(i));
            //System.out.println("Dados: " + ((Carro)colecaoTeste).getPlaca());
          
            /* if(colecaoTeste.get(i) instanceof String){
                System.out.println("Dados: " + colecaoTeste.get(i));

            }
             if(colecaoTeste.get(i) instanceof Carro){
                System.out.println("Dados: " + ((Carro)colecaoTeste).getPlaca());

            }*/
            
            //resolvendo o problema acima
            List<String> colecaoNome = new ArrayList<>(); //<> = generics, só aceita se for do tipo di objeto entre "<>"
            List<Carro> colecaoCarro = new ArrayList<>();
            
            colecaoNome.add("Rafael");
            colecaoCarro.add(c1);
            
            
            
        }
        
    }
    
}
