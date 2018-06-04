
package Vista;

import Control.AdministradorDeProcesos;
import Control.Core;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

/**
 *
 * @author Daniel Juárez
 */
public class PrincipalScreen extends javax.swing.JFrame {
    public PrincipalScreen() {
        initComponents();
        this.setTitle("Sistema Operativo");
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        process = new LinkedList<JFrame>();
        procesos = 0;
        createTableProcesos();
        adm = new AdministradorDeProcesos( 4 );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScreenPrincipal = new javax.swing.JPanel();
        botonPower = new javax.swing.JButton();
        botonNavigator = new javax.swing.JButton();
        botonTerminal = new javax.swing.JButton();
        notifyBar = new javax.swing.JPanel();
        boxProcess = new javax.swing.JComboBox<>();
        botonMaximized = new javax.swing.JButton();
        botonCalculator = new javax.swing.JButton();
        notifyBar1 = new javax.swing.JPanel();
        scrollTablaProcesos = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        botonVerCores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ScreenPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        ScreenPrincipal.setLayout(null);

        botonPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shutdown.png"))); // NOI18N
        botonPower.setBorder(null);
        botonPower.setBorderPainted(false);
        botonPower.setContentAreaFilled(false);
        botonPower.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPower.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPower.setIconTextGap(-3);
        botonPower.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonPower.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPowerActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonPower);
        botonPower.setBounds(1300, 20, 49, 49);

