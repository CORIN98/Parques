/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parques;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class Iniciars extends javax.swing.JPanel {

    /**
     * Creates new form Iniciars
     */
    public Iniciars() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedula_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        contrasena_txt = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION");
        add(jLabel1);
        jLabel1.setBounds(320, 130, 326, 51);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User3.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(140, 40, 200, 200);

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        add(jLabel2);
        jLabel2.setBounds(170, 340, 116, 39);

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula");
        add(jLabel3);
        jLabel3.setBounds(170, 300, 116, 39);
        add(cedula_txt);
        cedula_txt.setBounds(340, 300, 203, 30);

        jButton1.setBackground(new java.awt.Color(51, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(320, 400, 120, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aun no estas registrado");
        add(jLabel4);
        jLabel4.setBounds(170, 460, 165, 17);
        add(contrasena_txt);
        contrasena_txt.setBounds(340, 350, 200, 30);

        jButton2.setBackground(new java.awt.Color(102, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRARSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(440, 460, 130, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5);
        jLabel5.setBounds(-5, -38, 1090, 890);

        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(140, 70, 70, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("AUI ESTOY");
        Panel1 panel1=new Panel1();
        panel1.setSize(1000, 686);
        panel1.setLocation(0, 0);
        
        removeAll();
        add(panel1,BorderLayout.CENTER);
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cedula=Integer.parseInt(cedula_txt.getText());
        System.out.println("Contraseña"+contrasena_txt.getText());
        if(Repositorio.validaruser(cedula, contrasena_txt.getText())==1){
        System.out.println("AUI ESTOY");
        Parques1 panel1=new Parques1();
        panel1.setSize(1000, 686);
        panel1.setLocation(0, 0);
        
        removeAll();
        add(panel1,BorderLayout.CENTER);
        revalidate();
        repaint();
        }else{
             JOptionPane.showMessageDialog(this, "Verifique los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_txt;
    private javax.swing.JPasswordField contrasena_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
