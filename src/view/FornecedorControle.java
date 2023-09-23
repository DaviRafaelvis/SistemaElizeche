/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DrfFornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class FornecedorControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public DrfFornecedor getBean(int row){
    return (DrfFornecedor) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 3;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        DrfFornecedor fornecedor = (DrfFornecedor) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return fornecedor.getDrfIdfornecedor();
    }
        if (columnIndex == 1){
    return fornecedor.getDrfNome();
    }
        if (columnIndex == 2){
    return fornecedor.getDrfCnpj();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Nome";
    }
    if (column == 2){
    return "Cnpj";
    }
    return "";
    
    }
}