        botonNavigator.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonNavigator.setForeground(new java.awt.Color(255, 255, 255));
        botonNavigator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/navigator.png"))); // NOI18N
        botonNavigator.setText("Navigator");
        botonNavigator.setBorder(null);
        botonNavigator.setBorderPainted(false);
        botonNavigator.setContentAreaFilled(false);
        botonNavigator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNavigator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNavigator.setIconTextGap(-3);
        botonNavigator.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonNavigator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNavigator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNavigatorActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonNavigator);
        botonNavigator.setBounds(51, 200, 97, 115);

        botonTerminal.setBackground(new java.awt.Color(255, 255, 255));
        botonTerminal.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonTerminal.setForeground(new java.awt.Color(255, 255, 255));
        botonTerminal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/terminal.png"))); // NOI18N
        botonTerminal.setText("Terminal");
        botonTerminal.setBorder(null);
        botonTerminal.setBorderPainted(false);
        botonTerminal.setContentAreaFilled(false);
        botonTerminal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTerminal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTerminal.setIconTextGap(-3);
        botonTerminal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonTerminal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminalActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonTerminal);
        botonTerminal.setBounds(51, 66, 97, 115);

        notifyBar.setBackground(new java.awt.Color(255, 51, 51));

        boxProcess.setBackground(new java.awt.Color(255, 51, 51));
        boxProcess.setFont(new java.awt.Font("URW Gothic L", 1, 12)); // NOI18N
        boxProcess.setForeground(new java.awt.Color(255, 255, 255));

        botonMaximized.setBackground(new java.awt.Color(255, 51, 51));
        botonMaximized.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonMaximized.setForeground(new java.awt.Color(255, 255, 255));
        botonMaximized.setText("M a x i m i z e d");
        botonMaximized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMaximizedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout notifyBarLayout = new javax.swing.GroupLayout(notifyBar);
        notifyBar.setLayout(notifyBarLayout);
        notifyBarLayout.setHorizontalGroup(
            notifyBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notifyBarLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(notifyBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMaximized, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(boxProcess, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        notifyBarLayout.setVerticalGroup(
            notifyBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notifyBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(boxProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMaximized)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        ScreenPrincipal.add(notifyBar);
        notifyBar.setBounds(1140, 634, 220, 105);

        botonCalculator.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonCalculator.setForeground(new java.awt.Color(255, 255, 255));
        botonCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calculator.png"))); // NOI18N
        botonCalculator.setText("Calculator");
        botonCalculator.setBorder(null);
        botonCalculator.setBorderPainted(false);
        botonCalculator.setContentAreaFilled(false);
        botonCalculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCalculator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCalculator.setIconTextGap(-3);
        botonCalculator.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonCalculator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalculatorActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonCalculator);
        botonCalculator.setBounds(51, 345, 97, 115);

        notifyBar1.setBackground(new java.awt.Color(255, 51, 51));

        scrollTablaProcesos.setBackground(new java.awt.Color(255, 51, 51));
        scrollTablaProcesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        tablaProcesos.setBackground(new java.awt.Color(255, 51, 51));
        tablaProcesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        tablaProcesos.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        tablaProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProcesos.setEnabled(false);
        tablaProcesos.setGridColor(new java.awt.Color(0, 102, 102));
        scrollTablaProcesos.setViewportView(tablaProcesos);

        botonVerCores.setBackground(new java.awt.Color(255, 51, 51));
        botonVerCores.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonVerCores.setForeground(new java.awt.Color(255, 255, 255));
        botonVerCores.setText("Ver Cores");
        botonVerCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerCoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout notifyBar1Layout = new javax.swing.GroupLayout(notifyBar1);
        notifyBar1.setLayout(notifyBar1Layout);
        notifyBar1Layout.setHorizontalGroup(
            notifyBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notifyBar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(notifyBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTablaProcesos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerCores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        notifyBar1Layout.setVerticalGroup(
            notifyBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notifyBar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerCores)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ScreenPrincipal.add(notifyBar1);
        notifyBar1.setBounds(1140, 427, 220, 189);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallpaper.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        ScreenPrincipal.add(jLabel1);
        jLabel1.setBounds(0, -100, 1380, 880);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScreenPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScreenPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPowerActionPerformed
        for( JFrame t : process)
            t.removeNotify();
        this.removeNotify();
    }//GEN-LAST:event_botonPowerActionPerformed

    /* CREAR UN NUEVO NAVEGADOR */
    private void botonNavigatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNavigatorActionPerformed
        procesos++;
        String title = "Navigator " + Integer.toString(procesos);
        int core = adm.getProcesador();
        process.add( new Browser( title, procesos, this, core) );
        boxProcess.addItem( title );
        añadirProcesoTabla(procesos, title, core);
        
    }//GEN-LAST:event_botonNavigatorActionPerformed

    /*CREAR UNA NUEVA TERMINAL*/
    private void botonTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminalActionPerformed
        procesos++;
        String title = "Terminal " + Integer.toString(procesos);
        int core = adm.getProcesador();
        process.add( new Terminal(this, title, procesos, core) );
        boxProcess.addItem( title );
        añadirProcesoTabla(procesos, title, core);
    }//GEN-LAST:event_botonTerminalActionPerformed

    /*MAXIMIZA UN Jframe*/
    private void botonMaximizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMaximizedActionPerformed
        for( JFrame t : process){
            if ( t.getTitle().equals( boxProcess.getSelectedItem() ) ){
                t.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_botonMaximizedActionPerformed

    /*CREA UNA NUEVA CALCULADORA*/
    private void botonCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalculatorActionPerformed
        procesos++;
        String title = "Calculadora " + Integer.toString(procesos);
        int core = adm.getProcesador();
        process.add( new Calculadora(this, title, procesos, core) );
        boxProcess.addItem(title);
        añadirProcesoTabla(procesos, title, core);
    }//GEN-LAST:event_botonCalculatorActionPerformed

    /*ABRE UNA VISTA DE CORES*/
    private void botonVerCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerCoresActionPerformed
        Procesadores p = new Procesadores( adm );
    }//GEN-LAST:event_botonVerCoresActionPerformed

    /*REMUEVE UN PROCESO*/
    public void removeProcess(int process, JFrame exit, int core){
        for(int i = 0; true; i++){
            if( boxProcess.getItemAt(i).contains( Integer.toString( process ) ) ){
                boxProcess.removeItemAt(i);
                break;
            }
        }
        removerProcesoTabla( process );
        if( this.process.remove( exit ) ){
            System.out.println("Se eliminó");
        }
        adm.removerProceso( core );
    }
    
    public boolean isOn(){
        return on;
    }
    
    /*AGREGA EL PROCESO A LA TABLA*/
    public void añadirProcesoTabla(int id, String title, int core){
        Object obj[] = {id, title, core};
        modeloProcesos.addRow( obj );
    }
    
    /*REMUEVE UN PROCESO DE LA TABLA*/
    public void removerProcesoTabla(int id){
        int i;
        for( i = 0; i < modeloProcesos.getRowCount(); i++ ){
            if( modeloProcesos.getValueAt( i, 0).equals( id )  ){
                modeloProcesos.removeRow( i );
                break;
            }
        }
    }
    
    //Tabla procesos
    public void createTableProcesos(){
        modeloProcesos = new DefaultTableModel();
        modeloProcesos.addColumn("ID");
        modeloProcesos.addColumn("Proceso");
        modeloProcesos.addColumn("Core");
        tablaProcesos.setModel( modeloProcesos );
        resizeColumn( tablaProcesos.getColumn("Proceso"), 130, 130 );
        resizeColumn( tablaProcesos.getColumn("ID"), 30, 30 );
        resizeColumn( tablaProcesos.getColumn("Core"), 40, 40 );
    }
    
    /**/
    public void resizeColumn( TableColumn columna, int max, int min ){
        columna.setResizable(false);
        columna.setMaxWidth(max);
        columna.setMinWidth(min);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ScreenPrincipal;
    private javax.swing.JButton botonCalculator;
    private javax.swing.JButton botonMaximized;
    private javax.swing.JButton botonNavigator;
    private javax.swing.JButton botonPower;
    private javax.swing.JButton botonTerminal;
    private javax.swing.JButton botonVerCores;
    private javax.swing.JComboBox<String> boxProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel notifyBar;
    private javax.swing.JPanel notifyBar1;
    private javax.swing.JScrollPane scrollTablaProcesos;
    private javax.swing.JTable tablaProcesos;
    // End of variables declaration//GEN-END:variables
    private boolean on;
    private LinkedList <JFrame> process;
    private int procesos;
    private DefaultTableModel modeloProcesos;
    private AdministradorDeProcesos adm;
}
