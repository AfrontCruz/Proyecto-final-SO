/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author afront
 */
public class Core {
    private int carga;
    private int temperatura;

    public Core() {
        this.carga = 0;
        this.temperatura = 0;
    }
    
    public void iniciarProceso(){
        System.out.println("Creo proceso");
        carga += 10;
        temperatura += 10;
    }
    
    public void removerProceso(){
        carga -= 10;
        temperatura -= 10;
    }

    public int getCarga() {
        return carga;
    }

    public int getTemperatura() {
        return temperatura;
    }
    
}
