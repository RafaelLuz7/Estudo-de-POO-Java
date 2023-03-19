/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exercicio;

/**
 *
 * @author Rafael
 */
public class Investimento extends Conta {
    
    private float juros;

    //metodos
    /**
     * Permite que seja aplicado um rendimento de acordo com os juros no
     * saldo desta conta
     */
    public void geraRendimento() {
        setSaldo(getSaldo() * (1 + juros / 100));
    }
    
//getters e setters
    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
    
    public Investimento(Correntista correntista) {
        super(correntista);
    }
    
}
