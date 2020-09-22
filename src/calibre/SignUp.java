package calibre;

import Calibre.connection.config;
import java.awt.HeadlessException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Curtin ID : 20205021
 *
 * @author : Tavish Dilmin Perera Dawatage
 * @version : 3.0
 */
public class SignUp extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        this.icon2.setVisible(false);
        this.icon4.setVisible(false);

        conn = config.connectDB();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        labelNameSignup = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        termsConditions = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        signUpUsername = new javax.swing.JTextField();
        signUpEmail = new javax.swing.JTextField();
        signUpPassword = new javax.swing.JPasswordField();
        signUpCPassword = new javax.swing.JPasswordField();
        formSignUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        formLoginButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/calibre/images/CalibreLogo.png")).getImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/hidden.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 30, 30));

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/hidden.png"))); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon4MousePressed(evt);
            }
        });
        jPanel1.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 30, 30));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/visible.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 30, 30));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/visible.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon3MousePressed(evt);
            }
        });
        jPanel1.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 30, 30));

        labelNameSignup.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelNameSignup.setText("SIGN UP");
        jPanel1.add(labelNameSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("E - mail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        termsConditions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        termsConditions.setText("Terms and Conditions");
        termsConditions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termsConditionsMouseClicked(evt);
            }
        });
        jPanel1.add(termsConditions, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Confirm Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Select a Picture");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        browseButton.setBackground(new java.awt.Color(0, 255, 255));
        browseButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        browseButton.setText("Browse File");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(browseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 120, 30));

        signUpUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(signUpUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 320, 30));

        signUpEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpEmailActionPerformed(evt);
            }
        });
        jPanel1.add(signUpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 320, 30));

        signUpPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(signUpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, 30));

        signUpCPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(signUpCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 320, 30));

        formSignUpButton.setBackground(new java.awt.Color(0, 255, 255));
        formSignUpButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        formSignUpButton.setText("SIGN UP");
        formSignUpButton.setToolTipText("Click to Sign Up");
        formSignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formSignUpButtonMouseClicked(evt);
            }
        });
        formSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formSignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(formSignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 140, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        formLoginButton.setBackground(new java.awt.Color(0, 255, 255));
        formLoginButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        formLoginButton.setText("LOGIN");
        formLoginButton.setToolTipText("Click to Login");
        formLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formLoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(formLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 140, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/bgImg.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formLoginButtonActionPerformed
        new LoginToContinue().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formLoginButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formSignUpButtonActionPerformed
        
    }//GEN-LAST:event_formSignUpButtonActionPerformed

    private void formSignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formSignUpButtonMouseClicked
        validation();
    }//GEN-LAST:event_formSignUpButtonMouseClicked

    private void signUpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpEmailActionPerformed
       
    }//GEN-LAST:event_signUpEmailActionPerformed

    //Password hidden icons
    //Obtaiined from Youtube, https://youtu.be/yFljqVmDgh0
    //(accessed 1 May 2020)
    private void icon3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MousePressed
        icon4.setVisible(true);
        icon3.setVisible(false);
        signUpCPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_icon3MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        signUpPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_icon1MousePressed

    private void icon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MousePressed
        icon3.setVisible(true);
        icon4.setVisible(false);
        signUpCPassword.setEchoChar('*');
    }//GEN-LAST:event_icon4MousePressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        signUpPassword.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void termsConditionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsConditionsMouseClicked
        Terms t = new Terms();
        t.setVisible(true);
    }//GEN-LAST:event_termsConditionsMouseClicked

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        //File Chooser
        //Obtaiined from Youtube, https://youtu.be/nVWXJ3qqi0o
        //(accessed 10 May 2020)
        final JFileChooser picChooser = new JFileChooser();
       
       FileNameExtensionFilter image  = new FileNameExtensionFilter("JPEG", "PNG");
       picChooser.setFileFilter(image);
       
       int option = picChooser.showOpenDialog(picChooser);
        String filename = null;
        
        if(option == JFileChooser.APPROVE_OPTION){
            filename = picChooser.getSelectedFile().getAbsolutePath();
            Path path = Paths.get(filename); 
            jLabel7.setText(path.getFileName().toString());
        }
    }//GEN-LAST:event_browseButtonActionPerformed
    
    //Insert into SQLite Database
    // Obtaiined from Youtube, https://youtu.be/xRSSdT2dP58
    //(accessed 12 April 2020)
    public void signupFunction() {

        try {

            String insert = "INSERT INTO users (user_Name, user_Email, user_Password) VALUES (?,?,?)";

            pst = conn.prepareStatement(insert);

            pst.setString(1, signUpUsername.getText());
            pst.setString(2, signUpEmail.getText());
            pst.setString(3, signUpPassword.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Profile Created Successfully Please Login", "Alert", JOptionPane.INFORMATION_MESSAGE);
            new LoginToContinue().setVisible(true);
            this.setVisible(false);

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Obtaiined from Youtube, https://youtu.be/bvnBszIBMeo
    //(accessed 13 April 2020)
    public boolean checkUsername(String u) {

        boolean userExists = false;

        try {
            String check = "SELECT * FROM users WHERE user_Name = ? ";

            pst = conn.prepareStatement(check);

            pst.setString(1, signUpUsername.getText());

            rs = pst.executeQuery();

            String usernamePool;

            if (rs.next()) {
                usernamePool = rs.getString("user_Name");

                if (usernamePool.equals(u)) {
                    userExists = true;
                }
                if (userExists = true) {
                    JOptionPane.showMessageDialog(null, "Username already in use", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }

        return userExists;

    }

    // Obtaiined from Youtube, https://youtu.be/bvnBszIBMeo
    //(accessed 13 April 2020)
    public boolean checkEmail(String e) {

        boolean emailExists = false;

        try {
            String checkEmail = "SELECT * FROM users WHERE user_Email = ? ";

            pst = conn.prepareStatement(checkEmail);

            pst.setString(1, signUpEmail.getText());

            rs = pst.executeQuery();

            String emailPool;

            if (rs.next()) {
                emailPool = rs.getString("user_Email");

                if (emailPool.equals(e)) {
                    emailExists = true;
                }
                if (emailExists = true) {
                    JOptionPane.showMessageDialog(null, "Email already in use", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (HeadlessException | SQLException exp) {

            JOptionPane.showMessageDialog(null, exp.toString());
        }

        return emailExists;

    }

    //Password Patterns
    // Obtaiined from Java Code Geeks, https://examples.javacodegeeks.com/core-java/util/regex/matcher/validate-password-with-java-regular-expression-example/
    //(accessed 20 April 2020)
    
    //Email Patterns
    // Obtaiined from tutorialspoint, https://www.tutorialspoint.com/validate-email-address-in-java
    //(accessed 20 April 2020)
    public void validation() {

        if (signUpUsername.getText().trim().length() == 0 || signUpPassword.getText().trim().length() == 0
                || signUpEmail.getText().trim().length() == 0 || signUpCPassword.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", signUpEmail.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!(Pattern.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})", signUpPassword.getText()))) {
            JOptionPane.showMessageDialog(null, "The password must be 8 to 40 "
                    + "long and should contain a Capital letter, Simple letter, Number and Special Character", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (checkUsername(signUpUsername.getText())) {
            JOptionPane.showMessageDialog(null, "Profile Created Failed", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (checkEmail(signUpEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Profile Created Failed", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (signUpPassword.getText().equals(signUpCPassword.getText())) {
                signupFunction();
            } else {
                JOptionPane.showMessageDialog(null, "Passwords Dosn't match", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton formLoginButton;
    private javax.swing.JButton formSignUpButton;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNameSignup;
    private javax.swing.JPasswordField signUpCPassword;
    private javax.swing.JTextField signUpEmail;
    private javax.swing.JPasswordField signUpPassword;
    public static javax.swing.JTextField signUpUsername;
    private javax.swing.JLabel termsConditions;
    // End of variables declaration//GEN-END:variables
}