/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques;

/**
 *
 * @author johan
 */
public class Administrador extends javax.swing.JPanel {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablapersonas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Usuarios registrados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(50, 220, 190, 30);

        jPanel1.setBackground(new java.awt.Color(3, 76, 115));
        jPanel1.setLayout(null);

        tablapersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablapersonas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 130, 600, 500);

        add(jPanel1);
        jPanel1.setBounds(268, 0, 910, 870);

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU DE OPCIONES");
        add(jLabel2);
        jLabel2.setBounds(40, 130, 230, 60);

        jButton2.setBackground(new java.awt.Color(51, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Historial de juegos");
        add(jButton2);
        jButton2.setBounds(50, 250, 190, 30);

        jButton3.setBackground(new java.awt.Color(51, 51, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mejores puntajes");
        add(jButton3);
        jButton3.setBounds(50, 280, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -4, 1180, 860);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablapersonas;
    // End of variables declaration//GEN-END:variables
}
