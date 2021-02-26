package com.company;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyGUIform myGUIform = new MyGUIform();
                myGUIform.setVisible(true);
            }
        });

        /*Scanner in = new Scanner(System.in);
        Service service = new Service();
        Products shopping = new Products();

        System.out.println("Enter name and phone number: ");

        service.order();
        shopping.start();
        service.seeOrder();*/
    }
}