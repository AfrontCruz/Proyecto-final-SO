
package Control;


public class AdministradorDeProcesos {
    private Core [] cores;
    private int numCores;
    
    public AdministradorDeProcesos(int numCores){
        this.cores = new Core[numCores];
        for(int i = 0; i < numCores; i++)
            cores[i] = new Core();
        this.numCores = numCores;
    }
    
    public int getProcesador(){
        for(int i = 0; i < numCores; i++){
            if( comprobarProcesador( cores[i], 30, 30) ){
                crearProceso(i);
                return i + 1;
            }
        }
        
        for(int i = 0; i < numCores; i++){
            if( comprobarProcesador( cores[i], 60, 60 ) ){
                crearProceso(i);
                return i + 1;
            }
        }
        
        for(int i = 0; i < numCores; i++){
            if( comprobarProcesador( cores[i], 100, 100 ) ){
                crearProceso(i);
                return i + 1;
            }
        }
        
        return 0;
    }
    
    public boolean comprobarProcesador( Core core, int cargaMax, int tempMax ){
        if( core.getCarga() < cargaMax )
            if( core.getTemperatura() < tempMax )
                return true;
        return false;
    }
    
    public void crearProceso( int core ){
        cores[core].iniciarProceso();
    }
    
    public void removerProceso( int core ){
        cores[core - 1].removerProceso();
    }

    public Core[] getCores() {
        return cores;
    }

    public void setCores(Core[] cores) {
        this.cores = cores;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }
    
}
