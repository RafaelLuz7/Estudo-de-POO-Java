/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_heranca_abstrato_colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rafael
 */
public class Cegonheira extends Caminhao {
    private int comprimento;
    private Set<Carro> carros = new HashSet<>();

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public Set<Carro> getCarros() {
        return carros;
    }

    public void setCarros(Set<Carro> carros) {
        this.carros = carros;
    }

    
    public Cegonheira(Chassi chassi) {
        super(chassi);
    }
    
    public void addCarro(Carro carro) {
        carros.add(carro);
    }
    
    //para remover um objeto carro é preciso reprogramar os métodos hashcode() e equals() da classe
    public boolean removeCarro(Carro c) {
        return carros.remove(c);
    }
    
    public boolean transporteOK() {
        float tamTotal=0;
        
        for (Carro aux : carros) {
            tamTotal += aux.getChassi().getComprimento();                    
        }
        
        if(tamTotal > this.comprimento)
            return false;
        else
            return true;
    }
}
