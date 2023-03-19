/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_0103_herenca;

/**
 *
 * @author Rafael
 */
public class Cliente {
   private String pais, dataCadastro;
   public final int desconto = 15; // final int = constante
   
   //construtores
   public Cliente (String pais){
       setPais(pais);
}
   
   //métodos
   public String mostraDados(){
       return "\nPaís: "+ getPais() +
               "\nData Cadastro: "+ getDataCadastro();
   }
   
   public int desconto(){
       return desconto;
   }
   
   //getters e setters

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
   
}
