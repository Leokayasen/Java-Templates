// https://stackoverflow.com/questions/13731710/allowing-the-enter-key-to-press-the-submit-button-as-opposed-to-only-using-mo

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame {

    private static final long serialVersion = 1L;

    String userInput;

    public inputPrompt(){

        setLayout(new GridLayout());
        JLabel userInputLabel = new JLabel("Input a string ");
        JTextField userInputField = new JTextField();
        JPanel panel = new JPanel();

        // Add panel to Frame
        add(panel);

        // JFrame setup
        setTitle("Event on EstateAgent");


    }

}
