package calibre;

import Calibre.connection.config;
import calibre.data.OtherFeaturesDataHandler;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Curtin ID : 20205021
 *
 * @author : Tavish Dilmin Perera Dawatage
 * @version : 3.0
 */
public class LoginToContinue extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    //Singleton object
    OtherFeaturesDataHandler dataHandler;
    
    /**
     * Creates new form LoginToContinue
     */
    public LoginToContinue() {
        initComponents();
        this.icon2.setVisible(false);

        conn = config.connectDB();

        //Initialize Singleton object
        dataHandler = OtherFeaturesDataHandler.getDataHandlerInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        labelNameLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        forgetPassword = new javax.swing.JLabel();
        signUpButton = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/calibre/images/CalibreLogo.png")).getImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/visible.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel2.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 30, 30));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/hidden.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel2.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 30, 30));

        labelNameLogin.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelNameLogin.setText("LOGIN");
        jPanel2.add(labelNameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        forgetPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        forgetPassword.setText("Forget Password ?");
        forgetPassword.setToolTipText("Forget Password");
        forgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(forgetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/plus.png"))); // NOI18N
        signUpButton.setToolTipText("Click to Join with Calibre");
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });
        jPanel2.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        loginButton.setBackground(new java.awt.Color(0, 255, 255));
        loginButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.setToolTipText("Click to Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 120, 40));

        loginUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginUsername.setToolTipText("Username");
        jPanel2.add(loginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 320, 30));

        loginPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginPassword.setToolTipText("Password");
        loginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        signUpLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signUpLabel.setText("Join with Calibre");
        signUpLabel.setToolTipText("Join with Calibre");
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
        });
        jPanel2.add(signUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calibre/images/bgImg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        new SignUp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUpButtonMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        loginFunction();
    }//GEN-LAST:event_loginButtonMouseClicked

    //Password hidden icons
    //Obtaiined from Youtube, https://youtu.be/yFljqVmDgh0
    //(accessed 1 May 2020)
    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        loginPassword.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        loginPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_icon1MousePressed

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        new SignUp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void forgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordMouseClicked
        new ForgetPassword().setVisible(true);
    }//GEN-LAST:event_forgetPasswordMouseClicked

    //Login by pressing Enter Key
    //Obtaiined from Youtube, https://youtu.be/9WBIAUNNKCE
    //(accessed 13 May 2020)
    private void loginPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (loginUsername.getText().trim().length() == 0 || loginPassword.getText().trim().length() == 0) {
                JOptionPane.showConfirmDialog(null, "All fields are required", "Alert", JOptionPane.CLOSED_OPTION);
            } else {
                loginFunction();
            }
        }
    }//GEN-LAST:event_loginPasswordKeyPressed

    //Obtaiined from Youtube, https://youtu.be/gdKTxaHBOdA
    //(accessed 12 April 2020)
    public void loginFunction() {
        
        int result = 0;
        
        try {
            
            if (loginUsername.getText().trim().length() == 0 || loginPassword.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "All fields are required", "Alert", JOptionPane.CLOSED_OPTION);
            
        } else {
            
                String login = "SELECT user_Name, user_Password FROM users WHERE (user_Name =? and user_Password =?)";
            
                pst = conn.prepareStatement(login);

                pst.setString(1, loginUsername.getText());
                pst.setString(2, loginPassword.getText());

                rs = pst.executeQuery();

                while (rs.next()) {
                    result = result + 1;
                }

                if (result == 1) {
                    changeWindow();
                } else {
                    JOptionPane.showConfirmDialog(null, "Username or Password Incorrect", "Alert", JOptionPane.CLOSED_OPTION);
                }
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }

    public void changeWindow() {
        dataHandler.setUsername(loginUsername.getText());
        dataHandler.setPassword(loginPassword.getText());
        Home.getConvertInstance().setVisible(true);
        this.setVisible(false);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgetPassword;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNameLogin;
    private javax.swing.JButton loginButton;
    public static javax.swing.JPasswordField loginPassword;
    public static javax.swing.JTextField loginUsername;
    private javax.swing.JLabel signUpButton;
    private javax.swing.JLabel signUpLabel;
    // End of variables declaration//GEN-END:variables
}
