
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DANI Y GABY
 */
public class videos extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    
    public videos() {
        initComponents();
    }
     public String ventana = "A traves de la ventana";
     public String labYlab= "La bella y la bestia";
     public String IT= "IT";
     public String conjuro="El conjuro";
     public String scary= "Scary movie";
     public String Ted ="Ted";
     public String star="Star wars";
     public String termi="Terminator";
     public String RyF="Rapido y furiosos";
     public String Dpool="Deadpool";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boton_buscador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        bcomprar = new javax.swing.JButton();
        balquilar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("CATEGORIAS DE PELICULAS");

        boton_buscador.setBackground(new java.awt.Color(0, 0, 255));
        boton_buscador.setForeground(new java.awt.Color(255, 204, 51));
        boton_buscador.setText("Buscar");
        boton_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscadorActionPerformed(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        bcomprar.setBackground(new java.awt.Color(0, 0, 255));
        bcomprar.setForeground(new java.awt.Color(255, 204, 51));
        bcomprar.setText("Comprar");
        bcomprar.setEnabled(false);
        bcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcomprarActionPerformed(evt);
            }
        });

        balquilar.setBackground(new java.awt.Color(0, 0, 255));
        balquilar.setForeground(new java.awt.Color(255, 204, 51));
        balquilar.setText("Alquilar");
        balquilar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(balquilar)
                                    .addComponent(bcomprar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(boton_buscador)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_buscador))
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcomprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balquilar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(0, 0, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 255));
        jMenu1.setText("Categorias");

        jMenu3.setForeground(new java.awt.Color(0, 0, 255));
        jMenu3.setText("Romance");

        jMenuItem1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem1.setText("A traves de la ventana");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem2.setText("La bella y la bestia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenu6.setForeground(new java.awt.Color(0, 51, 255));
        jMenu6.setText("Terror");

        jMenuItem9.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem9.setText("IT");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem10.setText("El conjuro");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenu1.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(0, 0, 255));
        jMenu7.setText("Comedia");

        jMenuItem7.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem7.setText("Scary Movie");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem8.setText("Ted");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenu1.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(0, 0, 255));
        jMenu8.setText("Ciencia ficcion");

        jMenuItem5.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem5.setText("Star wars");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem6.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem6.setText("Terminator");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenu1.add(jMenu8);

        jMenu9.setForeground(new java.awt.Color(0, 0, 255));
        jMenu9.setText("Accion");

        jMenuItem3.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem3.setText("Rapido y furioso");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenuItem4.setForeground(new java.awt.Color(0, 0, 255));
        jMenuItem4.setText("Deadpool");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenu1.add(jMenu9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscadorActionPerformed
        // TODO add your handling code here:

        if (Buscador.getText().equals(ventana )){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/ventana_copia.png");
         bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
            
        }
        
        
         if (Buscador.getText().equals(labYlab )){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/bella_bestiaposter.png");
          bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
            
        }
         
         if (Buscador.getText().equals(IT )){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/ESO.png");
          
            bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
        }
          
         if (Buscador.getText().equals(conjuro )){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/conjuro1.png");
          bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
            
        }
         if (Buscador.getText().equals(scary)){

            
             rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/Scary_Movie.png");
         bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
            
        }
          if (Buscador.getText().equals(Ted)){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/oso_ted.png");
         bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
            
        }
          if (Buscador.getText().equals(star)){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/starwars.png");
         bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
            
        }
          if (Buscador.getText().equals(termi)){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/Terminator1984movieposter.png");
         
            bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
        }
          if (Buscador.getText().equals(RyF)){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/fast.png");
         
            bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
        }
          if (Buscador.getText().equals(Dpool)){

            
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/deapool_poster.png");
         
            bcomprar.setEnabled(true);
        balquilar.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_boton_buscadorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
            Buscador.setText(""+ventana);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcomprarActionPerformed
        // TODO add your handling code here:
         if (Buscador.getText().equals(ventana )){
             
        JOptionPane.showMessageDialog(null, "Valor de la pelicula = 80.000");
        
         }
    }//GEN-LAST:event_bcomprarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+star);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Buscador.setText(""+labYlab);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         if (Buscador.getText().equals(ventana )){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=ibjAgqsgQzc"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
        }
        
        
         if (Buscador.getText().equals(labYlab )){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=XpMjfUJ1lUc"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
        }
         if (Buscador.getText().equals(IT )){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=_oBZ_zTz0Nw"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
        }
          if (Buscador.getText().equals(IT )){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=_oBZ_zTz0Nw"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
        }
           if (Buscador.getText().equals(conjuro )){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=_zU1gLWGnpg"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
        }
            if (Buscador.getText().equals(scary)){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=HTLPULt0eJ4"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
        }
            if (Buscador.getText().equals(Ted)){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=9fbo_pQvU7M"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
        }
             if (Buscador.getText().equals(star)){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=8Qn_spdM5Zg"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
            
        }
             if (Buscador.getText().equals(termi)){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=k64P4l2Wmeg"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
            
        }
             if (Buscador.getText().equals(RyF)){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=-oJHZre7XZY"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
            
        }
              if (Buscador.getText().equals(Dpool)){

            
            
            try{
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=0JnRdfiUMa8"));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "error");
            }
            
            
            
            
        }
         
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+IT);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+conjuro);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+scary);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+Ted);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+termi);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+RyF);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
                Buscador.setText(""+Dpool);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new videos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscador;
    private javax.swing.JButton balquilar;
    private javax.swing.JButton bcomprar;
    private javax.swing.JButton boton_buscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}