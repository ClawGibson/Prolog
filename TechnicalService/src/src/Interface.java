package src;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Gamaliel Bernal
 */
public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendData = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        help = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        dato1 = new javax.swing.JCheckBox();
        dato2 = new javax.swing.JCheckBox();
        dato3 = new javax.swing.JCheckBox();
        dato4 = new javax.swing.JCheckBox();
        dato6 = new javax.swing.JCheckBox();
        dato9 = new javax.swing.JCheckBox();
        dato8 = new javax.swing.JCheckBox();
        dato7 = new javax.swing.JCheckBox();
        dato5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendData.setText("Send");
        sendData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendDataActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("EXPERT SYSTEM - TECHNICAL SERVICE");

        help.setText("?");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        dato1.setText("El CPU da pitidos");

        dato2.setText("La CPU se reinicia");

        dato3.setText("Pantallazo azul");

        dato4.setText("Computadora no enciende");

        dato6.setText("Monitor sin señal");

        dato9.setText("Imagen borrosa");

        dato8.setText("Lentitud");

        dato7.setText("Falta informacion");

        dato5.setText("La PC se apaga");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dato1)
                    .addComponent(dato2)
                    .addComponent(dato3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dato4)
                    .addComponent(dato6)
                    .addComponent(dato7))
                .addGap(37, 37, 37)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dato5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato8)
                    .addComponent(dato9))
                .addGap(23, 23, 23))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(dato1)
                        .addGap(18, 18, 18)
                        .addComponent(dato2)
                        .addGap(18, 18, 18)
                        .addComponent(dato3))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dato4)
                            .addComponent(dato8))
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dato6)
                            .addComponent(dato9))
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dato7)
                            .addComponent(dato5))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(help))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendData, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(help)
                .addGap(8, 8, 8)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendData)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset() {
        for (int i = 0; i < container.getComponentCount(); i++) {
            if (container.getComponent(i) instanceof JCheckBox) {
                JCheckBox check = (JCheckBox) container.getComponent(i);
                if (check.isSelected()) {
                    check.setSelected(false);
                }
            }
        }
    }

    private String[] verLista(ArrayList<String> lista) {
        String aux[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            aux[i] = lista.get(i);
        }
        return aux;
    }

    private void sendDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendDataActionPerformed
        ArrayList<String> resp = new ArrayList<>();
        String answers[] = new String[container.getComponentCount()];
        for (int i = 0; i < answers.length; i++) {
            if (container.getComponent(i) instanceof JCheckBox) {
                JCheckBox check = (JCheckBox) container.getComponent(i);
                if (check.isSelected()) {
                    answers[i] = check.getText();
                    resp.add(check.getText());
                }
            }
        }
        if (resp.size() > 2) {
            verLista(resp);
            Permutaciones per = new Permutaciones();
            per.Perm2(verLista(resp), "", 3, verLista(resp).length, verLista(resp).length);
            reset();
        } else {
            System.out.println("No hay suficiente información para realizar un diagnóstico :(");
            reset();
        }
    }//GEN-LAST:event_sendDataActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        JOptionPane.showMessageDialog(null, "Selecciona todos los sintomas que presenta tu PC.", "Instrucciones", HEIGHT);
    }//GEN-LAST:event_helpActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel container;
    private javax.swing.JCheckBox dato1;
    private javax.swing.JCheckBox dato2;
    private javax.swing.JCheckBox dato3;
    private javax.swing.JCheckBox dato4;
    private javax.swing.JCheckBox dato5;
    private javax.swing.JCheckBox dato6;
    private javax.swing.JCheckBox dato7;
    private javax.swing.JCheckBox dato8;
    private javax.swing.JCheckBox dato9;
    private javax.swing.JButton help;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sendData;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
