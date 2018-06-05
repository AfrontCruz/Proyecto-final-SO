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
public class MemPage {
    int idProcess;
    int state; //0 está disponible 1 está ocupada
    String processName;
    
    public MemPage(){
        int idProcess = -1;
        int state = 0;
    }

    public MemPage(int idProcess, int state, String processName) {
        this.idProcess = idProcess;
        this.state = state;
        this.processName = processName;
    }

    public int getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(int idProcess) {
        this.idProcess = idProcess;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }
}
