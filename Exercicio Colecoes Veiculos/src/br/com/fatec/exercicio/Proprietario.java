/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Proprietario {
    private String nome, cpf;
    private List<Veiculo> veiculos = new ArrayList<>();

    
    //métodos
    /**
     * Permite a inclusão de veículos para o proprietário, 
     * não permite veiculos duplicados. 
     * @param v Veiculo a ser incluido
     */
    public void addVeiculo(Veiculo v) {
        if(existeVeiculo(v)) { //se não existir duplicado
            JOptionPane.showMessageDialog(null, "Veículo duplicado");
            return;
        }
    
        if(veiculos.size() < 5) {
            //adiciona o veículo dentro da coleção
            veiculos.add(v);
        }
        else {
            int resp;
            resp = JOptionPane.showConfirmDialog(null, 
                    "Você já possui " + veiculos.size() +
                    " veículos, deseja incluir mais este mesmo?", 
                    "Mensagem ao Usuário", JOptionPane.YES_NO_OPTION);
            if(resp == JOptionPane.YES_OPTION) {
                veiculos.add(v);
            }
        } 
    }
    
    /**
     * Devolve a somatoria de todos os valores dos veículos 
     * @return Valores
     */
    public float valorBens() {
        //usando iterador
        Iterator<Veiculo> it = veiculos.iterator();
        
        float somatoria = 0;
        
        while(it.hasNext()) { //verifica se tem um próximo objeto
            Veiculo aux = it.next(); //pega o próximo objeto
            somatoria += aux.getValor();
        }
        
        //usando o foreach
        somatoria = 0;
        for (Veiculo aux : veiculos) {
            somatoria += aux.getValor();
        }
        
        return somatoria;
    }
    
    /**
     * Verifica se o veículo inserido existe ou não na lista
     * @return 
     */
    private boolean existeVeiculo(Veiculo v) {
        for (Veiculo aux : veiculos) {
            if(aux.getPlaca() == v.getPlaca())
                return true;
        }
        
        return false;
    }
    
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

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    
    
}
