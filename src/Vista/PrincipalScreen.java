
package Vista;

import Control.AdministradorDeMemoria;
import Control.AdministradorDeProcesos;
import Control.Core;
import Control.MemPage;
import Control.TableCellRendererColor;
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
        admMem = new AdministradorDeMemoria( this.tablaRam, this.tablaSwap );
        admMem.repaintRam();
        admMem.repaintSwap();
        panelMemory.setVisible(false);
        panelCores.setVisible(false);
        panelMemoryExtend.setVisible( false );
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
        panelCores = new javax.swing.JPanel();
        scrollTablaProcesos = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        botonVerCores = new javax.swing.JButton();
        botonOkCores = new javax.swing.JButton();
        panelMemory = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRam = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSwap = new javax.swing.JTable();
        labelRAM = new javax.swing.JLabel();
        labelSWAP = new javax.swing.JLabel();
        botonOkMem = new javax.swing.JButton();
        botonMemory = new javax.swing.JButton();
        botonProcess = new javax.swing.JButton();
        panelMemoryExtend = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaRamExtend = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSwapExtend = new javax.swing.JTable();
        labelRamExtend = new javax.swing.JLabel();
        labelSwapExtend = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ScreenPrincipal.setBackground(new java.awt.Color(0, 51, 102));
        ScreenPrincipal.setLayout(null);

        botonPower.setForeground(new java.awt.Color(255, 255, 255));
        botonPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shutdown.png"))); // NOI18N
        botonPower.setText("Power Off");
        botonPower.setBorder(null);
        botonPower.setBorderPainted(false);
        botonPower.setContentAreaFilled(false);
        botonPower.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPower.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPower.setIconTextGap(-3);
        botonPower.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shutdownMax.png"))); // NOI18N
        botonPower.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonPower.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPowerActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonPower);
        botonPower.setBounds(1280, 10, 70, 70);

        botonNavigator.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonNavigator.setForeground(new java.awt.Color(255, 255, 255));
        botonNavigator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/navigator.png"))); // NOI18N
        botonNavigator.setText("Browser");
        botonNavigator.setBorder(null);
        botonNavigator.setBorderPainted(false);
        botonNavigator.setContentAreaFilled(false);
        botonNavigator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNavigator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNavigator.setIconTextGap(-3);
        botonNavigator.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/navigatorMax.png"))); // NOI18N
        botonNavigator.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonNavigator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNavigator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNavigatorActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonNavigator);
        botonNavigator.setBounds(50, 190, 170, 115);

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
        botonTerminal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/terminalMax.png"))); // NOI18N
        botonTerminal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonTerminal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminalActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonTerminal);
        botonTerminal.setBounds(50, 40, 170, 115);

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
        notifyBar.setBounds(1140, 650, 220, 105);

        panelCores.setBackground(new java.awt.Color(255, 51, 51));

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

        botonOkCores.setBackground(new java.awt.Color(255, 51, 51));
        botonOkCores.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonOkCores.setForeground(new java.awt.Color(255, 255, 255));
        botonOkCores.setText("Ok");
        botonOkCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOkCoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCoresLayout = new javax.swing.GroupLayout(panelCores);
        panelCores.setLayout(panelCoresLayout);
        panelCoresLayout.setHorizontalGroup(
            panelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTablaProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerCores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOkCores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCoresLayout.setVerticalGroup(
            panelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVerCores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonOkCores))
        );

        ScreenPrincipal.add(panelCores);
        panelCores.setBounds(930, 430, 220, 195);

        panelMemory.setBackground(new java.awt.Color(255, 51, 51));

        tablaRam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaRam);
        if (tablaRam.getColumnModel().getColumnCount() > 0) {
            tablaRam.getColumnModel().getColumn(0).setResizable(false);
        }

        tablaSwap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSwap);
        if (tablaSwap.getColumnModel().getColumnCount() > 0) {
            tablaSwap.getColumnModel().getColumn(0).setResizable(false);
        }

        labelRAM.setBackground(new java.awt.Color(255, 255, 255));
        labelRAM.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelRAM.setForeground(new java.awt.Color(255, 255, 255));
        labelRAM.setText("RAM");

        labelSWAP.setBackground(new java.awt.Color(255, 255, 255));
        labelSWAP.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelSWAP.setForeground(new java.awt.Color(255, 255, 255));
        labelSWAP.setText("SWAP");

        botonOkMem.setBackground(new java.awt.Color(255, 51, 51));
        botonOkMem.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonOkMem.setForeground(new java.awt.Color(255, 255, 255));
        botonOkMem.setText("Ok");
        botonOkMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOkMemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMemoryLayout = new javax.swing.GroupLayout(panelMemory);
        panelMemory.setLayout(panelMemoryLayout);
        panelMemoryLayout.setHorizontalGroup(
            panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelMemoryLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelRAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSWAP)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMemoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonOkMem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMemoryLayout.setVerticalGroup(
            panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMemoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRAM)
                    .addComponent(labelSWAP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonOkMem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ScreenPrincipal.add(panelMemory);
        panelMemory.setBounds(930, 50, 228, 370);

        botonMemory.setBackground(new java.awt.Color(255, 255, 255));
        botonMemory.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonMemory.setForeground(new java.awt.Color(255, 255, 255));
        botonMemory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/memory.png"))); // NOI18N
        botonMemory.setText("Memory");
        botonMemory.setBorder(null);
        botonMemory.setBorderPainted(false);
        botonMemory.setContentAreaFilled(false);
        botonMemory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMemory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMemory.setIconTextGap(-3);
        botonMemory.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/memoryMax.png"))); // NOI18N
        botonMemory.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonMemory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMemoryActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonMemory);
        botonMemory.setBounds(1180, 160, 170, 115);

        botonProcess.setBackground(new java.awt.Color(255, 255, 255));
        botonProcess.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonProcess.setForeground(new java.awt.Color(255, 255, 255));
        botonProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/proceso.png"))); // NOI18N
        botonProcess.setText("Process");
        botonProcess.setBorder(null);
        botonProcess.setBorderPainted(false);
        botonProcess.setContentAreaFilled(false);
        botonProcess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonProcess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonProcess.setIconTextGap(-3);
        botonProcess.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/procesoMax.png"))); // NOI18N
        botonProcess.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonProcess.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcessActionPerformed(evt);
            }
        });
        ScreenPrincipal.add(botonProcess);
        botonProcess.setBounds(1180, 480, 170, 115);

        panelMemoryExtend.setBackground(new java.awt.Color(255, 255, 255));

        tablaRamExtend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaRamExtend);
        if (tablaRamExtend.getColumnModel().getColumnCount() > 0) {
            tablaRamExtend.getColumnModel().getColumn(0).setResizable(false);
        }

        tablaSwapExtend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaSwapExtend);
        if (tablaSwapExtend.getColumnModel().getColumnCount() > 0) {
            tablaSwapExtend.getColumnModel().getColumn(0).setResizable(false);
        }

        labelRamExtend.setBackground(new java.awt.Color(0, 0, 0));
        labelRamExtend.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelRamExtend.setText("RAM");

        labelSwapExtend.setBackground(new java.awt.Color(0, 0, 0));
        labelSwapExtend.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        labelSwapExtend.setText("SWAP");

        javax.swing.GroupLayout panelMemoryExtendLayout = new javax.swing.GroupLayout(panelMemoryExtend);
        panelMemoryExtend.setLayout(panelMemoryExtendLayout);
        panelMemoryExtendLayout.setHorizontalGroup(
            panelMemoryExtendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoryExtendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelMemoryExtendLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelRamExtend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSwapExtend)
                .addGap(39, 39, 39))
        );
        panelMemoryExtendLayout.setVerticalGroup(
            panelMemoryExtendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoryExtendLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelMemoryExtendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRamExtend)
                    .addComponent(labelSwapExtend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMemoryExtendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ScreenPrincipal.add(panelMemoryExtend);
        panelMemoryExtend.setBounds(500, 50, 350, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wall_c.png"))); // NOI18N
        ScreenPrincipal.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScreenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScreenPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
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
        if( admMem.allowProcessRam(procesos, title, 5) ){
            process.add( new Browser( title, procesos, this, core) );
            boxProcess.addItem( title );
            añadirProcesoTabla(procesos, title, core);
            cargarTablasMem();
        }else{
            System.out.println("no se puedo crear un navegador");
        }
        
    }//GEN-LAST:event_botonNavigatorActionPerformed

    /*CREAR UNA NUEVA TERMINAL*/
    private void botonTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminalActionPerformed
        procesos++;
        String title = "Terminal " + Integer.toString(procesos);
        int core = adm.getProcesador();
        if( admMem.allowProcessRam(procesos, title, 2) ){
            process.add( new Terminal(this, title, procesos, core) );
            boxProcess.addItem( title );
            añadirProcesoTabla(procesos, title, core);
            cargarTablasMem();
        }
        else{
            System.out.println("No se pudo crear una terminal");
        }
    }//GEN-LAST:event_botonTerminalActionPerformed

    /*MAXIMIZA UN Jframe*/
    private void botonMaximizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMaximizedActionPerformed
        for( JFrame t : process){
            if ( t.getTitle().equals( boxProcess.getSelectedItem() ) ){
                if( t instanceof Terminal ){
                    Terminal ter = (Terminal)t;
                    if( admMem.isProcessSwap( ter.getIdProcess() ) ){
                        admMem.moveSwapToRam( ter.getIdProcess() );
                        System.out.println("ESTOY MOVIENDO SWAPTORAM");
                    }
                }
                if( t instanceof Browser ){
                    Browser br = (Browser)t;
                    if( admMem.isProcessSwap( br.getIdProceso() ) ){
                        admMem.moveSwapToRam( br.getIdProceso() );
                        System.out.println("ESTOY MOVIENDO SWAPTORAM");
                    }
                }
                t.setVisible(true);
                
                cargarTablasMem();
                break;
            }
        }
    }//GEN-LAST:event_botonMaximizedActionPerformed

    /*ABRE UNA VISTA DE CORES*/
    private void botonVerCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerCoresActionPerformed
        Procesadores p = new Procesadores( adm );
    }//GEN-LAST:event_botonVerCoresActionPerformed

    private void botonOkMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOkMemActionPerformed
        panelMemory.setVisible(false);
        panelMemoryExtend.setVisible(false);
    }//GEN-LAST:event_botonOkMemActionPerformed

    private void botonMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMemoryActionPerformed
        panelMemory.setVisible(true);
        panelMemoryExtend.setVisible(true);
    }//GEN-LAST:event_botonMemoryActionPerformed

    private void botonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcessActionPerformed
        panelCores.setVisible(true);
    }//GEN-LAST:event_botonProcessActionPerformed

    private void botonOkCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOkCoresActionPerformed
        panelCores.setVisible(false);
    }//GEN-LAST:event_botonOkCoresActionPerformed

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
        admMem.removeProcessRam( process );
        cargarTablasMem();
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
    
    public void cargarTablasMem(){
        DefaultTableModel modeloRam = new DefaultTableModel();
        DefaultTableModel modeloSwap = new DefaultTableModel();
        modeloRam.addColumn("Proceso");
        modeloSwap.addColumn("Proceso");
        for( MemPage aux : admMem.getRam() ){
            Object obj[] = { aux.getProcessName() };
            modeloRam.addRow( obj );
        }
        for( MemPage aux : admMem.getSwap() ){
            Object obj[] = { aux.getProcessName() };
            modeloSwap.addRow( obj );
        }
        tablaRamExtend.setModel( modeloRam );
        tablaSwapExtend.setModel( modeloSwap );
    }    
    /**/
    public void resizeColumn( TableColumn columna, int max, int min ){
        columna.setResizable(false);
        columna.setMaxWidth(max);
        columna.setMinWidth(min);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ScreenPrincipal;
    private javax.swing.JButton botonMaximized;
    private javax.swing.JButton botonMemory;
    private javax.swing.JButton botonNavigator;
    private javax.swing.JButton botonOkCores;
    private javax.swing.JButton botonOkMem;
    private javax.swing.JButton botonPower;
    private javax.swing.JButton botonProcess;
    private javax.swing.JButton botonTerminal;
    private javax.swing.JButton botonVerCores;
    private javax.swing.JComboBox<String> boxProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelRAM;
    private javax.swing.JLabel labelRamExtend;
    private javax.swing.JLabel labelSWAP;
    private javax.swing.JLabel labelSwapExtend;
    private javax.swing.JPanel notifyBar;
    private javax.swing.JPanel panelCores;
    private javax.swing.JPanel panelMemory;
    private javax.swing.JPanel panelMemoryExtend;
    private javax.swing.JScrollPane scrollTablaProcesos;
    private javax.swing.JTable tablaProcesos;
    private javax.swing.JTable tablaRam;
    private javax.swing.JTable tablaRamExtend;
    private javax.swing.JTable tablaSwap;
    private javax.swing.JTable tablaSwapExtend;
    // End of variables declaration//GEN-END:variables
    private boolean on;
    private LinkedList <JFrame> process;
    private int procesos;
    private DefaultTableModel modeloProcesos;
    private AdministradorDeProcesos adm;
    private AdministradorDeMemoria admMem;
}
