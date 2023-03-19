/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_0504_exercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Chassi {
    private float comprimento, largura, peso;
    private List<Eixo> eixos = new ArrayList<>();
    
    public void addEixo(Eixo eixo){
        eixos.add(eixo);
    }
    public Chassi (Eixo eixo){
        addEixo(eixo);
    }
    
    public Eixo removeEixo(int numero){
        return eixos.remove(numero);
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public List<Eixo> getEixos() {
        return eixos;
    }

    public void setEixos(List<Eixo> eixos) {
        this.eixos = eixos;
    }
    
    
    
}
