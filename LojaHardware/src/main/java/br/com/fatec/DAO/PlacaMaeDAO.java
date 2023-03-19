/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.PlacaMae;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Rafael
 */
public class PlacaMaeDAO implements DAO <PlacaMae>{
  //variaveis auxiliares
    //permite o uso de comandos DML (select, insert, delete e update) para
    //acessar nosso SGBD
    private java.sql.PreparedStatement pst;
    
    //permite armazenar um conjunto de dados vindo do SGBD para ser
    //manipulado
    private java.sql.ResultSet rs;
    
    //representar os dados do  meu negócio
    private PlacaMae placamae;  
    
    @Override
    public boolean insere(PlacaMae obj) throws SQLException {
                String sql = "INSERT INTO placamae (codPlacaMae, modeloPlacamae, descricaoPlacaMae, valorPlacaMae) " +
                " VALUES (?, ?, ?, ?)"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        
        pst.setInt(1, obj.getCodPlacaMae());
        pst.setString(2, obj.getModeloPlacaMae());
        pst.setString(3, obj.getDescricaoPlacaMae());
        pst.setDouble(4, obj.getValorPlacaMae());
        
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
    }

    @Override
    public boolean remove(PlacaMae obj) throws SQLException {
      String sql = "DELETE FROM placamae WHERE codPlacaMae = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando DELETE
        pst.setInt(1, obj.getCodPlacaMae());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
    }

    @Override
    public boolean altera(PlacaMae obj) throws SQLException {
              String sql = "UPDATE placamae SET modeloPlacaMae = ?, descricaoPlacaMae = ?, valorPlacaMae = ?"
                + "WHERE codPlacaMae = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando UPDATE
        pst.setInt(4, obj.getCodPlacaMae());
        pst.setString(1, obj.getModeloPlacaMae());
        pst.setString(2, obj.getDescricaoPlacaMae());
        pst.setDouble(3, obj.getValorPlacaMae());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
        
    }

    @Override
    public PlacaMae buscaID(PlacaMae obj) throws SQLException {
        String sql = "SELECT * FROM placamae "
                + "WHERE codPlacaMae = ?"; //a ? indica parametros

        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando SELECT
        pst.setInt(1, obj.getCodPlacaMae());
        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true
        //se nao devolve false
        if(rs.next()) {
            //mover os dados do resultSet para o objeto proprietário
            placamae = new PlacaMae();
            placamae.setCodPlacaMae(rs.getInt("codPlacaMae"));
            placamae.setModeloPlacaMae(rs.getString("modeloPlacaMae"));
            placamae.setDescricaoPlacaMae(rs.getString("descricaoPlacaMae"));
            placamae.setValorPlacaMae(rs.getDouble("valorPlacaMae"));
        }
        else {
            //não encontrou o registro solicitado
            placamae = null;
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return placamae;
        
    }

    @Override
    public Collection<PlacaMae> lista(String criterio) throws SQLException {
        //coleção para conter os dados dos proprietários
        Collection<PlacaMae> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM PlacaMae ";

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
            placamae = new PlacaMae();
            placamae.setCodPlacaMae(rs.getInt("codPlacaMae"));
            placamae.setModeloPlacaMae(rs.getString("modeloPlacaMae"));
            placamae.setDescricaoPlacaMae(rs.getString("descricaoPlacaMae"));
            placamae.setValorPlacaMae(rs.getDouble("valorPlacaMae"));
            
            //adciona na lista
            lista.add(placamae);
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return lista;
        
    }
    
}
