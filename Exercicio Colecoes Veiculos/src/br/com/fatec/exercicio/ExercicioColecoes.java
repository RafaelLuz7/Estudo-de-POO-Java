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
public class ExercicioColecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proprietario p = new Proprietario();
        
        p.addVeiculo(new Veiculo("ABC-0099", 45000));
        p.addVeiculo(new Veiculo("ABC-0099", 45000));
        p.addVeiculo(new Veiculo("FIO-2355", 98343));
        p.addVeiculo(new Veiculo("CPE-2387", 5000));
        p.addVeiculo(new Veiculo("BCD-3249", 32400));
        p.addVeiculo(new Veiculo("LLL-2322", 95000));
        
        p.setNome("Ricardo Barros");
        
        //listar os veiculos
        for(Veiculo v : p.getVeiculos()){
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Valor: " + v.getValor());
            System.out.println("Hash: " + v.hashCode());
            System.out.println("Memória: " + v);
            System.out.println("============================================");
        }
        
        System.out.println("O total dos bens é R$ " + p.valorBens());
    }
    
}
