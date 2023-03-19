/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_1502_primeiraclase;

/**
 *
 * @author Rafael
 */
public class Pessoa {
    //criando os atributos
    private String nome;
    private String email;
    private float salario;
    private int idade;
    
    //Getters e Setters
    //alt esquerdo + insert

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    //métodos (começam com letra minuscula)
    public float calcularINSS(){
        float valorINSS;
        valorINSS = salario * 0.11f;
        return valorINSS;
    }
    public void fazerAniversario(){
    idade++;
    }
    public String dadosGerais(){
        String retorno="";
        
        retorno = "Nome: "  + nome +
                   "\nemail: " + email +
                    "\nslario: " + salario +
                    "\nidade: " + idade;
        return retorno;
    }
}
