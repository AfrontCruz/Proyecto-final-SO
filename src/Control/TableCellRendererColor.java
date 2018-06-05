/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author afront
 */
public class TableCellRendererColor extends DefaultTableCellRenderer {
    private Component component;
    private MemPage[] memory;
    private int mem;

    public TableCellRendererColor(MemPage[] memory) {
        this.memory = memory;
    }
    
    @Override
    public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if( memory[row].getState() == 0 )
            component.setBackground( Color.green );
        else
            component.setBackground( Color.red );
        
        return component;
    }
}
