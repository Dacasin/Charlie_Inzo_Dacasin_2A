import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    private JFrame f = new JFrame("Login");
    private JLabel uname = new JLabel("Username:", SwingConstants.CENTER);
    private JLabel pass = new JLabel("Password:", SwingConstants.CENTER);
    private JTextField user = new JTextField();
    private JPasswordField passText = new JPasswordField();
    private JButton loginButton = new JButton("Login");
    private JButton signUpButton = new JButton("Sign Up");

    public Login() {
        createLogin();
    }

    private void createLogin() {
        f.setSize(300, 200);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font labelFont = new Font("SansSerif", Font.PLAIN, 14);
        Color labelColor = new Color(60, 60, 60);
        uname.setFont(labelFont);
        uname.setForeground(labelColor);
        pass.setFont(labelFont);
        pass.setForeground(labelColor);

        Font textFieldFont = new Font("SansSerif", Font.PLAIN, 14);
        Color textFieldColor = new Color(150, 150, 150);
        user.setFont(textFieldFont);
        user.setForeground(textFieldColor);
        passText.setFont(textFieldFont);
        passText.setForeground(textFieldColor);

        Font buttonFont = new Font("SansSerif", Font.PLAIN, 14);
        loginButton.setFont(buttonFont);
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        
        signUpButton.setFont(buttonFont);
        signUpButton.setBackground(new Color(70, 130, 180));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openSignUpWindow();
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.add(uname);
        panel.add(user);
        panel.add(pass);
        panel.add(passText);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttonPanel.add(loginButton);
        buttonPanel.add(signUpButton);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        f.getContentPane().add(mainPanel);
        f.setVisible(true);
    }
    
    private void openSignUpWindow() {
        JFrame signUpFrame = new JFrame("Sign Up");
        signUpFrame.setSize(300, 200);
        signUpFrame.setLocationRelativeTo(null);
        
        JPanel signUpPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        signUpPanel.add(new JLabel("Email:", SwingConstants.CENTER));
        signUpPanel.add(new JTextField());
        signUpPanel.add(new JLabel("Password:", SwingConstants.CENTER));
        signUpPanel.add(new JPasswordField());
        
        JPanel signUpButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        signUpButtonPanel.add(new JButton("Submit"));
        signUpButtonPanel.add(new JButton("Cancel"));
        
        JPanel signUpMainPanel = new JPanel(new BorderLayout(10, 10));
        signUpMainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        signUpMainPanel.add(signUpPanel, BorderLayout.CENTER);
        signUpMainPanel.add(signUpButtonPanel, BorderLayout.SOUTH);
        
        signUpFrame.getContentPane().add(signUpMainPanel);
        signUpFrame.setVisible(true);
    }
}

