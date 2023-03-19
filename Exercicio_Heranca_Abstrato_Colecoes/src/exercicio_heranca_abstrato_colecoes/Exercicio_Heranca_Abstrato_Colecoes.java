/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_heranca_abstrato_colecoes;

/**
 *
 * @author Rafael
 */
public class Exercicio_Heranca_Abstrato_Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eixo e1 = new Eixo();
        Chassi ch1 = new Chassi(e1);
        Carro c1 = new Carro(ch1);
        c1.getChassi().setComprimento(4);
        
        Eixo e2 = new Eixo();
        Eixo e2_1 = new Eixo();
        Chassi ch2 = new Chassi(e2);
        ch2.addEixo(e2_1);
        Carro c2 = new Carro(ch2);
        c2.getChassi().setComprimento(3);

        Eixo e3 = new Eixo();
        Chassi ch3 = new Chassi(e1);
        Carro c3 = new Carro(ch1);        
        Farol f1 = new Farol();
        Farol f2 = new Farol();
        c3.addFarol(f1);
        c3.addFarol(f2);
        c3.getChassi().setComprimento(6);
        
        Eixo e4 = new Eixo();
        Chassi ch4 = new Chassi(e4);
        Carro c4 = new Carro(ch4);
        c4.getChassi().setComprimento(3);
        
        Eixo e5 = new Eixo();
        Eixo e5_1 = new Eixo();
        Eixo e5_2 = new Eixo();
        Eixo e5_3 = new Eixo();
        Chassi ch5 = new Chassi(e5);
        ch5.addEixo(e5_1);
        ch5.addEixo(e5_2);
        ch5.addEixo(e5_3);
        Cegonheira ceg = new Cegonheira(ch5);
        ceg.setComprimento(15);
        
        ceg.addCarro(c1);
        ceg.addCarro(c2);
        ceg.addCarro(c3);
        ceg.addCarro(c4);
        
        if(ceg.transporteOK()) {
            System.out.println("Cegonheira consegue transportar os carros");
        }
        else {
            System.out.println("Cegonheira NÃO consegue transportar os carros");
        }
    }
    
}
