
package Vista;

import Control.AdministradorDeProcesos;
import Control.Core;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class Procesadores extends javax.swing.JFrame {
    private AdministradorDeProcesos adm;
    public Procesadores(AdministradorDeProcesos adm) {
        this.adm = adm;
        initComponents();
        setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cargarTablaProceso();
        this.setLocationRelativeTo(null);
    }
    
    public void cargarTablaProceso(){
        DefaultTableModel tablaCores = new DefaultTableModel();
        tablaCores.addColumn("Core");
        tablaCores.addColumn("Cargar %");
        tablaCores.addColumn("Temperatura %");
        tablaProcesadores.setModel(tablaCores);
        Core[] cores = adm.getCores();
        int numCore = adm.getNumCores();
        for( int i = 0; i < numCore; i++){
            Object [] obj = new Object[3];
            obj[0] = i + 1;
            obj[1] = cores[i].getCarga();
            obj[2] = cores[i].getTemperatura();
            tablaCores.addRow( obj );
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProcesador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesadores = new javax.swing.JTable();
        botonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelProcesador.setBackground(new java.awt.Color(255, 255, 255));

        tablaProcesadores.setBorder(new javax.swing.border.MatteBorder(null));
        tablaProcesadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProcesadores);

        botonExit.setText("Ok");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProcesadorLayout = new javax.swing.GroupLayout(panelProcesador);
        panelProcesador.setLayout(panelProcesadorLayout);
        panelProcesadorLayout.setHorizontalGroup(
            panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesadorLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        panelProcesadorLayout.setVerticalGroup(
            panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonExit)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        this.removeNotify();
    }//GEN-LAST:event_botonExitActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelProcesador;
    private javax.swing.JTable tablaProcesadores;
    // End of variables declaration//GEN-END:variables
}
