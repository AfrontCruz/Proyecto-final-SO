
package Vista;

import Control.Command;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Juárez
 */
public class Terminal extends javax.swing.JFrame {

    public Terminal(PrincipalScreen principal, String title, int idProcess, int procesador) {
        initComponents();
        this.setTitle( title );
        this.setVisible(true);
        textTerminal.setText( title );
        textTerminal.setEditable(false);
        this.principal = principal;
        this.idProcess = idProcess;
        this.procesador = procesador;
        this.setLocationRelativeTo(null);
        crearTablaCommand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        terminal = new javax.swing.JPanel();
        botonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCommand = new javax.swing.JTable();
        textCommand = new javax.swing.JTextField();
        labelEscomOS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textOutput = new javax.swing.JTextArea();
        botonExecute = new javax.swing.JButton();
        botonMinimize = new javax.swing.JButton();
        textTerminal = new javax.swing.JTextField();
        botonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        terminal.setBackground(new java.awt.Color(255, 255, 255));

        botonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        botonExit.setBorder(null);
        botonExit.setBorderPainted(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonExit.setIconTextGap(-3);
        botonExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });

        tablaCommand.setBackground(new java.awt.Color(255, 255, 255));
        tablaCommand.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaCommand.setFont(new java.awt.Font("URW Gothic L", 0, 12)); // NOI18N
        tablaCommand.setForeground(new java.awt.Color(0, 51, 51));
        tablaCommand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Commands"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCommand.setRowHeight(20);
        tablaCommand.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tablaCommand);
        if (tablaCommand.getColumnModel().getColumnCount() > 0) {
            tablaCommand.getColumnModel().getColumn(0).setMinWidth(400);
            tablaCommand.getColumnModel().getColumn(0).setMaxWidth(400);
        }

        textCommand.setBackground(new java.awt.Color(255, 255, 255));
        textCommand.setFont(new java.awt.Font("URW Gothic L", 0, 18)); // NOI18N
        textCommand.setBorder(null);
        textCommand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCommandKeyTyped(evt);
            }
        });

        labelEscomOS.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        labelEscomOS.setText("escomOS@:");

        textOutput.setEditable(false);
        textOutput.setColumns(20);
        textOutput.setFont(new java.awt.Font("URW Gothic L", 1, 12)); // NOI18N
        textOutput.setRows(5);
        jScrollPane2.setViewportView(textOutput);

        botonExecute.setBackground(new java.awt.Color(51, 51, 51));
        botonExecute.setForeground(new java.awt.Color(255, 255, 255));
        botonExecute.setText("Execute");
        botonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExecuteActionPerformed(evt);
            }
        });

        botonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize.png"))); // NOI18N
        botonMinimize.setBorder(null);
        botonMinimize.setBorderPainted(false);
        botonMinimize.setContentAreaFilled(false);
        botonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMinimize.setIconTextGap(-3);
        botonMinimize.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonMinimize.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMinimizeActionPerformed(evt);
            }
        });

        textTerminal.setBackground(new java.awt.Color(255, 255, 255));
        textTerminal.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        textTerminal.setBorder(null);

        botonClear.setBackground(new java.awt.Color(51, 51, 51));
        botonClear.setForeground(new java.awt.Color(255, 255, 255));
        botonClear.setText("Clear");
        botonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout terminalLayout = new javax.swing.GroupLayout(terminal);
        terminal.setLayout(terminalLayout);
        terminalLayout.setHorizontalGroup(
            terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terminalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonExit))
            .addGroup(terminalLayout.createSequentialGroup()
                .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(terminalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(terminalLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(terminalLayout.createSequentialGroup()
                                .addComponent(textTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(terminalLayout.createSequentialGroup()
                                .addComponent(labelEscomOS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCommand)))))
                .addGap(25, 25, 25))
        );
        terminalLayout.setVerticalGroup(
            terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terminalLayout.createSequentialGroup()
                .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonExit)
                    .addComponent(botonMinimize)
                    .addComponent(textTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscomOS)
                    .addComponent(textCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(terminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(terminalLayout.createSequentialGroup()
                        .addComponent(botonExecute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonClear))
                    .addComponent(jScrollPane2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terminal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terminal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        principal.removeProcess( this.idProcess, this, this.procesador );
        this.removeNotify();
    }//GEN-LAST:event_botonExitActionPerformed

    private void textCommandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCommandKeyTyped
        char tecla = evt.getKeyChar();
        if( tecla == KeyEvent.VK_ENTER){
            ejecutarCommand( textCommand.getText() );
            Object obj[] = { textCommand.getText() };
            if( modeloCommand == null )
                System.out.println("Aquio esta");
            modeloCommand.addRow(obj);
            textCommand.setText("");
        } 
    }//GEN-LAST:event_textCommandKeyTyped

    private void botonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExecuteActionPerformed
        int fila = tablaCommand.getSelectedRow();
        System.out.println("fila " + fila);
        if( fila >= 0 ){
            ejecutarCommand( modeloCommand.getValueAt(fila, 0).toString() );
        }
    }//GEN-LAST:event_botonExecuteActionPerformed

    private void botonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinimizeActionPerformed
        //this.setExtendedState(1); //ICONIFIED
        this.setVisible(false);
    }//GEN-LAST:event_botonMinimizeActionPerformed

    private void botonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClearActionPerformed
        crearTablaCommand();
        textOutput.setText("");
    }//GEN-LAST:event_botonClearActionPerformed

    public void ejecutarCommand(String cmd){
        Command comando = new Command( cmd );
        comando.analizadorCommand();
        textOutput.setText( comando.getOutput() );
    }
    
    public void crearTablaCommand(){
        modeloCommand = new DefaultTableModel();
        modeloCommand.addColumn("Command");
        tablaCommand.setModel( modeloCommand );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonClear;
    private javax.swing.JButton botonExecute;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonMinimize;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEscomOS;
    private javax.swing.JTable tablaCommand;
    private javax.swing.JPanel terminal;
    private javax.swing.JTextField textCommand;
    private javax.swing.JTextArea textOutput;
    private javax.swing.JTextField textTerminal;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modeloCommand;
    private PrincipalScreen principal;
    private int idProcess;
    private int procesador;
}
