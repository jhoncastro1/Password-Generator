
package main;

import java.util.Random;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Jhon Castro
 */
public class Main extends javax.swing.JFrame {

    
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS ="0123456789";
    private static final String SYMBOLS ="!@#$*+-/";
    
    public static String generatePassword(int length){
        String characters = LOWERCASE + UPPERCASE + NUMBERS + SYMBOLS;
        char[] password = new char[length];
        int i,pos;
        Random r = new Random();
        
        for( i = 0; i < length; i++){
          pos = r.nextInt(characters.length());
          password[i] = characters.charAt(pos);
        }
        return new String(password);
    }
    
    public Main() {
        initComponents();
        pass.setText(generatePassword(8));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pass = new javax.swing.JTextPane();
        msg = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Generador de contraseñas");

        pass.setEditable(false);
        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jScrollPane1.setViewportView(pass);

        msg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        msg.setText("Longitud: 8");

        jSlider1.setMaximum(20);
        jSlider1.setMinimum(8);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(8);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton1.setText("Generar Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Copiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg)
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("Generar Contraseña");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pass.setText(generatePassword(jSlider1.getValue()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        pass.setText(generatePassword(jSlider1.getValue()));
        msg.setText("Longitud: " + jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pass.copy();
    }//GEN-LAST:event_jButton2ActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Main mainFrame = new Main();
            
            // Centrar la ventana en la pantalla
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            mainFrame.setLocation(dim.width / 2 - mainFrame.getSize().width / 2, dim.height / 2 - mainFrame.getSize().height / 2);

            mainFrame.setVisible(true);
        }
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel msg;
    private javax.swing.JTextPane pass;
    // End of variables declaration//GEN-END:variables
}
