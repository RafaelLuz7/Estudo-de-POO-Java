/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_ex_universidade;

/**
 *
 * @author Rafael
 */
public class Universidade {
    private String sigla;
    private String nome;
    private Instituto instituto;
    
    //construtores
    public Universidade(Instituto instituto){
        setInstituto(instituto);
    }
    
    //getters e setters 

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }
    
}
