
package Control;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.IOUtils;

/**
 *
 * @author Daniel Juárez
 */

public class Command {
    private String command;
    private String output;
    
    public Command(String command){
        this.command = command;
    }
    
    public void analizadorCommand(){
        if( command.contains("powerOff")) {
            powerOff();
        }
        else if( command.contains("copiar ")) {
            command = command.replace("copiar ", "");
            copiarArchivo();
        }
        else if( command.contains("crear ")) {
            command = command.replace("crear ", "");
            crearArchivo();
        }
        else if( command.contains("eliminar ")) {
            command = command.replace("eliminar ", "");
            eliminarArchivo();
        }
        else if( command.contains("mover ")) {
            command = command.replace("mover ", "");
            moverArchivo();
        }
        else if( command.contains("copiarD ")) {
            command = command.replace("copiarD ", "");
            copiarCarpeta();
        }
        else if( command.contains("crearD ")) {
            command = command.replace("crearD ", "");
            crearCarpeta();
        }
        else if( command.contains("eliminarD ")) {
            command = command.replace("eliminarD ", "");
            eliminarCarpeta();
        }
        else if( command.contains("moverD ")) {
            command = command.replace("moverD ", "");
            moverCarpeta();
        }
        else if( command.contains("ver") ){
            ver();
        }
        else if( command.contains("renombrar ") ){
            command = command.replace("renombrar ", "");
            renombrarArchivo();
        }
        else{
            output = "Syntax Error";
        }
        
    }
    
    //1     copiar [nombre_archivo] [path]
    public void copiarArchivo(){
        String cmd = "cp ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //2     crear [path + archivo]
    public void crearArchivo(){
        String cmd = "touch ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //3     eliminar [path:archivo] 
    public void eliminarArchivo(){
        String cmd = "rm ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //4     mover [path_src] [path_dst]
    public void moverArchivo(){
        String cmd = "mv ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //5     renombrar [nombre_old] [nombre_new]
    public void renombrarArchivo(){
        moverArchivo();
    }
    
    //6     crearD [nombreDir] 
    public void crearCarpeta(){
        String cmd = "mkdir ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //7     copiarD [path_src] [path_dst]
    public void copiarCarpeta(){
        String cmd = "cp -r ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //8     eliminarD [path_src] [path_dst]
    public void eliminarCarpeta(){
        String cmd = "rm -r ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //9     moverD [path_src] [path_dst]
    public void moverCarpeta(){
        String cmd = "mv -r ";
        cmd = cmd + command;
        exec(cmd);
    }
    
    //10     powerOff
    public void powerOff(){
        System.exit(0);
    }
    
    //11 ver [path]
    public void ver(){
        if( command.length() > 4 ){
            command = command.replace("ver ", "");
            exec("ls " + command);
        }
        else if( command.length() == 3 ){
            exec("ls");
        }
        else{
            if( command.charAt(0) != ' '){
                output = "Syntax error";
                return;
            }
        }
        
    }
    
    public void exec(String cmd){
        output = "";
        try {
            Process pr = Runtime.getRuntime().exec(cmd);
            BufferedInputStream buff = new BufferedInputStream( pr.getInputStream() );
            byte bytes[] = new byte[2000];
            int bytesRead = 0;
            while( (bytesRead = buff.read(bytes)) != -1 ){
                String aux = new String(bytes, 0, bytesRead);
                output += aux + "\n";
            }
        } catch (IOException ex) {
            Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getOutput(){
        return this.output;
    }
    
}
