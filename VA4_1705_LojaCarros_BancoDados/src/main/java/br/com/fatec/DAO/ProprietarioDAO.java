/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.Proprietario;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Rafael
 */
public class ProprietarioDAO implements DAO <Proprietario> {

    //variaveis auxiliares
    //permite o uso de comandos DML (select, insert, delete e update) para
    //acessar nosso SGBD
    private java.sql.PreparedStatement pst;
    
    //permite armazenar um conjunto de dados vindo do SGBD para ser
    //manipulado
    private java.sql.ResultSet rs;
    
    //representar os dados do  meu negócio
    private Proprietario proprietario;    
    
    
    @Override
    public boolean insere(Proprietario obj) throws SQLException {
        String sql = "INSERT INTO Proprietario (codProprietario, nome) " +
                " VALUES (?, ?)"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando INSERT
        pst.setInt(1, obj.getCodProprietario());
        pst.setString(2, obj.getNome());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
        
    }

    @Override
    public boolean remove(Proprietario obj) throws SQLException {
        String sql = "DELETE FROM Proprietario WHERE codProprietario = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando DELETE
        pst.setInt(1, obj.getCodProprietario());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;

    }

    @Override
    public boolean altera(Proprietario obj) throws SQLException {
        String sql = "UPDATE Proprietario SET Nome = ? "
                + "WHERE codProprietario = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando UPDATE
        pst.setInt(2, obj.getCodProprietario());
        pst.setString(1, obj.getNome());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
        
    }

    @Override
    public Proprietario buscaID(Proprietario obj) throws SQLException {
        String sql = "SELECT * FROM Proprietario "
                + "WHERE codProprietario = ?"; //a ? indica parametros

        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando SELECT
        pst.setInt(1, obj.getCodProprietario());
        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true
        //se nao devolve false
        if(rs.next()) {
            //mover os dados do resultSet para o objeto proprietário
            proprietario = new Proprietario();
            proprietario.setCodProprietario(rs.getInt("codProprietario"));
            proprietario.setNome(rs.getString("Nome"));
        }
        else {
            //não encontrou o registro solicitado
            proprietario = null;
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return proprietario;
        
    }

    @Override
    public Collection<Proprietario> lista(String criterio) throws SQLException {

        //coleção para conter os dados dos proprietários
        Collection<Proprietario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Proprietario ";

        //verificar criterio de seleção
        if(criterio.length() > 0) {
            sql += " WHERE " + criterio;
        }
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //lê todos os registros vindos do banco, joga cada um para um objeto
        //depois coloca o objeto dentro da lista
        while(rs.next()) {
            //mover os dados do resultSet para o objeto proprietário
            proprietario = new Proprietario();
            proprietario.setCodProprietario(rs.getInt("codProprietario"));
            proprietario.setNome(rs.getString("Nome"));
            
            //adciona na lista
            lista.add(proprietario);
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return lista;
        

    }
    
}
