package controller;

import connection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

/**
 *
 * @author benmacario
 */
public class PacienteDAO {
    private ConexaoBD conn = new ConexaoBD() {};
    
    String select = "SELECT * FROM PACIENTE ORDER BY IDCLIENTE";
    String selectWhere = "SELECT * FROM PACIENTE WHERE IDCLIENTE=?";
    String insert = "INSERT INTO PACIENTE(NOME,CPF,SEXO,IDADE,DATA) VALUES(?,?,?,?,?)";
    String update = "UPDATE PACIENTE SET NOME=?,CPF=?,SEXO=?,IDADE=?,DATA=? WHERE IDCLIENTE = ?";
    String delete = "DELETE FROM PACIENTE WHERE IDCLIENTE=?";
    
    public void salvarPaciente(Paciente paciente) {
        conn.conectarBD();
        
        PreparedStatement pst;
        
        try {
            
            pst = conn.conexao.prepareStatement(insert);
            
            pst.setString(1, paciente.getNome());
            pst.setString(2, paciente.getCpf());
            pst.setString(3, paciente.getSexo());
            pst.setInt(4, paciente.getIdade());
            pst.setString(5, paciente.getData());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar paciente!" + ex);
        }
        
        conn.desconectarBD();
    }
    public List<Paciente> consultarPaciente() {
        List<Paciente> pacientes = new ArrayList();
        
        conn.conectarBD();
    
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = conn.conexao.prepareStatement(select);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Paciente p = new Paciente();
                
                p.setIdentificador(rs.getInt("IDCLIENTE"));
                p.setNome(rs.getString("NOME"));
                p.setCpf(rs.getString("CPF"));
                p.setSexo(rs.getString("SEXO"));
                p.setIdade(rs.getInt("IDADE"));
                p.setData(rs.getString("DATA"));
                
                
                pacientes.add(p);
                
            }
        } catch(SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro ao listar Pacientes!" + ex);
        }
        
        conn.desconectarBD();
        
        return pacientes;
    }
    public Paciente buscarPaciente(int identificador) {
        conn.conectarBD();
        
        Paciente p = new Paciente();
        PreparedStatement psw = null;
        ResultSet rs;
        
        try {
            psw = conn.conexao.prepareStatement(selectWhere);
            
            psw.setInt(1, identificador);
            
            rs = psw.executeQuery();
            rs.first();
            
            p.setNome(rs.getString("NOME"));
            p.setCpf(rs.getString("CPF"));
            p.setSexo(rs.getString("SEXO"));
            p.setIdade(rs.getInt("IDADE"));
            p.setData(rs.getString("DATA"));
            
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao consultar banco de dados!" + ex);
        }
        conn.desconectarBD();
        
        return p;
    }
    
    public void editarPaciente(Paciente paciente) {
        conn.conectarBD();
        
        PreparedStatement pse;
        
        try {
            pse = conn.conexao.prepareStatement(update);
            
            pse.setString(1, paciente.getNome());
            pse.setString(2, paciente.getCpf());
            pse.setString(3, paciente.getSexo());
            pse.setInt(4, paciente.getIdade());
            pse.setString(5, paciente.getData());
            pse.setInt(6, paciente.getIdentificador());
            
            pse.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Paciente salvo com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar editar paciente!\nErro: "+ex);
        }
        
        conn.desconectarBD();
    }
    
    public void excluirPaciente(int identificador) {
        conn.conectarBD();
        
        PreparedStatement psex;
        
        try {
            psex = conn.conexao.prepareStatement(delete);
            
            psex.setInt(1, identificador);
            
            psex.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Paciente excluido com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar excluir paciente!\nErro: "+ex);
        }
        
        conn.desconectarBD();
    }
}
