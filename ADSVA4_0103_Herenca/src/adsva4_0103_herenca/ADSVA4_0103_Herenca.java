/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsva4_0103_herenca;

/**
 *
 * @author Rafael
 */
public class ADSVA4_0103_Herenca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PessoaFisica pf = new PessoaFisica("Argentina");
        PessoaJuridica pj = new PessoaJuridica("Itália");
        
        pf.setNome("Pedro");
        pf.setPais("Argentina");
        pf.setCpf("123.456.12-99");
        pf.setDataCadastro("08/03/2021");
        
        System.out.println("Dados PF: "+pf.mostraDados());
        System.out.println("Desconto PF: "+ pf.desconto());
        System.out.println("Desconto PJ: "+pj.desconto());
        
    
    }
    
}
