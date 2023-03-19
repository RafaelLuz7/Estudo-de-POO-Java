/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.adsva4_1705_lojacarros_bancodados;

import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class TestaConexao {

    public static void main(String[] args) { //psvm
        System.out.println("Testanto conexão com Banco de Dados");
//para mariaDB
//String url = "jdbc:mariadb://localhost:3306/Loja";

//para MySQL
       String url = "jdbc:mysql://localhost:3307/loja";

//Para SQL Server
//String url = "jdbc:sqlserver://localhost:1433;databaseName=loja";
//variavel para conexao
        java.sql.Connection conexao = null;
        try {
            String root;
//conectar, informar URL, Usuario e Senha
            conexao = java.sql.DriverManager.getConnection(url, "root", "usbw");
            System.out.println("Conectado");
            System.out.println("Fechando...");
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex.getMessage());
        }

    }
}
