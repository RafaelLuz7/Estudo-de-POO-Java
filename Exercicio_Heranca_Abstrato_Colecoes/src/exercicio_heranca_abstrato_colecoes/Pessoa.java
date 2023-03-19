/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_heranca_abstrato_colecoes;

/**
 *
 * @author Rafael
 */
public class Pessoa {
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    public boolean permiteDirigir(Veiculo v) {
        if(v instanceof Carro)
            return true;
        else
            return false;
    }
}
