/*
 * signup.java
 *
 * Created on November 9, 2022, 9:13 AM
 */
//JavaFX is a Java library used to develop Desktop applications as well as Rich Internet Applications (RIA). 
//The applications built in JavaFX, can run on multiple platforms including Web, Mobile and Desktops 
//swing is class
package mypackages;
import javax.swing.*;//helps for outputing it contains joptionpane.shoowsmesagedialog which helps to dispslay message as an alert
import java.sql.*;


/*import java.awt.Toolkit;
import java.awt.event.WindowEvent;*/
/*
 *
 * @author  Dr. Sabin
 */
public class adminloginform extends javax.swing.JFrame {

    /** Creates new form signup */
    public adminloginform() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        user_ID = new javax.swing.JTextField();
        jexit = new javax.swing.JButton();
        jlogin = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jregister = new javax.swing.JButton();
        jCheckpsd = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 33));
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("WELCOME TO UNICORN LIBRARY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 40));

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18));
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("UNICORN LIBRARY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 260, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackages/icons/library-2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 790, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 760));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 23));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGIN PAGE");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 30));

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login into your Account !!!");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 230, 30));

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin-Id:");
        jLabel7.setAlignmentX(0.5F);
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 30));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 20));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pasword");
        jLabel8.setAlignmentX(0.5F);
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 30));

        user_ID.setBackground(new java.awt.Color(204, 51, 0));
        user_ID.setForeground(new java.awt.Color(0, 0, 102));
        user_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.add(user_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 340, 30));

        jexit.setBackground(new java.awt.Color(0, 0, 51));
        jexit.setFont(new java.awt.Font("Footlight MT Light", 1, 14));
        jexit.setForeground(new java.awt.Color(255, 255, 255));
        jexit.setText("<< back");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        jPanel2.add(jexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 100, -1));

        jlogin.setBackground(new java.awt.Color(0, 0, 51));
        jlogin.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        jlogin.setForeground(new java.awt.Color(255, 255, 255));
        jlogin.setText("Login");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        jPanel2.add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 100, 30));

        Password.setBackground(new java.awt.Color(204, 51, 0));
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 340, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackages/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackages/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 50, 40));

        jregister.setBackground(new java.awt.Color(0, 0, 51));
        jregister.setFont(new java.awt.Font("Footlight MT Light", 1, 14));
        jregister.setForeground(new java.awt.Color(255, 255, 255));
        jregister.setText("Register here");
        jregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jregisterActionPerformed(evt);
            }
        });
        jPanel2.add(jregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 130, 30));

        jCheckpsd.setText("Check password");
        jCheckpsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckpsdActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckpsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 430, 760));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1238)/2, (screenSize.height-795)/2, 1238, 795);
    }// </editor-fold>//GEN-END:initComponents

private void jregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jregisterActionPerformed
// TODO add your handling code here
 signup obj=new signup();
 obj.show();
 dispose();
   
}//GEN-LAST:event_jregisterActionPerformed

private void jCheckpsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckpsdActionPerformed
// TODO add your handling code here:
    if(jCheckpsd.isSelected()){
    Password.setEchoChar((char)0);
    }
    else{     Password.setEchoChar('*');                                                                   }
}//GEN-LAST:event_jCheckpsdActionPerformed

private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
// TODO add your handling code here:
    
    try{
        /*
         To connect Java application with the MySQL database, we need to follow the following steps
         1.Driver class: The driver class for the mysql database is com.mysql.jdbc.Driver.
         Connection URL: The connection URL for the mysql database is jdbc:mysql://localhost:3306/library where jdbc is the API, mysql is the database, 
         2.localhost is the server name on which mysql is running, we may also use IP address, 3306 is the port number and sonoo is the database name. 
         We may use any database, in such case, we need to replace the sonoo with our database name.
         3.Username: The default username for the mysql database is root.
         4.Password: It is the password given by the user at the time of installing the mysql database. In this example, we are going to use root as the password.
         
         */
      Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryadmins", "root", "");
         String sql="Select * from admins where admin_ID=? and Password=?";
         //The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.
         //As you can see, we are passing parameter (?) for the values. Its value will be set by calling the setter methods of PreparedStatement.
         //executequery is used to execute SELECT query. It returns the object of ResultSet.
         PreparedStatement pst= con.prepareStatement(sql);
         pst.setString(1, user_ID.getText());
       pst.setString(2,Password.getText());
       ResultSet rs=pst.executeQuery();
        if(rs.next()){
            
           JOptionPane.showMessageDialog(null, "You have logged in successfull");
           
           adminhomepage we=new adminhomepage();
           we.setVisible(true);
          dispose();
           
           
       }
       else{
           JOptionPane.showMessageDialog(null, "username and password not Matched");
           
           user_ID.setText("");
           Password.setText("");
       } 
      con.close();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}//GEN-LAST:event_jloginActionPerformed

private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jexitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminloginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox jCheckpsd;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton jexit;
    private javax.swing.JButton jlogin;
    private javax.swing.JButton jregister;
    private javax.swing.JTextField user_ID;
    // End of variables declaration//GEN-END:variables

}
