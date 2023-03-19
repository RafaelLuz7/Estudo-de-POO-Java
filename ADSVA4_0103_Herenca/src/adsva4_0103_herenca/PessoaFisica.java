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
public class PessoaFisica extends Cliente{
    private String nome, cpf;
    
    //contrutores
    public PessoaFisica(String pais){
        //chama o construtor da classe pai(superclasse)
        super(pais);     //setPais(pais);
    }        
    
    //métodos
    @Override
    public String mostraDados(){
        //busca os dados para exibir da class pai(super)
        String aux = super.mostraDados();
        
        return aux +
                "\nNome: " + getNome()+
                "\nCPF: "+getCpf();
                
    }
    
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
