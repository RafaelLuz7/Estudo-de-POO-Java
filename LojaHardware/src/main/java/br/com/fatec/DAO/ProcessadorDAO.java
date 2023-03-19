/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.Processador;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Rafael
 */
public class ProcessadorDAO implements DAO <Processador> {
  //variaveis auxiliares
    //permite o uso de comandos DML (select, insert, delete e update) para
    //acessar nosso SGBD
    private java.sql.PreparedStatement pst;
    
    //permite armazenar um conjunto de dados vindo do SGBD para ser
    //manipulado
    private java.sql.ResultSet rs;
    
    //representar os dados do  meu negócio
    private Processador processador;  
    
    @Override
    public boolean insere(Processador obj) throws SQLException {
                String sql = "INSERT INTO Processador (codProcessador, modeloProcessador, descricaoProcessador, valorProcessador) " +
                " VALUES (?, ?, ?, ?)"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        
        pst.setInt(1, obj.getCodProcessador());
        pst.setString(2, obj.getModeloProcessador());
        pst.setString(3, obj.getDescricaoProcessador());
        pst.setDouble(4, obj.getValorProcessador());
        
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
    }

    @Override
    public boolean remove(Processador obj) throws SQLException {
      String sql = "DELETE FROM Processador WHERE codProcessador = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando DELETE
        pst.setInt(1, obj.getCodProcessador());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
    }

    @Override
    public boolean altera(Processador obj) throws SQLException {
              String sql = "UPDATE Processador SET modeloProcessador = ?, descricaoProcessador = ?, valorProcessador = ?"
                + "WHERE codProcessador = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando UPDATE
        pst.setInt(4, obj.getCodProcessador());
        pst.setString(1, obj.getModeloProcessador());
        pst.setString(2, obj.getDescricaoProcessador());
        pst.setDouble(3, obj.getValorProcessador());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
        
    }

    @Override
    public Processador buscaID(Processador obj) throws SQLException {
        String sql = "SELECT * FROM Processador "
                + "WHERE codProcessador = ?"; //a ? indica parametros

        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando SELECT
        pst.setInt(1, obj.getCodProcessador());
        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true
        //se nao devolve false
        if(rs.next()) {
            //mover os dados do resultSet para o objeto proprietário
            processador = new Processador();
            processador.setCodProcessador(rs.getInt("codProcessador"));
            processador.setModeloProcessador(rs.getString("modeloProcessador"));
            processador.setDescricaoProcessador(rs.getString("descricaoProcessador"));
            processador.setValorProcessador(rs.getDouble("valorProcessador"));
        }
        else {
            //não encontrou o registro solicitado
            processador = null;
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return processador;
        
    }

    @Override
    public Collection<Processador> lista(String criterio) throws SQLException {
        //coleção para conter os dados dos proprietários
        Collection<Processador> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Processador ";

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
            processador = new Processador();
            processador.setCodProcessador(rs.getInt("codProcessador"));
            processador.setModeloProcessador(rs.getString("modeloPreocessador"));
            processador.setDescricaoProcessador(rs.getString("descricaoProcessador"));
            processador.setValorProcessador(rs.getDouble("valorProcessador"));
            //adciona na lista
            lista.add(processador);
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return lista;
        
    }
}
