package com.kai.testapplication;

// java  program to create the frame and perform the action in that
// importing the required packages and classes
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
class HelloWorld extends JFrame implements ActionListener {

    // declaring a JLabel to show the files which are selected by the user
    static JLabel l;

    // a default constructor
    HelloWorld()
    {
    }

    public static void main(String args[])
    {
        // // creating an object to the JFrame class and giving the name of the frame
        JFrame f = new JFrame("Swing Example");

        // fixing the size of the frame
        f.setSize(400, 400);

        // giving the frame visibility
        f.setVisible(true);

        // closing the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating a JButton to save the dialog
        JButton b1 = new JButton("Save Dialog");

        // creating a JButton to open the dialog
        JButton b2 = new JButton("Open Dialog");

        // creating an object to the HelloWorld class
        HelloWorld f1 = new HelloWorld();

        // Using action listener class to capture the response of the user using buttons
        b1.addActionListener(f1); // adding b1 button in actionListener
        b2.addActionListener(f1); // adding b2 button in actionListener

        // Creating a panel to add buttons and labels
        JPanel p = new JPanel();

        // adding buttons to the frame
        p.add(b1);
        p.add(b2);

        // set the label to its initial value
        l = new JLabel("no file selected");

        // adding the panel to the frame
        p.add(l);
        f.add(p);

        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        // if the client presses the save button, show the save dialog
        String com = e.getActionCommand();

        if (com.equals("save")) {
            // creating an object to the JFileChooser class
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());

            // calling the showsSaveDialog method to display the save dialog on the frame
            int r = jf.showSaveDialog(null);

            // if the user selects a file
            if (r == JFileChooser.APPROVE_OPTION)

            {
                // setting the label as the path of the selected file
                l.setText(jf.getSelectedFile().getAbsolutePath());
            }
            // if the user canceled the operation
            else
                l.setText("The user cancelled the operation");
        }

        // if the user presses the open dialog, show the open dialog
        else {
            // create an object of JFileChooser class
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());

            // calling the showOpenDialog method to display the save dialog on the frame
            int r = jf.showOpenDialog(null);

            // if the user selects a file
            if (r == JFileChooser.APPROVE_OPTION)

            {
                // setting the label as the path of the selected file
                l.setText(jf.getSelectedFile().getAbsolutePath());
            }
            // if the user canceled the operation
            else
                l.setText("The user cancelled the operation");
        }
    }
}