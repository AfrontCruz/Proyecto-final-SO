/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author afront
 */
public class AdministradorDeMemoria {
    private MemPage[] ram;
    private MemPage[] swap;
    private JTable tableRam;
    private JTable tablaSwap;
    private TableCellRendererColor colorRam;
    private TableCellRendererColor colorSwap;

    public AdministradorDeMemoria(JTable tableRam, JTable tablaSwap) {
        this.tableRam = tableRam;
        this.tablaSwap = tablaSwap;
        this.swap = new MemPage[50];
        this.ram = new MemPage[20];
        for( int i = 0; i < 20; i++)
            ram[i] = new MemPage();
        for( int i = 0; i < 50; i++)
            swap[i] = new MemPage();
    }
    
    public boolean allowProcessRam(int idProcess, String processName, int mem){
        int memory = mem;
        if( comprobarEspacioRam(mem) ){
            for( int i = 0; i < 20; i++ ){
                if( ram[i].getState() == 0 ){
                    ram[i].setState( 1 );
                    ram[i].setProcessName( processName );
                    ram[i].setIdProcess( idProcess );
                    memory--;
                    if( memory == 0)
                        break;
                }
            }
            repaintRam();
            return true;
        }else{
            moveRamToSwap();
            return allowProcessRam(idProcess, processName, mem);
        }
    }
    
    
    public boolean allowProcessSwap(int idProcess, String processName, int mem){
        int memory = mem;
        if( comprobarEspacioSwap(mem) ){
            for( int i = 0; i < 50; i++ ){
                if( swap[i].getState() == 0 ){
                    swap[i].setState( 1 );
                    swap[i].setProcessName( processName );
                    swap[i].setIdProcess( idProcess );
                    memory--;
                    if( memory == 0)
                        break;
                }
            }
            repaintSwap();
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Ya no hay espacio en SWAP");
            return false;
        }
    }
    
    public void removeProcessRam(int idProcess){
        for( int i = 0; i < 20; i++ )
            if( ram[i].getIdProcess() == idProcess ){
                ram[i].setIdProcess(-1);
                ram[i].setProcessName("");
                ram[i].setState(0);
            }
        repaintRam();
    }
    
    public void removeProcessSwap(int idProcess){
        for( int i = 0; i < 50; i++ )
            if( swap[i].getIdProcess() == idProcess ){
                swap[i].setIdProcess(-1);
                swap[i].setProcessName("");
                swap[i].setState(0);
            }
        repaintSwap();
    }
    
    public boolean comprobarEspacioRam(int mem){
        for( int i = 0; i < 20; i++ ){
            if( ram[i].getState() == 0 )
                mem--;
            if( mem == 0 )
                return true;
        }
        return false;
    }
    
    public boolean comprobarEspacioSwap( int mem ){
        for( int i = 0; i < 50; i++ ){
            if( swap[i].getState() == 0 )
                mem--;
            if( mem == 0 )
                return true;
        }
        return false;
    }
    
    public void moveRamToSwap(){
        int mem = 0;
        String nombre;
        int id;
        for( int i = 0; i < 20; i++ ){
            if( ram[i].getIdProcess() > 0 ){
                id = ram[i].getIdProcess();
                nombre = ram[i].getProcessName();
                for( int j = 0; j < 20; j++ ){
                    if( ram[j].getIdProcess() == id )
                        mem++;
                }
                allowProcessSwap(id, nombre, mem);
                removeProcessRam( id );
                break;
            }
        }
    }
    
    public void moveSwapToRam(int id){
        int mem = 0;
        String nombre = "";
        for( int j = 0; j < 50; j++ ){
            if( swap[j].getIdProcess() == id ){
                mem++;
                if( nombre.equals("") )
                    nombre = swap[j].getProcessName();
            }
        }
        System.out.println("Nombre: " + nombre + " ID: " + id + " Mem: " + mem );
        removeProcessSwap( id );
        if( allowProcessRam(id, nombre, mem) ){
            System.out.println("Estoy copiando a RAM");
        }else{
            System.out.println("Algo salió mal");
        }
    }
    
    public boolean isProcessSwap(int id){
        for( int i = 0; i < 50; i++ ){
            if( id == swap[i].getIdProcess() )
                return true;
        }
        return false;
    }

    public void repaintRam() {
        tableRam.setDefaultRenderer(Object.class , new TableCellRendererColor( ram ) );
    }
    
    public void repaintSwap(){
        tablaSwap.setDefaultRenderer(Object.class, new TableCellRendererColor( swap ) );
    }

    public MemPage[] getRam() {
        return ram;
    }

    public MemPage[] getSwap() {
        return swap;
    }
    
    
}