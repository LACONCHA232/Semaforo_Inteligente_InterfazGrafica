/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semaforofinal;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author diego
 */
public class Visual extends javax.swing.JFrame implements Observer {

    
    public Visual() {
        initComponents();
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JLabelO = new javax.swing.JLabel();
        JLabelS = new javax.swing.JLabel();
        JLabelN = new javax.swing.JLabel();
        JLabelE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 180, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/semaforoVerde.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 170, 290));

        JLabelO.setText("Oeste");
        jPanel1.add(JLabelO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, 40));

        JLabelS.setText("Sur");
        jPanel1.add(JLabelS, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 160, 40));

        JLabelN.setText("Norte");
        jPanel1.add(JLabelN, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 160, 40));

        JLabelE.setText("Este");
        jPanel1.add(JLabelE, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheGris2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 130, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheFerrari2.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 130, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheAzul-1.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 130, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheFerrari2.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheRojo.png"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 130, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheGris-1.png"))); // NOI18N
        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 130, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheBlanco2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 80, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheRojo2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 80, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocheNegro-1.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 80, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crucero.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Coche coche1 = new Coche(1);
        Coche coche2 = new Coche(2);
        Coche coche3 = new Coche(3);
        Coche coche4 = new Coche(4);
        
        Thread C1 = new Thread(coche1);
        Thread C2 = new Thread(coche2);
        Thread C3 = new Thread(coche3);
        Thread C4 = new Thread(coche4);
        
        
        coche1.addObserver(this);
        coche2.addObserver(this);
        coche3.addObserver(this);
        coche4.addObserver(this);
        
        
        C1.start();
        C2.start();
        C3.start();
        C4.start();
        
        
        try {
            Coche.Semaforo(coche1, coche2, coche3, coche4, C1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JLabelE;
    public static javax.swing.JLabel JLabelN;
    public static javax.swing.JLabel JLabelO;
    public static javax.swing.JLabel JLabelS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        
              
        Coche c = (Coche) o;
        int Carril = (int) arg;
        
        switch(c.getNombre()){
            case 1:
                String Car = Integer.toString(Carril);
                this.JLabelN.setText(Car);
                JLabelN.repaint();
                JLabelN.updateUI();
                break;
                
            case 2:
                String Car2 = Integer.toString(Carril);
                JLabelE.setText(Car2);
                break;
        
            case 3:
                String Car3 = Integer.toString(Carril);
                JLabelS.setText(Car3);
                break;

            case 4:
                String Car4 = Integer.toString(Carril);
                JLabelO.setText(Car4);
                break;
        
        }
        
        
        
        
    }

}
