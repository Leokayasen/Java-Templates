package com.kai.testapplication;

import javax.swing.*;
public class OptionPaneInputDialogExample {
    JFrame f;
    OptionPaneInputDialogExample() {
        f=new JFrame();
        JOptionPane.showInputDialog(f, "Enter Name");
    }

    public static void main(String[] args) {
        new OptionPaneInputDialogExample();
    }
}