/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_2203_colecoesmapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafael
 */
public class ADSVA4_2203_ColecoesMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Map<String, Carro> mapas = new HashMap<>();
        
        Carro c1 = new Carro();
        c1.setPlaca("AAA 000");
        c1.setPotencia(80);
        
        Carro c2 = new Carro();
        c2.setPlaca("BBB 111");
        c2.setPotencia(50);
        
        // para armazernar dados, k guarda  a placa do carro como chave e o objeto como item
        mapas.put(c1.getPlaca(), c1);
        mapas.put(c2.getPlaca(), c2);
       
        //para buscar
        System.out.println("Potencia de c1: " + mapas.get("AAA 000").getPotencia());
        
        //listar
        for (Object mapa : mapas.values()) {
            System.out.println("Placa: " + ((Carro)mapa).getPlaca());
        }
        
    }
    
}
