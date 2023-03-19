/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.lojahardware;

import br.com.fatec.bean.MontarPc;
import br.com.fatec.bean.PlacaMae;
import br.com.fatec.bean.Processador;
import java.sql.SQLException;

import java.sql.SQLException;

import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class testarconexao {

    public static void main(String[] args) { //psvm
        
        System.out.println("Testanto conexão com Banco de Dados");
//para mariaDB
//String url = "jdbc:mariadb://localhost:3306/lojahardware";

//para MySQL
       String url = "jdbc:mysql://localhost:3306/lojahardware";

//Para SQL Server
//String url = "jdbc:sqlserver://localhost:1433;databaseName=lojahardware";


        java.sql.Connection conexao = null;
        try {
            String root;
            conexao = java.sql.DriverManager.getConnection(url, "root", "");
            System.out.println("Conectado");
            System.out.println("Fechando...");
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex.getMessage());
        }
        
       
    }
}
