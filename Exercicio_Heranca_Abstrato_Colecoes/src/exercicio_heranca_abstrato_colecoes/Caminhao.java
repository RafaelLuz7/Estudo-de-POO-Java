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
public class Caminhao extends Veiculo {
    private String tipo;

    public Caminhao(Chassi chassi) {
        super(chassi);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
