/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicácio
 */
public class ConexaoBD {
    private String servidor = "localhost:3306";
    private String dataBase = "clinica";
    private String timeZone = "?useTimezone=True&serverTimezone=UTC";
    private String url = "jdbc:mysql://"+ servidor + "/"+ dataBase + timeZone;
    private String drive = "com.mysql.cj.jdbc.Driver";
    
    private String user = "root";
    private String password = "Digite aqui sua senha!!!";
    public Connection conexao;
    
    public void conectarBD(){
        try {
            Class.forName(drive);
            conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Driver não encontrado!\n" + ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Problemas na conexão com o banco!\n" + ex);
        }    
    }
    public void desconectarBD(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar desconectar do banco!\n" + ex);
        }
    }
}
