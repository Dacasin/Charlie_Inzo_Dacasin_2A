import javax.swing.*;
import java.awt.*;

public class SignUp {
    private JFrame f = new JFrame("Sign Up");
    private JLabel uname = new JLabel("Username:", SwingConstants.CENTER);
    private JLabel pass = new JLabel("Password:", SwingConstants.CENTER);
    private JTextField user = new JTextField();
    private JPasswordField passText = new JPasswordField();
    private JButton signUpButton = new JButton("Sign Up");

    public SignUp() {
        createSignUp();
    }

    private void createSignUp() {
        f.setSize(300, 200);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        signUpButton.setFont(buttonFont);
        signUpButton.setBackground(new Color(70, 130, 180));
        signUpButton.setForeground(Color.WHITE);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.add(uname);
        panel.add(user);
        panel.add(pass);
        panel.add(passText);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttonPanel.add(signUpButton);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        f.getContentPane().add(mainPanel);
        f.setVisible(true);
    }
}
