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
public class PessoaJuridica extends Cliente { //exetends , passa ter todos atributos de cliente(herença)
    private String razaoSocial, cpfj;
    
    //construtores
    public PessoaJuridica(String pais){
        super(pais);
    }
    
    //métodos
    @Override
    public int desconto(){
        return super.desconto() + 5;
    }
    
    //getters e setters

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfj() {
        return cpfj;
    }

    public void setCpfj(String cpfj) {
        this.cpfj = cpfj;
    }

  
    
}
