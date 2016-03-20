/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edit;
import SQL.*;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Container;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author klasecki
 */
public class EditAccess extends javax.swing.JPanel {

    /**
     * Creates new form EditAccess
     */
    

    
    public EditAccess() {
        initComponents();
       
        String sql = "SELECT * FROM AccessSettings";
        ResultSet rs = SQL.run(sql);
                       
        
       try {
        ResultSetMetaData rsmd = rs.getMetaData();
        int i = rsmd.getColumnCount();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }

       
        JCheckBox jCheckBox1 = new javax.swing.JCheckBox();
        JCheckBox jCheckBox2 = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");
        jCheckBox2.setText("jCheckBox1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addComponent(jCheckBox2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addComponent(jCheckBox2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
