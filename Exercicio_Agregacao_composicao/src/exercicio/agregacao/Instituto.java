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
public class Instituto {
    private String siglaInstituto, nomeInstituto;
    //agregação
    private Curso curso;

    public Instituto() {
        //cria o curso toda vez que for criado um instituto
        curso = new Curso();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    public String getSiglaInstituto() {
        return siglaInstituto;
    }

    public void setSiglaInstituto(String siglaInstituto) {
        this.siglaInstituto = siglaInstituto;
    }

    public String getNomeInstituto() {
        return nomeInstituto;
    }

    public void setNomeInstituto(String nomeInstituto) {
        this.nomeInstituto = nomeInstituto;
    }
   
   
}
