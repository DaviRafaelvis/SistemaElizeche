/*z
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DrfCompra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u10154925179
 */
public class ComprasControle extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public DrfCompra getBean(int row){
    return (DrfCompra) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 4;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        DrfCompra drfCompra = (DrfCompra) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return drfCompra.getDrfIdcompra();
    }
        if (columnIndex == 1){
    return drfCompra.getDrfFornecedor();
    }
        if (columnIndex == 2){
    return drfCompra.getDrfDataCompra();
    }
         if (columnIndex == 3){
    return drfCompra.getDrfValorTotalCompra();
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
