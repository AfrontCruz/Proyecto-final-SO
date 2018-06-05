/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JTable;

/**
 *
 * @author afront
 */
public class AdministradorDeMemoria {
    private MemPage[] Ram;
    private MemPage[] Swap;
    private JTable tableRam;
    private JTable tablaSwap;
    private TableCellRendererColor colorRam;
    private TableCellRendererColor colorSwap;

    public AdministradorDeMemoria(JTable tableRam, JTable tablaSwap) {
        this.tableRam = tableRam;
        this.tablaSwap = tablaSwap;
        this.Swap = new MemPage[50];
        this.Ram = new MemPage[20];
        for( int i = 0; i < 20; i++)
            Ram[i] = new MemPage();
        for( int i = 0; i < 50; i++)
            Swap[i] = new MemPage();
    }
    
    public boolean allowProcessRam(int idProcess, String processName, int mem){
        int memory = mem;
        if( comprobarEspacioRam(mem) ){
            for( int i = 0; i < 20; i++ ){
                if( Ram[i].getState() == 0 ){
                    Ram[i].setState( 1 );
                    Ram[i].setProcessName( processName );
                    Ram[i].setIdProcess( idProcess );
                    memory--;
                    if( memory == 0)
                        break;
                }
            }
            repaintRam();
            return true;
        }else{
            //AQUI DEBE DE IR EL ALGORITMO DE SWAP
        }
        return false;
    }
    
    public void removeProcessRam(int idProcess){
        for( int i = 0; i < 20; i++ )
            if( Ram[i].getIdProcess() == idProcess ){
                Ram[i].setIdProcess(-1);
                Ram[i].setProcessName("");
                Ram[i].setState(0);
            }
        repaintRam();
    }
    
    public boolean comprobarEspacioRam(int mem){
        for( int i = 0; i < 20; i++ ){
            if( Ram[i].getState() == 0 )
                mem--;
            if( mem == 0 )
                return true;
        }
        return false;
    }
    
    public boolean comprobarEspacioSwap( int mem ){
        for( int i = 0; i < 50; i++ ){
            if( Swap[i].getState() == 0 )
                mem--;
            if( mem == 0 )
                return true;
        }
        return false;
    }

    public void repaintRam() {
        tableRam.setDefaultRenderer(Object.class , new TableCellRendererColor( Ram ) );
    }
    
    public void repaintSwap(){
        tablaSwap.setDefaultRenderer(Object.class, new TableCellRendererColor( Swap ) );
    }
}