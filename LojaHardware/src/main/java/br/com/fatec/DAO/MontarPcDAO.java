/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.bean.MontarPc;
import br.com.fatec.bean.PlacaMae;
import br.com.fatec.bean.Processador;
import br.com.fatec.persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author Rafael
 */
public class MontarPcDAO implements DAO <MontarPc> {
        //variaveis auxiliares
    private PreparedStatement pst;
    private ResultSet rs;
    
    //variaveis para dados
    private MontarPc montarpc;
    private PlacaMae placamae;
    private Processador processador;
    
    //para acesso a dados do proprietário
    private PlacaMaeDAO placaDAO = new PlacaMaeDAO();
    private ProcessadorDAO processDAO = new ProcessadorDAO();

    

    @Override
    public boolean insere(MontarPc obj) throws SQLException {
         String sql = "INSERT INTO MontarPc (desconto, valor, codPlacaMae, codProcessador) " +
                " VALUES (?, ?, ?, ?)"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando INSERT
        pst.setDouble(1, obj.getDesconto());
        //busca o código atraves da composição
        pst.setDouble(2, obj.getValor());
        pst.setInt(3, obj.getPlacamae().getCodPlacaMae());
        pst.setInt(4, obj.getProcessador().getCodProcessador());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
    }

    @Override
    public boolean remove(MontarPc obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean altera(MontarPc obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MontarPc buscaID(MontarPc obj) throws SQLException {
        String sql = "SELECT * FROM MontarPc "
                + "WHERE codPlacaMae = ? and codProcessador = ?"; //a ? indica parametros

        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando SELECT
        pst.setInt(1, obj.getPlacamae().getCodPlacaMae());
        pst.setInt(2, obj.getProcessador().getCodProcessador());

        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true
        //se nao devolve false
        if(rs.next()) {
            
            //criar o objeto proprietario vindo do banco
            placamae = new PlacaMae();
            placamae.setCodPlacaMae(rs.getInt("codPlacaMae"));
            processador = new Processador();
            processador.setCodProcessador(rs.getInt("codProcessador"));
            
            //faz a busca na tabela proprietario
            placamae = placaDAO.buscaID(placamae);
            processador = processDAO.buscaID(processador);
            
            //mover os dados do resultSet para o objeto Veiculo
            montarpc = new MontarPc();
            //montarpc.setDesconto(rs.getDouble("desconto"));
            montarpc.setValor(rs.getDouble("valor"));
        }
        else {
            //não encontrou o registro solicitado
            montarpc = null;
        }
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionou ou nao
        return montarpc;    }

    @Override
    public Collection<MontarPc> lista(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
