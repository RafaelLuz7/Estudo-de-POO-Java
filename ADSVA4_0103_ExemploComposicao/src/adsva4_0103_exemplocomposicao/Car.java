/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_0103_exemplocomposicao;

/**
 *
 * @author Rafael
 */
public class Car {
    private int anoModelo;
    private String proprietario;
    //composição
    private Motor motor; //nao precisa ser instanciado
    
    //construtores
    public Car(Motor motor){ //obriga a ter motor para criar o carro
        setMotor(motor);
    }
    //getters e setters
    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
}
