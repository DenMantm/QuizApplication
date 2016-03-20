/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edit;

import Login.User;
import SQL.Connect;
import SQL.SQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author klasecki
 */
public class EditUser extends javax.swing.JPanel {

Connection con = Connect.ConnectDB();
ResultSet rs = null;
PreparedStatement pst = null;
User user = new User();


    public void setUser(User usr) {
        this.user = usr;
        loadDetails ();
    }

    public EditUser() {
        initComponents();
    }
    

    
    private void loadDetails () {
     TFname.setText(user.getName());
     TFaddress.setText(user.getAccess());
     TFemail.setText(user.getEmail());
     TFphone.setText(user.getPhone());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UDetails = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        TFaddress = new javax.swing.JTextField();
        NewPassword = new javax.swing.JLabel();
        TFpwd1 = new javax.swing.JTextField();
        NewPassword2 = new javax.swing.JLabel();
        TFpwd2 = new javax.swing.JTextField();
        EMail = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        BTupdate = new javax.swing.JButton();
        BTupdatepass = new javax.swing.JButton();

        Name.setText("Name:");

        Address.setText("Address:");

        NewPassword.setText("New password:");

        NewPassword2.setText("Confirm password:");

        EMail.setText("Email:");

        Phone.setText("Phone:");

        BTupdate.setText("Update");
        BTupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTupdateMouseClicked(evt);
            }
        });
        BTupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTupdateActionPerformed(evt);
            }
        });

        BTupdatepass.setText("Change Password");
        BTupdatepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTupdatepassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UDetailsLayout = new javax.swing.GroupLayout(UDetails);
        UDetails.setLayout(UDetailsLayout);
        UDetailsLayout.setHorizontalGroup(
            UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTupdate)
                    .addGroup(UDetailsLayout.createSequentialGroup()
                        .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPassword2)
                            .addComponent(NewPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFpwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(UDetailsLayout.createSequentialGroup()
                        .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name)
                            .addComponent(Address)
                            .addComponent(EMail)
                            .addComponent(Phone))
                        .addGap(57, 57, 57)
                        .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFphone, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(TFaddress)
                            .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFemail)))
                    .addComponent(BTupdatepass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UDetailsLayout.setVerticalGroup(
            UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTupdate)
                .addGap(72, 72, 72)
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(UDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTupdatepass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(UDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(UDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents
 




   
    private void BTupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTupdateMouseClicked
        //user clicked Update button on details screen
        String sql = "Update UDetails set "
        + "name = '" + TFname.getText()
        + "', address = '" +TFaddress.getText()
        + "', email = '" +TFemail.getText()
        + "', phone = '" +TFphone.getText()
        + "' where username='" + user.getLogin() +"'";

        try {
            SQL.update(sql);
            user.setName(TFname.getText());
            user.setAddress(TFaddress.getText());
            user.setEmail(TFemail.getText());
            user.setPhone(TFphone.getText());
            
            JOptionPane.showMessageDialog(null, "Details updated.");

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTupdateMouseClicked

    private void BTupdatepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTupdatepassMouseClicked
        //user clicked update password button

        //check if both passwords are the same
        if (TFpwd1.getText().equals(TFpwd2.getText())) {
            //Send updated password to DB
            String sql = "Update tb_login set "
            + " password = '" +TFpwd1.getText()
            + "' where username='" + user.getLogin() +"'";

            try {
                pst = con.prepareStatement(sql);
                pst.executeUpdate();
                TFpwd1.setText("");
                TFpwd2.setText("");

                JOptionPane.showMessageDialog(null, "Passwords updated!");

            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {JOptionPane.showMessageDialog(null, "Passwords doesn't match!"); }
    }//GEN-LAST:event_BTupdatepassMouseClicked

    private void BTupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton BTupdate;
    private javax.swing.JButton BTupdatepass;
    private javax.swing.JLabel EMail;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NewPassword;
    private javax.swing.JLabel NewPassword2;
    private javax.swing.JLabel Phone;
    public static javax.swing.JTextField TFaddress;
    protected final javax.swing.JTextField TFemail = new javax.swing.JTextField();
    public static javax.swing.JTextField TFname;
    public final javax.swing.JTextField TFphone = new javax.swing.JTextField();
    private javax.swing.JTextField TFpwd1;
    private javax.swing.JTextField TFpwd2;
    private javax.swing.JPanel UDetails;
    // End of variables declaration//GEN-END:variables
}