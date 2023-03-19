/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_ex_universidade;

import java.util.HashSet;

/**
 *
 * @author Rafael
 */
public class ADSVA4_ex_Universidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instituto i = new Instituto();
        Universidade u = new Universidade(i);
        //segunda maneira 
        //Universidade universidade = new Universidade(new Instituto());
        
        u.getInstituto().setNomeInstituto("Butantã");
        u.getInstituto().setSiglaInstituto("BTT");
        u.setNome("Universidade de São Paulo Publica");
        u.setSigla("USP");
        
        System.out.println("Universidade: "+u.getNome() + "| Sigla: "+u.getSigla());
        System.out.println("Instituto: "+u.getInstituto().getNomeInstituto()+"| Sigla: "+ u.getInstituto().getSiglaInstituto());
        
    }
    
}
