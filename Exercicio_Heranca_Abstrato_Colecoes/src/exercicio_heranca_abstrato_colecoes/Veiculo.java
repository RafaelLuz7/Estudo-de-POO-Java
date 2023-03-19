/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_heranca_abstrato_colecoes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafael
 */
public class Veiculo {
    private String cor;
    private Map<Integer, Farol> farois = new HashMap<>();
    private Chassi chassi;

    public void addFarol(Farol farol) {
        //farois.keySet() -> devolve um conjunto de todas as chaves da coleção
        //farois.keySet().size() -> informa quantos itens existem neste coleção, ou seja, quantos
        //farois eu tenho nesse veículo
        
        farois.put(farois.keySet().size(), farol);
    }
    
    public Farol removeFarol(int numero) {
        return farois.remove(numero);
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Map<Integer, Farol> getFarois() {
        return farois;
    }

    public void setFarois(Map<Integer, Farol> farois) {
        this.farois = farois;
    }

    public Chassi getChassi() {
        return chassi;
    }

    public void setChassi(Chassi chassi) {
        this.chassi = chassi;
    }

    
    public Veiculo(Chassi chassi) {
        this.chassi = chassi;
    }

    
    
    
}
