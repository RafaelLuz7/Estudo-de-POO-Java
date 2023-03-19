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
public class ExercicioHerancaComPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Normal normal = new Normal(new Correntista());
        normal.getCorrentista().setNome("Eliane");
        
        Correntista corEspecial = new Correntista();
        corEspecial.setNome("Ernesto");
        Especial especial = new Especial(corEspecial);
        
        Poupanca poupanca = new Poupanca(new Correntista());
        poupanca.getCorrentista().setNome("Erica");
        
        //colocar saldos iniciais
        normal.setSaldo(1500);
        especial.setSaldo(1000);
        poupanca.setSaldo(500);
        
        //colocar os limites
        especial.setLimite(500);
        
        //depositar
        normal.depositar(100);
        especial.depositar(400);
        poupanca.depositar(100);
        
        /*if(!normal.retirar(300)) {
            System.out.println("Erro na retirada" );
        }
*/
        
        //retirar
        System.out.println("Retirar 1500 da normal: " + normal.retirar(1500));
        System.out.println("Retirar 1700 da Especial: " + especial.retirar(1700));
        System.out.println("Retirar 700 da Poupança: " + poupanca.retirar(700));
        
        //exibir saldos
        System.out.println("Saldo Normal: " + normal.getSaldo());
        System.out.println("Saldo Especial: " + especial.getSaldo());
        System.out.println("Saldo Poupança: " + poupanca.getSaldo());
        
        //rendimentos
        poupanca.setJuros(15);
        poupanca.geraRendimento();
        
        //saldos após o rendimento
        System.out.println("Saldo após rendimentos");
        System.out.println("Saldo Poupança: " + poupanca.getSaldo());
        
        //controle das contas
        ControleContas.registro(normal);
        ControleContas.registro(especial);
        ControleContas.registro(poupanca);
        
        //mostra o total de saldos
        System.out.println("\nTotal de saldos das contas: " + ControleContas.getTotalSaldoInicial());
    }
    
}
