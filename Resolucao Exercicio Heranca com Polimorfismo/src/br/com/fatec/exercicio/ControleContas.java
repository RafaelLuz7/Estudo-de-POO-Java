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
public class ControleContas {
    //cria variável para a CLASSE e não para a Instância
    private static float totalSaldoInicial;

    //metodos
    public static void registro(Conta conta) {
        totalSaldoInicial += conta.getSaldo();
    }
    
    public static float getTotalSaldoInicial() {
        return totalSaldoInicial;
    }

    private static void setTotalSaldoInicial(float totalSaldoInicial) {
        ControleContas.totalSaldoInicial = totalSaldoInicial;
    }
    
    
}
