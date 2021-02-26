package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIform extends JFrame {
    private JButton Kitchen;
    private JPanel rootPanel;
    private JTextArea textArea1;

    public MyGUIform(){

        add(rootPanel);
        setTitle("My First GUI Form");
        setSize(400,500);
        Kitchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Hellfdsfo world");
            }
        });
    }
}
