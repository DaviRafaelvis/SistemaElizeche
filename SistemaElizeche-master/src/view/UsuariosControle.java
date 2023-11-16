/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DrfUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class UsuariosControle extends AbstractTableModel {
 
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
       this.fireTableDataChanged();
    }
    
    public DrfUsuarios getBean(int row){
    return (DrfUsuarios) lista.get(row);
    
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
        DrfUsuarios usuarios = (DrfUsuarios) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return usuarios.getDrfIdUsuarios();
    }
        if (columnIndex == 1){
    return usuarios.getDrfNome();
    }
        if (columnIndex == 2){
    return usuarios.getDrfApelido();
    }
        if (columnIndex == 3){
    return usuarios.getDrfCpf();
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
    return "Apelido";
    }
    if (column == 3){
    return "CPF";
    }
   
    return "";
    
    }
}
