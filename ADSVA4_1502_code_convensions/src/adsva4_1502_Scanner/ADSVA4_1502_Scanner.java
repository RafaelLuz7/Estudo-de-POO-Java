/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_1502_Scanner;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class ADSVA4_1502_Scanner {
   
    /**
     *
     * @param args the command line arguments
     */ 
   
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String txtString = "Test";
        Scanner txt = new Scanner(txtString);
        
   

    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    while(sc.hasNext()){ // hasNext() verifica se ha elementos restantes na lista
      i++;
      System.out.println("Token: "+sc.next());
    }
    sc.close(); 
  }
}
    
    
    
