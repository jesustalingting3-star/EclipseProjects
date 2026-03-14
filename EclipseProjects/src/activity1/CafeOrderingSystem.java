package activity1;import javax.swing.*;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;

public class CafeOrderingSystem extends JFrame {

    private JPanel contentPane;

 // Coffee
    JCheckBox chkEspresso, chkAmericano, chkCappuccino, chkCaramelMacchiato, chkMocha;
    JTextField txtEspresso, txtAmericano, txtCappuccino, txtCaramelMacchiato, txtMocha;

    // Non Coffee
    JCheckBox chkChocolate, chkMatcha, chkStrawberryMilk, chkLemonade;
    JTextField txtChocolate, txtMatcha, txtStrawberryMilk, txtLemonade;

    // Pastries
    JCheckBox chkCroissant, chkChocolateCroissant, chkMuffin, chkBananaBread, chkCinnamonRoll;
    JTextField txtCroissant, txtChocolateCroissant, txtMuffin, txtBananaBread, txtCinnamonRoll;

    // Desserts
    JCheckBox chkCheesecake, chkChocolateCake, chkBrownies, chkDonut, chkIceCream;
    JTextField txtCheesecake, txtChocolateCake, txtBrownies, txtDonut, txtIceCream;

    // Discounts
    JRadioButton rdoStudent, rdoSenior;
    ButtonGroup discountGroup;

    // Buttons
    JButton btnCompute, btnClear, btnPlace;

    // Receipt Area
    JTextArea receiptArea;

    // Prices
    double priceEspresso = 120;
    double priceAmericano = 130;
    double priceCappuccino = 150;
    double priceCaramelMacchiato = 170;
    double priceMocha = 165;

    double priceChocolate = 140;
    double priceMatcha = 150;
    double priceStrawberryMilk = 130;
    double priceLemonade = 120;

    double priceCroissant = 100;
    double priceMuffin = 110;
    double priceChocolateCroissant = 120;
    double priceBananaBread = 115;
    double priceCinnamonRoll = 130;

    double priceCheesecake = 160;
    double priceBrownies = 120;
    double priceChocolateCake = 170;
    double priceDonut = 90;
    double priceIceCream = 110;
    private JLabel lblPrice_1;
    private JLabel lblPrice_2;
    private JLabel lblPrice_3;
    private JLabel lblPrice_4;
    private JLabel lblPrice_5;
    private JLabel lblPrice_6;
    private JLabel lblPrice_7;
    private JLabel lblPrice_8;
    private JLabel lblPrice_9;
    private JLabel lblPrice_10;
    private JLabel lblPrice_11;
    private JLabel lblPrice_12;
    private JLabel lblPrice_13;
    private JLabel lblPrice_14;
    private JLabel lblPrice_15;
    private JLabel lblPrice_16;
    private JLabel lblPrice_17;
    private JLabel lblPrice_18;
    private JLabel lblPrice_19;
    private JLabel lblPrice_20;
    private JLabel lblQty;
    private JLabel lblQty_2;
    private JLabel lblOrderSummarry;
    private JPanel panel_1;

    public static void main(String[] args) {
    	
    	CafeOrderingSystem frame = new CafeOrderingSystem();
        frame.setVisible(true);
    }
    
