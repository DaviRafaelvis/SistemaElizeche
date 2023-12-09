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
 
 * @author rafae
 */
public class CompraProdutoControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    
    }
    
    public DrfCompraProduto getBean(int index){
    return (DrfCompraProduto) lista.get(index);
    
    }
    public  void  addBean (DrfCompraProduto compraProduto){
    lista.add(compraProduto);
    this.fireTableDataChanged();
    }

    public void removeBean (int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }

    public  void  updateBean (int index, DrfCompraProduto compraProduto){
    lista.set(index, compraProduto);
    this.fireTableDataChanged();
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 4;
        
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
    return "Id";
    }
    if (column == 1){
    return "Produto";
    }
    if (column == 2){
    return "Quantidade";
    }
    if (column == 3){
    return "Valor";
    }
    return "";
    
    } 
}
