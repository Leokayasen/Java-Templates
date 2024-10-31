import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationFormExample {
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;

    public RegistrationFormExample() {
        frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,5));

        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        JButton registerBtn = new JButton("Register");
        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Form submitted: Name="+nameField.getText()+"Email="+emailField.getText()+"Password="+passwordField.getText());
            }
        });

        panel.add(registerBtn);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistrationFormExample();
            }
        });
    }

}
