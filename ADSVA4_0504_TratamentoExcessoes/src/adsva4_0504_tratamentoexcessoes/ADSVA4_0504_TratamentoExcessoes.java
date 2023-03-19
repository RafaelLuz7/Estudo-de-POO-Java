/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_0504_tratamentoexcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class ADSVA4_0504_TratamentoExcessoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        try {
            bloco de tentativa de execução
        } catch (Erro e){
        caso ocorra algum erro no bloco anterior o processamento é desviado para e
        }
        */
        
        Scanner teclado = new Scanner(System.in);
        int numero=0, numero2=0;
        try{
            System.out.println("Digite um Numero: ");
            numero = teclado.nextInt();
            
            System.out.println("Digite outro Numero: ");
            numero2 = teclado.nextInt();
            
            System.out.println("O primeiro dividido pelo segundo é: " + (numero/numero2));
            
        }  //captura erro generico = especifico
         catch(ArithmeticException ex){
            System.out.println("Ocorreu um erro: "+ ex.getMessage());
            System.exit(-1);//interrompe a execução do programa
        }
         catch(InputMismatchException ex){
            System.out.println("Ocorreu um erro: "+ ex.getMessage());
            System.exit(-1);//interrompe a execução do programa
        }
         catch(Exception ex){
            System.out.println("Ocorreu um erro: "+ ex.getMessage());
            System.exit(-1);//interrompe a execução do programa
        }
        
        System.out.println("O numero digitado foi " + numero);
    }
        
        /* captura erro especifico
 
        catch(InputMismatchException ex){
            System.out.println("Ocorreu um erro: "+ ex.getMessage());
            System.exit(-1);//interrompe a execução do programa
        }
        System.out.println("O numero digitado foi " + numero);
*/    
} 
    

