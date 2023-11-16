/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bean.DrfCompraProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author rafae
 */
public class CompraProdutoControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public DrfCompraProduto getBean(int row){
    return (DrfCompraProduto) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 3;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        DrfCompraProduto CompraProduto = (DrfCompraProduto) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return CompraProduto.getDrfIdcompraProduto();
    }
        if (columnIndex == 1){
    return CompraProduto.getDrfProduto();
    }
        if (columnIndex == 2){
    return CompraProduto.getDrfQuantidade();
    }
         if (columnIndex == 3){
    return CompraProduto.getDrfValorUnitario();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Fornecedor";
    }
    if (column == 2){
    return "Data";
    }
    if (column == 3){
    return "Valor";
    }
    return "";
    
    } 
}
