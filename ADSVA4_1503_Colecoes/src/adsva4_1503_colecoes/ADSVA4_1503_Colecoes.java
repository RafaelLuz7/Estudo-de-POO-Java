/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_1503_colecoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ADSVA4_1503_Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List listaNomes = new ArrayList();
        listaNomes.add("João");
        listaNomes.add("Pedro");
        listaNomes.add("Antonio");
        
        Carro car1 = new Carro();
        car1.setPlaca("ABC-2567");
        
        Carro car2 = new Carro();
        car2.setPlaca("XYZ-2578");
        
        //lista cm objetos
        List listaCarros = new ArrayList();
        listaCarros.add(car1);
        listaCarros.add(car2);
        
        System.out.println("A lista de Nomes possui " + listaNomes.size() + "elementos");
        System.out.println("A lista de Caros possui " + listaCarros.size() + "elementos");
        
        //para listar os dados de uma coleção
        for(int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Nome: " + listaNomes.get(i));
            
        }
        System.out.println("---------------------");
        for(Object aux : listaNomes){
            System.out.println("Nome: " + (String)aux);
        }
        System.out.println("----------------------");
        
        //enhanced for (for each)
        for (Object aux : listaCarros) {
            //deve ser feito um CAST
            //((Carro)aux).getModelo();
            System.out.println("Placa: "+ ( (Carro)aux).getPlaca());
        
        }
        
        for(int i = 0; i < listaCarros.size(); i++){
            System.out.println("Placa: "+
                    ((Carro)listaCarros.get(i)).getPlaca());
        }
        
        
  
    }
}
