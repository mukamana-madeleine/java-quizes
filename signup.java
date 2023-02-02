/*
 * signup.java
 *
 * Created on November 9, 2022, 9:13 AM
 */

package mypackages;
import java.sql.Connection;
//import com.mysql.jdbc.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.util.regex.Pattern.*; 

/**
 *
 * @author  Dr. Sabin
 */
public class signup extends javax.swing.JFrame {

    /** Creates new form signup */
    public signup() {
        initComponents();
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        midlename = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        user_ID = new javax.swing.JTextField();
        Accademic_year = new javax.swing.JTextField();
        E_mail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jregister = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 33));
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("WELCOME TO UNICORN LIBRARY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 40));

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18));
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("UNICORN LIBRARY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, 260, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackages/icons/signup-library-icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 790, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 760));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tel:");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 40, 20));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 23));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRATION PAGE");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 240, 30));

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setText("Create your Account now!!!");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 230, 30));

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Firstname:");
        jLabel7.setAlignmentX(0.5F);
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 30));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Middlename:");
        jLabel8.setAlignmentX(0.5F);
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 30));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lastname:");
        jLabel9.setAlignmentX(0.5F);
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 30));

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student-ID:");
        jLabel10.setAlignmentX(0.5F);
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, 30));

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Accademic year:");
        jLabel11.setAlignmentX(0.5F);
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 140, 30));

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("create password");
        jLabel13.setAlignmentX(0.5F);
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        Firstname.setBackground(new java.awt.Color(204, 51, 0));
        Firstname.setForeground(new java.awt.Color(0, 0, 102));
        Firstname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.add(Firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 370, 30));

        midlename.setBackground(new java.awt.Color(204, 51, 0));
        midlename.setForeground(new java.awt.Color(0, 0, 102));
        midlename.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        midlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midlenameActionPerformed(evt);
            }
        });
        jPanel2.add(midlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 370, 30));

        lastname.setBackground(new java.awt.Color(204, 51, 0));
        lastname.setForeground(new java.awt.Color(0, 0, 102));
        lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 370, 30));

        user_ID.setBackground(new java.awt.Color(204, 51, 0));
        user_ID.setForeground(new java.awt.Color(0, 0, 102));
        user_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        user_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_IDActionPerformed(evt);
            }
        });
        jPanel2.add(user_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 370, 30));

        Accademic_year.setBackground(new java.awt.Color(204, 51, 0));
        Accademic_year.setForeground(new java.awt.Color(0, 0, 102));
        Accademic_year.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        Accademic_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accademic_yearActionPerformed(evt);
            }
        });
        jPanel2.add(Accademic_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 370, 30));

        E_mail.setBackground(new java.awt.Color(204, 51, 0));
        E_mail.setForeground(new java.awt.Color(0, 0, 102));
        E_mail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        E_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_mailActionPerformed(evt);
            }
        });
        jPanel2.add(E_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 370, 30));

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E-mail:");
        jLabel14.setAlignmentX(0.5F);
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 70, 30));

        telephone.setBackground(new java.awt.Color(204, 51, 0));
        telephone.setForeground(new java.awt.Color(0, 0, 102));
        telephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneActionPerformed(evt);
            }
        });
        jPanel2.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 370, 30));

        jregister.setBackground(new java.awt.Color(0, 0, 51));
        jregister.setFont(new java.awt.Font("Footlight MT Light", 1, 14));
        jregister.setForeground(new java.awt.Color(255, 255, 255));
        jregister.setText("Register Acccount");
        jregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregisterActionPerformed(evt);
            }
        });
        jPanel2.add(jregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 160, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("<< back");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        password.setBackground(new java.awt.Color(204, 51, 0));
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 370, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 430, 760));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1232)/2, (screenSize.height-791)/2, 1232, 791);
    }// </editor-fold>//GEN-END:initComponents

private void midlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midlenameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_midlenameActionPerformed

private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_lastnameActionPerformed

private void user_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_IDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_user_IDActionPerformed

private void Accademic_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accademic_yearActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Accademic_yearActionPerformed

private void E_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_mailActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_E_mailActionPerformed

private void telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_telephoneActionPerformed

private void jregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregisterActionPerformed

    //connecting my application to database "library" 
    
    try{ 
        
       
    
    Connection con=(Connection)
    DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","" ); 
     String Querry="insert into  students(user_ID,password,Firstname,midlename,lastname,Accademic_year,E_mail,telephone) values(?,?,?,?,?,?,?,?)";
    PreparedStatement pst=(PreparedStatement) con.prepareStatement(Querry); 
    if(user_ID.getText().equals("")){
              JOptionPane.showMessageDialog(null, "user must be filled");
         }
   else if(password.getText().equals("")){
        JOptionPane.showMessageDialog(null, "password field must be filled");
    } else if(Firstname.getText().equals("")){
        JOptionPane.showMessageDialog(null, "first name must be filled");
    }
    
    else if(lastname.getText().equals("")){
        JOptionPane.showMessageDialog(null, "last name must be filled");
        }
    else if(Accademic_year.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Accademic year must be filled");
    }
    else if(E_mail.getText().equals("")){
        JOptionPane.showMessageDialog(null, "E-mail must be filled");
       // && !E_mail.matches("^.+@.+\\..+$")
    }
   else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$",email.getText())){
       JOptionPane.showMessageDialog(null, "plz enter valid email");
    }
    else if(Firstname.getText().equals("")){
        JOptionPane.showMessageDialog(null, "first field must be filled");
    }
    else if(telephone.getText().equals("")){
        JOptionPane.showMessageDialog(null, "telephone must be filled");
    }
    
    else{
    pst.setString(1,user_ID.getText()); 
    pst.setString(2,password.getText());
    pst.setString(3,Firstname.getText());  
    pst.setString(4,midlename.getText());
    pst.setString(5,lastname.getText());  
    pst.setString(6,Accademic_year.getText());
    pst.setString(7,E_mail.getText());  
    pst.setString(8,telephone.getText());  
    pst.executeUpdate(); 
   
    JOptionPane.showMessageDialog(null, "registered successfully!!!"); 
    homepage lg=new homepage();
    lg.show();
    dispose();
 
        
    }
    }   
    catch(Exception e){    
        JOptionPane.showMessageDialog(null, e); 
        
    }
    
    
    
}//GEN-LAST:event_jregisterActionPerformed

private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
// TODO add your handling code here:
    login obj=new login();
    obj.show();
    dispose();
}//GEN-LAST:event_jLabel15MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accademic_year;
    private javax.swing.JTextField E_mail;
    private javax.swing.JTextField Firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jregister;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField midlename;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField user_ID;
    // End of variables declaration//GEN-END:variables

}
