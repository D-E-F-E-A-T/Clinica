package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author benmacario
 */
public class PacienteTableModel extends AbstractTableModel{
    private List<Paciente> dados = new ArrayList<>();
    private String[] colunas = {"Identificador", "Nome", "CPF", "Sexo", "Idade", "Data da consulta"};
    
    
    public String getColumnName(int column) {
        return colunas[column];
    }
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return dados.get(rowIndex).getIdentificador();
            case 1: return dados.get(rowIndex).getNome();
            case 2: return dados.get(rowIndex).getCpf();
            case 3: return dados.get(rowIndex).getSexo();
            case 4: return dados.get(rowIndex).getIdade();
            case 5: return dados.get(rowIndex).getData();
        }
        
        return null;
    }

//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        switch(columnIndex) {
//                case 0:dados.get(rowIndex).setIdentificador((int) aValue); break;
//                case 1:dados.get(rowIndex).setNome((String) aValue); break;
//                case 2:dados.get(rowIndex).setCpf((String) aValue); break;
//                case 3:dados.get(rowIndex).setSexo((String) aValue); break;
//                case 4:dados.get(rowIndex).setIdade((int) aValue); break;
//                case 5:dados.get(rowIndex).setData((String) aValue); break;
//            }
//        
//        this.fireTableRowsUpdated(rowIndex, rowIndex);
//    }
     
    public void addRow(Paciente paciente) {
        this.dados.add(paciente);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex) {
        this.dados.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void clearTable() {
        this.dados.removeAll(dados);
    }
}
