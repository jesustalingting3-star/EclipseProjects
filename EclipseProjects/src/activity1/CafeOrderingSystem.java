package activity1;import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CafeOrderingSystem extends JFrame implements ActionListener {
    
    // Components
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;
    
    // Panel
    private JPanel panel;
    
    // Variables for calculation
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    
    // Fonts
    private Font textFont = new Font("Arial", Font.BOLD, 30);
    private Font buttonFont = new Font("Arial", Font.BOLD, 20);
    
    // Colors
    private Color bgColor = new Color(240, 240, 240);
    private Color numberColor = new Color(51, 51, 51);
    private Color functionColor = new Color(108, 117, 125);
    private Color operatorColor = new Color(13, 110, 253);
    private Color equalsColor = new Color(25, 135, 84);
    
    public CafeOrderingSystem() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Initialize components
        initializeComponents();
        
        // Set layout
        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(bgColor);
        
        // Add components to frame
        getContentPane().add(createDisplayPanel(), BorderLayout.NORTH);
        getContentPane().add(createButtonPanel(), BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    private void initializeComponents() {
        // Display field
        displayField = new JTextField();
        displayField.setBounds(20, 20, 346, 56);
        displayField.setFont(textFont);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setBackground(Color.WHITE);
        displayField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = createButton(String.valueOf(i), numberColor, Color.WHITE);
            numberButtons[i].addActionListener(this);
        }
        
        // Function buttons
        addButton = createButton("+", operatorColor, Color.WHITE);
        subButton = createButton("-", operatorColor, Color.WHITE);
        mulButton = createButton("*", operatorColor, Color.WHITE);
        divButton = createButton("/", operatorColor, Color.WHITE);
        decButton = createButton(".", functionColor, Color.WHITE);
        equButton = createButton("=", equalsColor, Color.WHITE);
        delButton = createButton("DEL", functionColor, Color.WHITE);
        clrButton = createButton("C", functionColor, Color.WHITE);
        
        // Add action listeners
        functionButtons = new JButton[] {addButton, subButton, mulButton, divButton, 
                                         decButton, equButton, delButton, clrButton};
        
        for (JButton button : functionButtons) {
            button.addActionListener(this);
        }
    }
    
    private JButton createButton(String text, Color bgColor, Color fgColor) {
        JButton button = new JButton(text);
        button.setFont(buttonFont);
        button.setFocusPainted(false);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        return button;
    }
    
    private JPanel createDisplayPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(bgColor);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        panel.setLayout(null);
        panel.add(displayField);
        return panel;
    }
    
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 4, 10, 10));
        panel.setBackground(bgColor);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        
        // Add buttons in order
        panel.add(clrButton);
        panel.add(delButton);
        panel.add(createEmptyButton());
        panel.add(divButton);
        
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        
        panel.add(createEmptyButton());
        panel.add(numberButtons[0]);
        panel.add(decButton);
        panel.add(equButton);
        
        return panel;
    }
    
    private JButton createEmptyButton() {
        JButton button = new JButton();
        button.setEnabled(false);
        button.setBackground(bgColor);
        button.setBorderPainted(false);
        return button;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                displayField.setText(displayField.getText().concat(String.valueOf(i)));
            }
        }
        
        if (e.getSource() == decButton) {
            if (!displayField.getText().contains(".")) {
                displayField.setText(displayField.getText().concat("."));
            }
        }
        
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '+';
            displayField.setText("");
        }
        
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '-';
            displayField.setText("");
        }
        
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '*';
            displayField.setText("");
        }
        
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(displayField.getText());
            operator = '/';
            displayField.setText("");
        }
        
        if (e.getSource() == equButton) {
            try {
                num2 = Double.parseDouble(displayField.getText());
                
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            displayField.setText("Error");
                            return;
                        }
                        break;
                }
                
                // Check if result is an integer
                if (result == (int) result) {
                    displayField.setText(String.valueOf((int) result));
                } else {
                    displayField.setText(String.valueOf(result));
                }
                
                num1 = result;
            } catch (NumberFormatException ex) {
                displayField.setText("Error");
            }
        }
        
        if (e.getSource() == clrButton) {
            displayField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        }
        
        if (e.getSource() == delButton) {
            String currentText = displayField.getText();
            if (!currentText.isEmpty()) {
                displayField.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }
    
    public static void main(String[] args) {
        // Set system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Create calculator on EDT
        SwingUtilities.invokeLater(() -> new CafeOrderingSystem());
    }
}