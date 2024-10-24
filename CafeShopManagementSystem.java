package com.mycompany.cafeshopmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CafeShopManagementSystem {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Max & Min Finder");
        frame.setBounds(0, 0, 600, 400);
        frame.setLayout(new GridLayout(6, 2)); // Layout with 6 rows and 2 columns

        // Create labels for input fields
        JLabel n1 = new JLabel("Enter Number 1:");
        JLabel n2 = new JLabel("Enter Number 2:");
        JLabel n3 = new JLabel("Enter Number 3:");

        // Create text fields for inputs and output
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField num3 = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Make result field non-editable

        // Create buttons for finding max and min
        JButton findMaxButton = new JButton("Find Maximum");
        JButton findMinButton = new JButton("Find Minimum");

        // Add components to the frame
        frame.add(n1);
        frame.add(num1);
        frame.add(n2);
        frame.add(num2);
        frame.add(n3);
        frame.add(num3);
        frame.add(findMaxButton);
        frame.add(findMinButton);
        frame.add(new JLabel("Result:"));  // Label for result
        frame.add(resultField);

        // Action listener for "Find Maximum"
        findMaxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Parse input numbers
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int c = Integer.parseInt(num3.getText());

                // Calculate maximum
                int maxNum = Math.max(a, Math.max(b, c));

                // Display the result in the resultField
                resultField.setText("Maximum: " + maxNum);
            }
        });

        // Action listener for "Find Minimum"
        findMinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Parse input numbers
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int c = Integer.parseInt(num3.getText());

                // Calculate minimum
                int minNum = Math.min(a, Math.min(b, c));

                // Display the result in the resultField
                resultField.setText("Minimum: " + minNum);
            }
        });

        // Set frame visibility and default close operation
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
