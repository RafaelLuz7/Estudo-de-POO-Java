/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.agregacao;

/**
 *
 * @author Rafael
 */
public class ExercicioAgregacaoComposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1ª maneira
        
        Instituto ins = new Instituto();
        Universidade uni = new  Universidade(ins);
        
        ins.setNomeInstituto("Butantã");
        ins.setSiglaInstituto("but");
        
        ins.getCurso().setCodCurso(123);
        ins.getCurso().setNomeCurso("Vacinas");
        
        uni.setNome("Universidade Publica de São Paulo");
        uni.setSigla("USP");
        
        System.out.println("Universidade: " + uni.getNome());
        System.out.println("Instituto: " + ins.getNomeInstituto());
        
        
        //2ª Maneira
        Universidade universidade = new Universidade(new Instituto());
        
        universidade.setSigla("USP");
        universidade.getInstituto().setNomeInstituto("Butantã");
        
        System.out.println("Universidade: " + universidade.getNome());
        System.out.println("Instituto: " + universidade.getInstituto().getNomeInstituto());
        
    }
    
}
