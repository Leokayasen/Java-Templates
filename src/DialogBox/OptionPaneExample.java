package com.kai.testapplication;

import javax.swing.*;
public class OptionPaneExample {
    JFrame f;
    OptionPaneExample() {
        f=new JFrame();
        JOptionPane.showMessageDialog(f, "Hello World", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
