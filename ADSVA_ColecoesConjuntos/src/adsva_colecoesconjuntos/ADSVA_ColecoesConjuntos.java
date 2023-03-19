/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva_colecoesconjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Rafael
 */
public class ADSVA_ColecoesConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> listaNomes = new ArrayList<>();
        Set<String> conjuntoNomes = new HashSet<>();
        
        //adicionando os mesmos dados para as duas coleçoes
        listaNomes.add("Zulu");
        listaNomes.add("Ana");
        listaNomes.add("Marcos");
        listaNomes.add("Carla");
        listaNomes.add("Ana");
        
        conjuntoNomes.add("Zulu");
        conjuntoNomes.add("Ana");
        conjuntoNomes.add("Marcos");
        conjuntoNomes.add("Carla");
        conjuntoNomes.add("Ana");
        
        System.out.println("List");
        for (String listaNome : listaNomes) {
            System.out.println("-->" + listaNome);
           
        }
        
         System.out.println("Hash");
        for (String conjuntoNome : conjuntoNomes) {
            System.out.println("-->" + conjuntoNome);
           
        }
    }
    
}
