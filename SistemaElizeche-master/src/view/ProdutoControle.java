/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DrfProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ProdutoControle extends AbstractTableModel {
     private List lista;
     
    public void setList(List lista){
    this.lista = lista;
     this.fireTableDataChanged();
    }
    
    public DrfProduto getBean(int row){
    return (DrfProduto) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 5;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DrfProduto produto = (DrfProduto) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return produto.getDrfIdProduto();
    }
        if (columnIndex == 1){
    return produto.getDrfValorUnitario();
    }
        if (columnIndex == 2){
    return produto.getDrfCategoria();
    }
        if (columnIndex == 3){
    return produto.getDrfColecao();
    }
       
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Valor";
    }
    if (column == 2){
    return "Categoria";
    }
    if (column == 3){
    return "Colecao";
    }
   
    return "";
    
    } 
    
}
