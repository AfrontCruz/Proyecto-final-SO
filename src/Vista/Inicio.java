
package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author afront
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        labelUser = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        labelIcon = new javax.swing.JLabel();
        botonEntrar = new javax.swing.JButton();
        textPass = new javax.swing.JPasswordField();
        labelWall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelUser.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelUser.setText("Usuario:");

        labelPass.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelPass.setText("Contraseña:");

        textUser.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N

        botonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        botonEntrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/entrar.png"))); // NOI18N
        botonEntrar.setText("Terminal");
        botonEntrar.setBorder(null);
        botonEntrar.setBorderPainted(false);
        botonEntrar.setContentAreaFilled(false);
        botonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEntrar.setIconTextGap(-3);
        botonEntrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        textPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(labelIcon))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPass)
                                    .addComponent(labelUser))
                                .addGap(18, 18, 18)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textUser)
                                    .addComponent(textPass, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPass)
                    .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.add(panelLogin);
        panelLogin.setBounds(50, 180, 390, 300);

        labelWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallpaper.png"))); // NOI18N
        panelPrincipal.add(labelWall);
        labelWall.setBounds(0, 0, 1380, 1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        if( textUser.getText().equals("Afront") && textPass.getText().equals("root") ){
            PrincipalScreen principal = new PrincipalScreen();
            this.removeNotify();
        }
        else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelWall;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