    public CafeOrderingSystem() {

        setTitle("Cafe Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1005, 598);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(253, 154, 4));

        // COFFEE
        JLabel lblCoffee = new JLabel("COFFEE");
        lblCoffee.setForeground(new Color(0, 0, 0));
        lblCoffee.setBackground(new Color(255, 255, 255));
        lblCoffee.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCoffee.setBounds(30,50,100,20);
        contentPane.add(lblCoffee);

        chkEspresso = new JCheckBox("Espresso");
        chkEspresso.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkEspresso.setForeground(new Color(0, 0, 0));
        chkEspresso.setBackground(new Color(255, 236, 208));
        chkEspresso.setBounds(30,80,142,20);
        contentPane.add(chkEspresso);

        txtEspresso = new JTextField();
        txtEspresso.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtEspresso.setBackground(new Color(255, 255, 255));
        txtEspresso.setBounds(229,80,50,20);
        txtEspresso.setEditable(false);
        contentPane.add(txtEspresso);
        

    	txtEspresso.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkAmericano = new JCheckBox("Americano");
        chkAmericano.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkAmericano.setForeground(new Color(0, 0, 0));
        chkAmericano.setBackground(new Color(255, 236, 208));
        chkAmericano.setBounds(30,111,142,20);
        contentPane.add(chkAmericano);

        txtAmericano = new JTextField();
        txtAmericano.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtAmericano.setBackground(new Color(255, 255, 255));
        txtAmericano.setBounds(229,111,50,20);
        txtAmericano.setEditable(false);
        contentPane.add(txtAmericano);
        
        txtAmericano.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkCappuccino = new JCheckBox("Cappuccino");
        chkCappuccino.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkCappuccino.setForeground(new Color(0, 0, 0));
        chkCappuccino.setBackground(new Color(255, 236, 208));
        chkCappuccino.setBounds(30,140,143,20);
        contentPane.add(chkCappuccino);

        txtCappuccino = new JTextField();
        txtCappuccino.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtCappuccino.setBackground(new Color(255, 255, 255));
        txtCappuccino.setBounds(229,140,50,20);
        txtCappuccino.setEditable(false);
        contentPane.add(txtCappuccino);
        
        txtCappuccino.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        
        chkCaramelMacchiato = new JCheckBox("Caramel Macchiato");
        chkCaramelMacchiato.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkCaramelMacchiato.setForeground(new Color(0, 0, 0));
        chkCaramelMacchiato.setBackground(new Color(255, 236, 208));
        chkCaramelMacchiato.setBounds(30,170,143,20);
        contentPane.add(chkCaramelMacchiato);

        txtCaramelMacchiato = new JTextField();
        txtCaramelMacchiato.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtCaramelMacchiato.setBackground(new Color(255, 255, 255));
        txtCaramelMacchiato.setBounds(229,170,50,20);
        txtCaramelMacchiato.setEditable(false);
        contentPane.add(txtCaramelMacchiato);
        
        txtCaramelMacchiato.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkMocha = new JCheckBox("Mocha");
        chkMocha.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkMocha.setForeground(new Color(0, 0, 0));
        chkMocha.setBackground(new Color(255, 236, 208));
        chkMocha.setBounds(30,200,143,20);
        contentPane.add(chkMocha);

        txtMocha = new JTextField();
        txtMocha.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtMocha.setBackground(new Color(255, 255, 255));
        txtMocha.setBounds(229,200,50,20);
        txtMocha.setEditable(false);
        contentPane.add(txtMocha);
        
        txtMocha.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        // NON COFFEE
        JLabel lblNonCoffee = new JLabel("Non Coffee Drinks");
        lblNonCoffee.setForeground(new Color(0, 0, 0));
        lblNonCoffee.setBackground(new Color(255, 255, 255));
        lblNonCoffee.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNonCoffee.setBounds(30,260,207,20);
        contentPane.add(lblNonCoffee);

        chkChocolate = new JCheckBox("Hot Chocolate");
        chkChocolate.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkChocolate.setForeground(new Color(0, 0, 0));
        chkChocolate.setBackground(new Color(255, 236, 208));
        chkChocolate.setBounds(30,287,142,20);
        contentPane.add(chkChocolate);

        txtChocolate = new JTextField();
        txtChocolate.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtChocolate.setBackground(new Color(255, 255, 255));
        txtChocolate.setBounds(229,287,50,20);
        txtChocolate.setEditable(false);
        contentPane.add(txtChocolate);
        
        txtChocolate.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkMatcha = new JCheckBox("Matcha Latte");
        chkMatcha.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkMatcha.setForeground(new Color(0, 0, 0));
        chkMatcha.setBackground(new Color(255, 236, 208));
        chkMatcha.setBounds(30,318,142,20);
        contentPane.add(chkMatcha);

        txtMatcha = new JTextField();
        txtMatcha.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtMatcha.setBackground(new Color(255, 255, 255));
        txtMatcha.setBounds(229,318,50,20);
        txtMatcha.setEditable(false);
        contentPane.add(txtMatcha);
        
        txtMatcha.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        
        chkStrawberryMilk = new JCheckBox("Strawberry Milk");
        chkStrawberryMilk.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkStrawberryMilk.setForeground(new Color(0, 0, 0));
        chkStrawberryMilk.setBackground(new Color(255, 236, 208));
        chkStrawberryMilk.setBounds(30,350,142,20);
        contentPane.add(chkStrawberryMilk);

        txtStrawberryMilk = new JTextField();
        txtStrawberryMilk.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtStrawberryMilk.setBackground(new Color(255, 255, 255));
        txtStrawberryMilk.setBounds(229,349,50,20);
        txtStrawberryMilk.setEditable(false);
        contentPane.add(txtStrawberryMilk);
        
        txtStrawberryMilk.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkLemonade = new JCheckBox("Fresh Lemonade");
        chkLemonade.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkLemonade.setForeground(new Color(0, 0, 0));
        chkLemonade.setBackground(new Color(255, 236, 208));
        chkLemonade.setBounds(30,381,142,20);
        contentPane.add(chkLemonade);

        txtLemonade = new JTextField();
        txtLemonade.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtLemonade.setBackground(new Color(255, 255, 255));
        txtLemonade.setBounds(229,381,50,20);
        txtLemonade.setEditable(false);
        contentPane.add(txtLemonade);
        
        txtLemonade.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        // PASTRIES
        JLabel lblPastries = new JLabel("Pastries");
        lblPastries.setForeground(new Color(0, 0, 0));
        lblPastries.setBackground(new Color(255, 255, 255));
        lblPastries.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPastries.setBounds(315,50,100,20);
        contentPane.add(lblPastries);

        chkCroissant = new JCheckBox("Croissant ");
        chkCroissant.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkCroissant.setForeground(new Color(0, 0, 0));
        chkCroissant.setBackground(new Color(255, 236, 208));
        chkCroissant.setBounds(325,80,123,20);
        contentPane.add(chkCroissant);

        txtCroissant = new JTextField();
        txtCroissant.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtCroissant.setBackground(new Color(255, 255, 255));
        txtCroissant.setBounds(513,80,50,20);
        txtCroissant.setEditable(false);
        contentPane.add(txtCroissant);
        
        txtCroissant.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkMuffin = new JCheckBox("Blueberry Muffin ");
        chkMuffin.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkMuffin.setForeground(new Color(0, 0, 0));
        chkMuffin.setBackground(new Color(255, 236, 208));
        chkMuffin.setBounds(325,111,123,20);
        contentPane.add(chkMuffin);

        txtMuffin = new JTextField();
        txtMuffin.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtMuffin.setBackground(new Color(255, 255, 255));
        txtMuffin.setBounds(513,111,50,20);
        txtMuffin.setEditable(false);
        contentPane.add(txtMuffin);
        
        txtMuffin.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        
        chkChocolateCroissant = new JCheckBox("Chocolate Croissant");
        chkChocolateCroissant.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkChocolateCroissant.setForeground(new Color(0, 0, 0));
        chkChocolateCroissant.setBackground(new Color(255, 236, 208));
        chkChocolateCroissant.setBounds(325,140,123,20);
        contentPane.add(chkChocolateCroissant);

        txtChocolateCroissant = new JTextField();
        txtChocolateCroissant.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtChocolateCroissant.setBackground(new Color(255, 255, 255));
        txtChocolateCroissant.setBounds(513,140,50,20);
        txtChocolateCroissant.setEditable(false);
        contentPane.add(txtChocolateCroissant);
        
        txtChocolateCroissant.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkBananaBread = new JCheckBox("Banana Bread ");
        chkBananaBread.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkBananaBread.setForeground(new Color(0, 0, 0));
        chkBananaBread.setBackground(new Color(255, 236, 208));
        chkBananaBread.setBounds(325,170,123,20);
        contentPane.add(chkBananaBread);

        txtBananaBread = new JTextField();
        txtBananaBread.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtBananaBread.setBackground(new Color(255, 255, 255));
        txtBananaBread.setBounds(513,170,50,20);
        txtBananaBread.setEditable(false);
        contentPane.add(txtBananaBread);
        
        txtBananaBread.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkCinnamonRoll = new JCheckBox("Cinnamon Roll");
        chkCinnamonRoll.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkCinnamonRoll.setForeground(new Color(0, 0, 0));
        chkCinnamonRoll.setBackground(new Color(255, 236, 208));
        chkCinnamonRoll.setBounds(325,200,123,20);
        contentPane.add(chkCinnamonRoll);

        txtCinnamonRoll = new JTextField();
        txtCinnamonRoll.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtCinnamonRoll.setBackground(new Color(255, 255, 255));
        txtCinnamonRoll.setBounds(513,200,50,20);
        txtCinnamonRoll.setEditable(false);
        contentPane.add(txtCinnamonRoll);
        
        txtCinnamonRoll.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        // DESSERT
        JLabel lblDessert = new JLabel("Desserts");
        lblDessert.setForeground(new Color(0, 0, 0));
        lblDessert.setBackground(new Color(255, 255, 255));
        lblDessert.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblDessert.setBounds(315,260,100,20);
        contentPane.add(lblDessert);

        chkCheesecake = new JCheckBox("Cheesecake ");
        chkCheesecake.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkCheesecake.setForeground(new Color(0, 0, 0));
        chkCheesecake.setBackground(new Color(255, 236, 208));
        chkCheesecake.setBounds(325,287,123,20);
        contentPane.add(chkCheesecake);

        txtCheesecake = new JTextField();
        txtCheesecake.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtCheesecake.setBackground(new Color(255, 255, 255));
        txtCheesecake.setBounds(513,288,50,20);
        txtCheesecake.setEditable(false);
        contentPane.add(txtCheesecake);
        
        txtCheesecake.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkBrownies = new JCheckBox("Brownies");
        chkBrownies.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkBrownies.setForeground(new Color(0, 0, 0));
        chkBrownies.setBackground(new Color(255, 236, 208));
        chkBrownies.setBounds(325,318,123,20);
        contentPane.add(chkBrownies);

        txtBrownies = new JTextField();
        txtBrownies.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtBrownies.setBackground(new Color(255, 255, 255));
        txtBrownies.setBounds(513,318,50,20);
        txtBrownies.setEditable(false);
        contentPane.add(txtBrownies);
        
        txtBrownies.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        
        chkChocolateCake = new JCheckBox("Chocolate Cake ");
        chkChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkChocolateCake.setForeground(new Color(0, 0, 0));
        chkChocolateCake.setBackground(new Color(255, 236, 208));
        chkChocolateCake.setBounds(325,350,123,20);
        contentPane.add(chkChocolateCake);

        txtChocolateCake = new JTextField();
        txtChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtChocolateCake.setBackground(new Color(255, 255, 255));
        txtChocolateCake.setBounds(513,350,50,20);
        txtChocolateCake.setEditable(false);
        contentPane.add(txtChocolateCake);
        
        txtChocolateCake.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkDonut = new JCheckBox("Donut");
        chkDonut.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkDonut.setForeground(new Color(0, 0, 0));
        chkDonut.setBackground(new Color(255, 236, 208));
        chkDonut.setBounds(325,381,123,20);
        contentPane.add(chkDonut);

        txtDonut = new JTextField();
        txtDonut.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtDonut.setBackground(new Color(255, 255, 255));
        txtDonut.setBounds(513,381,50,20);
        txtDonut.setEditable(false);
        contentPane.add(txtDonut);
        
        txtDonut.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        chkIceCream = new JCheckBox("Ice Cream ");
        chkIceCream.setFont(new Font("Tahoma", Font.BOLD, 10));
        chkIceCream.setForeground(new Color(0, 0, 0));
        chkIceCream.setBackground(new Color(255, 236, 208));
        chkIceCream.setBounds(325,412,123,20);
        contentPane.add(chkIceCream);

        txtIceCream = new JTextField();
        txtIceCream.setFont(new Font("Tahoma", Font.BOLD, 10));
        txtIceCream.setBackground(new Color(255, 255, 255));
        txtIceCream.setBounds(513,412,50,20);
        txtIceCream.setEditable(false);
        contentPane.add(txtIceCream);
        
        txtIceCream.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        // DISCOUNT
        JLabel lblDiscount = new JLabel("Discount");
        lblDiscount.setForeground(new Color(0, 0, 0));
        lblDiscount.setBackground(new Color(255, 255, 255));
        lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblDiscount.setBounds(30,437,100,20);
        contentPane.add(lblDiscount);

        rdoStudent = new JRadioButton("Student (10%)");
        rdoStudent.setFont(new Font("Tahoma", Font.BOLD, 10));
        rdoStudent.setForeground(new Color(0, 0, 0));
        rdoStudent.setBackground(new Color(255, 236, 208));
        rdoStudent.setBounds(30,463,142,20);
        contentPane.add(rdoStudent);

        rdoSenior = new JRadioButton("Senior (20%)");
        rdoSenior.setFont(new Font("Tahoma", Font.BOLD, 10));
        rdoSenior.setForeground(new Color(0, 0, 0));
        rdoSenior.setBackground(new Color(255, 236, 208));
        rdoSenior.setBounds(30,489,142,20);
        contentPane.add(rdoSenior);

        discountGroup = new ButtonGroup();
        discountGroup.add(rdoStudent);
        discountGroup.add(rdoSenior);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(606,80,350,400);
        contentPane.add(scrollPane);
        
                // RECEIPT
                receiptArea = new JTextArea();
                receiptArea.setBackground(new Color(255, 255, 255));
                scrollPane.setViewportView(receiptArea);
                receiptArea.setEditable(false);
                
             // Enable or disable the Product quantity field based on check box selection.
             // If the check box is unchecked, clear the text field.
                chkEspresso.addActionListener(e -> {
                    txtEspresso.setEditable(chkEspresso.isSelected());
                    if(!chkEspresso.isSelected()) txtEspresso.setText("");
                });

                chkAmericano.addActionListener(e -> {
                    txtAmericano.setEditable(chkAmericano.isSelected());
                    if(!chkAmericano.isSelected()) txtAmericano.setText("");
                });

                chkCappuccino.addActionListener(e -> {
                    txtCappuccino.setEditable(chkCappuccino.isSelected());
                    if(!chkCappuccino.isSelected()) txtCappuccino.setText("");
                });

                chkChocolate.addActionListener(e -> {
                    txtChocolate.setEditable(chkChocolate.isSelected());
                    if(!chkChocolate.isSelected()) txtChocolate.setText("");
                });

                chkMatcha.addActionListener(e -> {
                    txtMatcha.setEditable(chkMatcha.isSelected());
                    if(!chkMatcha.isSelected()) txtMatcha.setText("");
                });

                chkCroissant.addActionListener(e -> {
                    txtCroissant.setEditable(chkCroissant.isSelected());
                    if(!chkCroissant.isSelected()) txtCroissant.setText("");
                });

                chkMuffin.addActionListener(e -> {
                    txtMuffin.setEditable(chkMuffin.isSelected());
                    if(!chkMuffin.isSelected()) txtMuffin.setText("");
                });

                chkCheesecake.addActionListener(e -> {
                    txtCheesecake.setEditable(chkCheesecake.isSelected());
                    if(!chkCheesecake.isSelected()) txtCheesecake.setText("");
                });

                chkBrownies.addActionListener(e -> {
                    txtBrownies.setEditable(chkBrownies.isSelected());
                    if(!chkBrownies.isSelected()) txtBrownies.setText("");
                });
                
                chkCaramelMacchiato.addActionListener(e -> {
                    txtCaramelMacchiato.setEditable(chkCaramelMacchiato.isSelected());
                    if(!chkCaramelMacchiato.isSelected()) txtCaramelMacchiato.setText("");
                });

                chkMocha.addActionListener(e -> {
                    txtMocha.setEditable(chkMocha.isSelected());
                    if(!chkMocha.isSelected()) txtMocha.setText("");
                });

                chkStrawberryMilk.addActionListener(e -> {
                    txtStrawberryMilk.setEditable(chkStrawberryMilk.isSelected());
                    if(!chkStrawberryMilk.isSelected()) txtStrawberryMilk.setText("");
                });

                chkLemonade.addActionListener(e -> {
                    txtLemonade.setEditable(chkLemonade.isSelected());
                    if(!chkLemonade.isSelected()) txtLemonade.setText("");
                });

                chkChocolateCroissant.addActionListener(e -> {
                    txtChocolateCroissant.setEditable(chkChocolateCroissant.isSelected());
                    if(!chkChocolateCroissant.isSelected()) txtChocolateCroissant.setText("");
                });

                chkBananaBread.addActionListener(e -> {
                    txtBananaBread.setEditable(chkBananaBread.isSelected());
                    if(!chkBananaBread.isSelected()) txtBananaBread.setText("");
                });

                chkCinnamonRoll.addActionListener(e -> {
                    txtCinnamonRoll.setEditable(chkCinnamonRoll.isSelected());
                    if(!chkCinnamonRoll.isSelected()) txtCinnamonRoll.setText("");
                });

                chkChocolateCake.addActionListener(e -> {
                    txtChocolateCake.setEditable(chkChocolateCake.isSelected());
                    if(!chkChocolateCake.isSelected()) txtChocolateCake.setText("");
                });

                chkDonut.addActionListener(e -> {
                    txtDonut.setEditable(chkDonut.isSelected());
                    if(!chkDonut.isSelected()) txtDonut.setText("");
                });

                chkIceCream.addActionListener(e -> {
                    txtIceCream.setEditable(chkIceCream.isSelected());
                    if(!chkIceCream.isSelected()) txtIceCream.setText("");
                });

        // BUTTONS
        btnCompute = new JButton("COMPUTE TOTAL");
        btnCompute.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnCompute.setBounds(601,489,120,30);
        contentPane.add(btnCompute);

        btnClear = new JButton("CLEAR ORDER");
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnClear.setBounds(724,489,120,30);
        contentPane.add(btnClear);

        btnPlace = new JButton("PLACE ORDER");
        btnPlace.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnPlace.setBounds(846,489,120,30);
        contentPane.add(btnPlace);
        
        JLabel lblNewLabel = new JLabel("MENU");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel.setBounds(20, 10, 105, 20);
        contentPane.add(lblNewLabel);
        
        JLabel lblPrice = new JLabel("Price");
        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice.setForeground(new Color(0, 0, 0));
        lblPrice.setBackground(new Color(255, 255, 255));
        lblPrice.setBounds(183, 50, 40, 20);
        contentPane.add(lblPrice);
        
        lblPrice_1 = new JLabel("₱120");
        lblPrice_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_1.setForeground(new Color(0, 0, 0));
        lblPrice_1.setBackground(new Color(255, 255, 255));
        lblPrice_1.setBounds(183, 84, 40, 13);
        contentPane.add(lblPrice_1);
        
        lblPrice_2 = new JLabel("₱130");
        lblPrice_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_2.setForeground(new Color(0, 0, 0));
        lblPrice_2.setBackground(new Color(255, 255, 255));
        lblPrice_2.setBounds(183, 115, 40, 13);
        contentPane.add(lblPrice_2);
        
        lblPrice_3 = new JLabel("₱150");
        lblPrice_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_3.setForeground(new Color(0, 0, 0));
        lblPrice_3.setBackground(new Color(255, 255, 255));
        lblPrice_3.setBounds(183, 144, 40, 13);
        contentPane.add(lblPrice_3);
        
        lblPrice_4 = new JLabel("₱170");
        lblPrice_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_4.setForeground(new Color(0, 0, 0));
        lblPrice_4.setBackground(new Color(255, 255, 255));
        lblPrice_4.setBounds(183, 170, 40, 13);
        contentPane.add(lblPrice_4);
        
        lblPrice_5 = new JLabel("₱165");
        lblPrice_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_5.setForeground(new Color(0, 0, 0));
        lblPrice_5.setBackground(new Color(255, 255, 255));
        lblPrice_5.setBounds(183, 204, 40, 13);
        contentPane.add(lblPrice_5);
        
        lblPrice_6 = new JLabel("₱140");
        lblPrice_6.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_6.setForeground(new Color(0, 0, 0));
        lblPrice_6.setBackground(new Color(255, 255, 255));
        lblPrice_6.setBounds(183, 291, 40, 13);
        contentPane.add(lblPrice_6);
        
        lblPrice_7 = new JLabel("₱150");
        lblPrice_7.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_7.setForeground(new Color(0, 0, 0));
        lblPrice_7.setBackground(new Color(255, 255, 255));
        lblPrice_7.setBounds(183, 322, 40, 13);
        contentPane.add(lblPrice_7);
        
        lblPrice_8 = new JLabel("₱130");
        lblPrice_8.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_8.setForeground(new Color(0, 0, 0));
        lblPrice_8.setBackground(new Color(255, 255, 255));
        lblPrice_8.setBounds(183, 354, 40, 13);
        contentPane.add(lblPrice_8);
        
        lblPrice_9 = new JLabel("₱120");
        lblPrice_9.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_9.setForeground(new Color(0, 0, 0));
        lblPrice_9.setBackground(new Color(255, 255, 255));
        lblPrice_9.setBounds(183, 385, 40, 13);
        contentPane.add(lblPrice_9);
        
        lblPrice_10 = new JLabel("₱130");
        lblPrice_10.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_10.setForeground(new Color(0, 0, 0));
        lblPrice_10.setBackground(new Color(255, 255, 255));
        lblPrice_10.setBounds(463, 204, 40, 13);
        contentPane.add(lblPrice_10);
        
        lblPrice_11 = new JLabel("₱115");
        lblPrice_11.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_11.setForeground(new Color(0, 0, 0));
        lblPrice_11.setBackground(new Color(255, 255, 255));
        lblPrice_11.setBounds(463, 174, 40, 13);
        contentPane.add(lblPrice_11);
        
        lblPrice_12 = new JLabel("₱120");
        lblPrice_12.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_12.setForeground(new Color(0, 0, 0));
        lblPrice_12.setBackground(new Color(255, 255, 255));
        lblPrice_12.setBounds(463, 144, 40, 13);
        contentPane.add(lblPrice_12);
        
        lblPrice_13 = new JLabel("₱110");
        lblPrice_13.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_13.setForeground(new Color(0, 0, 0));
        lblPrice_13.setBackground(new Color(255, 255, 255));
        lblPrice_13.setBounds(463, 115, 40, 13);
        contentPane.add(lblPrice_13);
        
        lblPrice_14 = new JLabel("₱100");
        lblPrice_14.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_14.setForeground(new Color(0, 0, 0));
        lblPrice_14.setBackground(new Color(255, 255, 255));
        lblPrice_14.setBounds(463, 84, 40, 13);
        contentPane.add(lblPrice_14);
        
        lblPrice_15 = new JLabel("Price");
        lblPrice_15.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_15.setForeground(new Color(0, 0, 0));
        lblPrice_15.setBackground(new Color(255, 255, 255));
        lblPrice_15.setBounds(463, 50, 40, 20);
        contentPane.add(lblPrice_15);
        
        lblPrice_16 = new JLabel("₱160");
        lblPrice_16.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_16.setForeground(new Color(0, 0, 0));
        lblPrice_16.setBackground(new Color(255, 255, 255));
        lblPrice_16.setBounds(463, 291, 40, 13);
        contentPane.add(lblPrice_16);
        
        lblPrice_17 = new JLabel("₱120");
        lblPrice_17.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_17.setForeground(new Color(0, 0, 0));
        lblPrice_17.setBackground(new Color(255, 255, 255));
        lblPrice_17.setBounds(463, 322, 40, 13);
        contentPane.add(lblPrice_17);
        
        lblPrice_18 = new JLabel("₱170");
        lblPrice_18.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_18.setForeground(new Color(0, 0, 0));
        lblPrice_18.setBackground(new Color(255, 255, 255));
        lblPrice_18.setBounds(463, 354, 40, 13);
        contentPane.add(lblPrice_18);
        
        lblPrice_19 = new JLabel("₱90");
        lblPrice_19.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_19.setForeground(new Color(0, 0, 0));
        lblPrice_19.setBackground(new Color(255, 255, 255));
        lblPrice_19.setBounds(463, 385, 40, 13);
        contentPane.add(lblPrice_19);
        
        lblPrice_20 = new JLabel("110");
        lblPrice_20.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice_20.setForeground(new Color(0, 0, 0));
        lblPrice_20.setBackground(new Color(255, 255, 255));
        lblPrice_20.setBounds(463, 416, 40, 13);
        contentPane.add(lblPrice_20);
        
        lblQty = new JLabel("Qty");
        lblQty.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblQty.setForeground(new Color(0, 0, 0));
        lblQty.setBackground(new Color(255, 255, 255));
        lblQty.setBounds(239, 52, 40, 20);
        contentPane.add(lblQty);
        
        lblQty_2 = new JLabel("Qty");
        lblQty_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblQty_2.setForeground(new Color(0, 0, 0));
        lblQty_2.setBackground(new Color(255, 255, 255));
        lblQty_2.setBounds(523, 52, 40, 20);
        contentPane.add(lblQty_2);
        
        lblOrderSummarry = new JLabel("ORDER SUMMARY");
        lblOrderSummarry.setForeground(new Color(0, 0, 0));
        lblOrderSummarry.setBackground(new Color(0, 0, 0));
        lblOrderSummarry.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblOrderSummarry.setBounds(699, 50, 207, 20);
        contentPane.add(lblOrderSummarry);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 236, 208));
        panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel.setBounds(20, 35, 560, 509);
        contentPane.add(panel);
        panel.setLayout(null);
        
        panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel_1.setBackground(new Color(255, 236, 208));
        panel_1.setBounds(590, 35, 383, 509);
        contentPane.add(panel_1);

        // COMPUTE BUTTON
        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double subtotal = 0;
                String receipt = "";

                try {
                	
                    if(chkEspresso.isSelected()){
                    	
                        int qty = Integer.parseInt(txtEspresso.getText());
                        double itemTotal = qty * priceEspresso;
                        subtotal += itemTotal;
                        receipt += "Espresso \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkAmericano.isSelected()){
                        int qty = Integer.parseInt(txtAmericano.getText());
                        double itemTotal = qty * priceAmericano;
                        subtotal += itemTotal;
                        receipt += "Americano \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkCappuccino.isSelected()){
                        int qty = Integer.parseInt(txtCappuccino.getText());
                        double itemTotal = qty * priceCappuccino;
                        subtotal += itemTotal;
                        receipt += "Cappuccino \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkChocolate.isSelected()){
                        int qty = Integer.parseInt(txtChocolate.getText());
                        double itemTotal = qty * priceChocolate;
                        subtotal += itemTotal;
                        receipt += "Hot Chocolate \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkMatcha.isSelected()){
                        int qty = Integer.parseInt(txtMatcha.getText());
                        double itemTotal = qty * priceMatcha;
                        subtotal += itemTotal;
                        receipt += "Matcha Latte \t\t  x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkCroissant.isSelected()){
                        int qty = Integer.parseInt(txtCroissant.getText());
                        double itemTotal = qty * priceCroissant;
                        subtotal += itemTotal;
                        receipt += "Croissant \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkMuffin.isSelected()){
                        int qty = Integer.parseInt(txtMuffin.getText());
                        double itemTotal = qty * priceMuffin;
                        subtotal += itemTotal;
                        receipt += "Blueberry Muffin \t x"+qty+"  \t"+itemTotal+ "\n";
                    }
                    
                    if(chkCheesecake.isSelected()){
                        int qty = Integer.parseInt(txtCheesecake.getText());
                        double itemTotal = qty * priceCheesecake;
                        subtotal += itemTotal;
                        receipt += "Cheesecake \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkBrownies.isSelected()){
                        int qty = Integer.parseInt(txtBrownies.getText());
                        double itemTotal = qty * priceBrownies;
                        subtotal += itemTotal;
                        receipt += "Brownies \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    if(chkCaramelMacchiato.isSelected()){
                        int qty = Integer.parseInt(txtCaramelMacchiato.getText());
                        double itemTotal = qty * priceCaramelMacchiato;
                        subtotal += itemTotal;
                        receipt += "Caramel Macchiato \t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkMocha.isSelected()){
                        int qty = Integer.parseInt(txtMocha.getText());
                        double itemTotal = qty * priceMocha;
                        subtotal += itemTotal;
                        receipt += "Mocha \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkStrawberryMilk.isSelected()){
                        int qty = Integer.parseInt(txtStrawberryMilk.getText());
                        double itemTotal = qty * priceStrawberryMilk;
                        subtotal += itemTotal;
                        receipt += "Strawberry Milk \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkLemonade.isSelected()){
                        int qty = Integer.parseInt(txtLemonade.getText());
                        double itemTotal = qty * priceLemonade;
                        subtotal += itemTotal;
                        receipt += "Fresh Lemonade \t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkChocolateCroissant.isSelected()){
                        int qty = Integer.parseInt(txtChocolateCroissant.getText());
                        double itemTotal = qty * priceChocolateCroissant;
                        subtotal += itemTotal;
                        receipt += "Chocolate Croissant \t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkBananaBread.isSelected()){
                        int qty = Integer.parseInt(txtBananaBread.getText());
                        double itemTotal = qty * priceBananaBread;
                        subtotal += itemTotal;
                        receipt += "Banana Bread \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkCinnamonRoll.isSelected()){
                        int qty = Integer.parseInt(txtCinnamonRoll.getText());
                        double itemTotal = qty * priceCinnamonRoll;
                        subtotal += itemTotal;
                        receipt += "Cinnamon Roll \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkChocolateCake.isSelected()){
                        int qty = Integer.parseInt(txtChocolateCake.getText());
                        double itemTotal = qty * priceChocolateCake;
                        subtotal += itemTotal;
                        receipt += "Chocolate Cake \t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkDonut.isSelected()){
                        int qty = Integer.parseInt(txtDonut.getText());
                        double itemTotal = qty * priceDonut;
                        subtotal += itemTotal;
                        receipt += "Donut \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }

                    if(chkIceCream.isSelected()){
                        int qty = Integer.parseInt(txtIceCream.getText());
                        double itemTotal = qty * priceIceCream;
                        subtotal += itemTotal;
                        receipt += "Ice Cream \t\t x"+qty+"  \t"+itemTotal+"\n";
                    }
                    
                    double discount = 0;
                    String discountType = "None";

                    if(rdoStudent.isSelected()){
                        discount = subtotal * 0.10;
                        discountType = "Student Discount";
                    }

                    if(rdoSenior.isSelected()){
                        discount = subtotal * 0.20;
                        discountType = "Senior Discount";
                    }

                    double total = subtotal - discount;

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                    receiptArea.setText(
                            "============== CAFE RECEIPT ==============\n"+
                            "Date: "+sdf.format(new Date())+"\n\n"+
                            receipt+
                            "\nSubtotal:\t\t\t"+subtotal+
                            "\nDiscount:\t\t\t"+discountType+
                            "\nDiscount Amount:\t\t"+discount+
                            "\n-----------------------------------------------------------------------"+
                            "\nTOTAL:\t\t"+String.format("%.2f", total)+
                            "\n========================================"
                    );

                } catch(NumberFormatException error){
                	JOptionPane.showMessageDialog(contentPane, "Enter number only, Pleaser try again!");
                    receiptArea.setText("Invalid quantity input.");
                }
            }
        });

        // CLEAR BUTTON
        btnClear.addActionListener(e -> {

        	JCheckBox[] checks = {
        			chkEspresso,chkAmericano,chkCappuccino,chkCaramelMacchiato,chkMocha,
        			chkChocolate,chkMatcha,chkStrawberryMilk,chkLemonade,
        			chkCroissant,chkChocolateCroissant,chkMuffin,chkBananaBread,chkCinnamonRoll,
        			chkCheesecake,chkChocolateCake,chkBrownies,chkDonut,chkIceCream
        			};

        	JTextField[] fields = {
        			txtEspresso,txtAmericano,txtCappuccino,txtCaramelMacchiato,txtMocha,
        			txtChocolate,txtMatcha,txtStrawberryMilk,txtLemonade,
        			txtCroissant,txtChocolateCroissant,txtMuffin,txtBananaBread,txtCinnamonRoll,
        			txtCheesecake,txtChocolateCake,txtBrownies,txtDonut,txtIceCream
        			};

            for(JCheckBox c : checks) c.setSelected(false);
            for(JTextField f : fields){
                f.setText("");
                f.setEditable(false);
            }

            discountGroup.clearSelection();
            receiptArea.setText("");
        });

        // PLACE ORDER
        btnPlace.addActionListener(e -> {
            receiptArea.append("\n\nOrder Completed. Thank you!");
        });
    }
}