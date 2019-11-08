package controller;

import connection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Paciente;

/**
 *
 * @author benmacario
 */
public class PacienteDAO {
    private ConexaoBD conn = new ConexaoBD() {};
    
    public void salvarPaciente(Paciente paciente) {
        conn.conectarBD();
        
        String sql = "INSERT INTO PACIENTE(NOME,CPF,SEXO,IDADE,DATA) VALUES(?,?,?,?,?)";
        
        PreparedStatement pst;
        
        try {
            
            pst = conn.conexao.prepareStatement(sql);
            
            pst.setString(1, paciente.getNome());
            pst.setString(2, paciente.getCpf());
            pst.setString(3, paciente.getSexo());
            pst.setInt(4, paciente.getIdade());
            pst.setString(5, paciente.getData());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Paciente salvo com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar paciente!");
        }
    }
    public void consultarPaciente(Paciente paciente) {}
    public void editarPaciente(Paciente paciente) {}
    
    //overload
    public void excluirPaciente(String cpf) {}
    public void excluirPaciente(int id) {}
}
