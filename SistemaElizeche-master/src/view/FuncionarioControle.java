/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DrfFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class FuncionarioControle extends AbstractTableModel {
     private List lista;
  
    public void setList(List lista){
    this.lista = lista;
       this.fireTableDataChanged();
    }
    
    public DrfFuncionario getBean(int row){
    return (DrfFuncionario) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 4;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DrfFuncionario funcionario = (DrfFuncionario) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return funcionario.getDrfIdFuncionario();
    }
        if (columnIndex == 1){
    return funcionario.getDrfNome();
    }
        if (columnIndex == 2){
    return funcionario.getDrfEmail();
    }
        if (columnIndex == 3){
    return funcionario.getDrfDataNascimento();
    }
       
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Nome";
    }
    if (column == 2){
    return "CPF";
    }
    if (column == 3){
    return "Data";
    }
   
    return "";
    
    }
}


