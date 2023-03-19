/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.Proprietario;
import br.com.fatec.bean.Veiculo;
import br.com.fatec.persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author Rafael
 */
public class VeiculoDAO implements DAO<Veiculo> {

    //variaveis auxiliares
    private PreparedStatement pst;
    private ResultSet rs;
    
    //variaveis para dados
    private Veiculo veiculo;
    private Proprietario proprietario;
    
    //para acesso a dados do proprietário
    private ProprietarioDAO propDAO = new ProprietarioDAO();
    
    @Override
    public boolean insere(Veiculo obj) throws SQLException {
        String sql = "INSERT INTO Veiculo (placa, codProprietario, modelo, valor) " +
                " VALUES (?, ?, ?, ?)"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando INSERT
        pst.setString(1, obj.getPlaca());
        //busca o código atraves da composição
        pst.setInt(2, obj.getProprietario().getCodProprietario());
        pst.setString(3, obj.getModelo());
        pst.setDouble(4, obj.getValor());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
        
    }

    @Override
    public boolean remove(Veiculo obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean altera(Veiculo obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veiculo buscaID(Veiculo obj) throws SQLException {
        String sql = "SELECT * FROM Veiculo "
                + "WHERE placa = ?"; //a ? indica parametros

        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando SELECT
        pst.setString(1, obj.getPlaca());
        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true
        //se nao devolve false
        if(rs.next()) {
            
            //criar o objeto proprietario vindo do banco
            proprietario = new Proprietario();
            proprietario.setCodProprietario(rs.getInt("codProprietario"));
            
            //faz a busca na tabela proprietario
            proprietario = propDAO.buscaID(proprietario);
            
            //mover os dados do resultSet para o objeto Veiculo
            veiculo = new Veiculo(proprietario);
            veiculo.setModelo(rs.getString("modelo"));
            veiculo.setPlaca(rs.getString("placa"));
            veiculo.setValor(rs.getDouble("valor"));
        }
        else {
            //não encontrou o registro solicitado
            veiculo = null;
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return veiculo;

    }

    @Override
    public Collection<Veiculo> lista(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
