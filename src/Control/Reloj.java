/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author afront
 */
public class Reloj extends JLabel implements Runnable {
    private Thread hilo;
    private String formato;
    
    @Override
    public void run() {
        while( true ){
            DateFormat df = new SimpleDateFormat( formato );
            Date fecha = new Date();
            this.setText( df.format(fecha) );
            
        }
    }
    
    
}
