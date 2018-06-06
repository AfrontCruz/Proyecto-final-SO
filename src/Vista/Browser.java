package Vista;

import Control.SwingBrowser;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Browser extends javax.swing.JFrame {
    private String url;
    private SwingBrowser browser;
    private int idProceso;
    private int procesador;
    private PrincipalScreen pantalla;
    
    public Browser(String title, int idProcesos, PrincipalScreen pantalla, int procesador){
        url = "https://www.google.com";
        initComponents();
        setTitle( title );
        browser = new SwingBrowser();
        browser.loadURL( url );
        browser.setBounds(1, 1, panelWeb.getWidth() - 1, panelWeb.getHeight() - 1);
        setVisible(true);
        panelWeb.add(browser);
        this.idProceso = idProcesos;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWeb = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        botonFacebook = new javax.swing.JButton();
        botonGoogle = new javax.swing.JButton();
        botonYouTube = new javax.swing.JButton();
        botonMinimize = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();
        labelURL = new javax.swing.JLabel();
        textUrl = new javax.swing.JTextField();
        botonIr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Browser");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        panelWeb.setBackground(new java.awt.Color(255, 255, 255));
        panelWeb.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelWebLayout = new javax.swing.GroupLayout(panelWeb);
        panelWeb.setLayout(panelWebLayout);
        panelWebLayout.setHorizontalGroup(
            panelWebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        panelWebLayout.setVerticalGroup(
            panelWebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));

        botonFacebook.setBackground(new java.awt.Color(0, 0, 0));
        botonFacebook.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonFacebook.setForeground(new java.awt.Color(255, 255, 255));
        botonFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/facebook.png"))); // NOI18N
        botonFacebook.setBorder(null);
        botonFacebook.setBorderPainted(false);
        botonFacebook.setContentAreaFilled(false);
        botonFacebook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/facebookMax.png"))); // NOI18N
        botonFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacebookActionPerformed(evt);
            }
        });

        botonGoogle.setBackground(new java.awt.Color(0, 0, 0));
        botonGoogle.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonGoogle.setForeground(new java.awt.Color(255, 255, 255));
        botonGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/google.png"))); // NOI18N
        botonGoogle.setBorder(null);
        botonGoogle.setBorderPainted(false);
        botonGoogle.setContentAreaFilled(false);
        botonGoogle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/googleMax.png"))); // NOI18N
        botonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGoogleActionPerformed(evt);
            }
        });

        botonYouTube.setBackground(new java.awt.Color(0, 0, 0));
        botonYouTube.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonYouTube.setForeground(new java.awt.Color(255, 255, 255));
        botonYouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/youtube.png"))); // NOI18N
        botonYouTube.setBorder(null);
        botonYouTube.setBorderPainted(false);
        botonYouTube.setContentAreaFilled(false);
        botonYouTube.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/youtubeMax.png"))); // NOI18N
        botonYouTube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYouTubeActionPerformed(evt);
            }
        });

        botonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize.png"))); // NOI18N
        botonMinimize.setBorder(null);
        botonMinimize.setBorderPainted(false);
        botonMinimize.setContentAreaFilled(false);
        botonMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMinimize.setIconTextGap(-3);
        botonMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeMax.png"))); // NOI18N
        botonMinimize.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonMinimize.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMinimizeActionPerformed(evt);
            }
        });

        botonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        botonExit.setBorder(null);
        botonExit.setBorderPainted(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonExit.setIconTextGap(-3);
        botonExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitMax.png"))); // NOI18N
        botonExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });

        labelURL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/url.png"))); // NOI18N

        textUrl.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        textUrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUrlKeyTyped(evt);
            }
        });

        botonIr.setBackground(new java.awt.Color(0, 0, 0));
        botonIr.setFont(new java.awt.Font("URW Gothic L", 1, 14)); // NOI18N
        botonIr.setForeground(new java.awt.Color(255, 255, 255));
        botonIr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ir.png"))); // NOI18N
        botonIr.setBorder(null);
        botonIr.setBorderPainted(false);
        botonIr.setContentAreaFilled(false);
        botonIr.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/irMax.png"))); // NOI18N
        botonIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonFacebook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonGoogle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonYouTube)
                .addGap(18, 18, 18)
                .addComponent(labelURL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonExit)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMinimize)
                    .addComponent(botonYouTube)
                    .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonFacebook)
                        .addComponent(botonGoogle))
                    .addComponent(botonExit)
                    .addComponent(labelURL)
                    .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textUrl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonIr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacebookActionPerformed
        url = "http://www.facebook.com";
        browser.loadURL( url );
    }//GEN-LAST:event_botonFacebookActionPerformed

    private void botonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGoogleActionPerformed
        url = "http://www.google.com";
        browser.loadURL( url );
    }//GEN-LAST:event_botonGoogleActionPerformed

    private void botonYouTubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYouTubeActionPerformed
        url = "http://www.youtube.com";
        browser.loadURL( url );
    }//GEN-LAST:event_botonYouTubeActionPerformed

    private void botonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinimizeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonMinimizeActionPerformed

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        this.setVisible(false);
        browser.loadURL( "http://www.google.com" );
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Browser.class.getName()).log(Level.SEVERE, null, ex);
        }
        pantalla.removeProcess( this.idProceso, this, this.procesador );
        this.removeNotify();
    }//GEN-LAST:event_botonExitActionPerformed

    private void botonIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrActionPerformed
        url = textUrl.getText();
        browser.loadURL( url );
        textUrl.setText("");
    }//GEN-LAST:event_botonIrActionPerformed

    private void textUrlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUrlKeyTyped
        char tecla = evt.getKeyChar();
        if( tecla == KeyEvent.VK_ENTER)
           botonIr.doClick();
    }//GEN-LAST:event_textUrlKeyTyped

    public int getIdProceso() {
        return idProceso;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonFacebook;
    private javax.swing.JButton botonGoogle;
    private javax.swing.JButton botonIr;
    private javax.swing.JButton botonMinimize;
    private javax.swing.JButton botonYouTube;
    private javax.swing.JLabel labelURL;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelWeb;
    private javax.swing.JTextField textUrl;
    // End of variables declaration//GEN-END:variables
}