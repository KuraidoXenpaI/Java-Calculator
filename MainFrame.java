import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MainFrame extends JFrame{
    
    private JPanel resultPanel = new JPanel();
    private JLabel resultLabel = new JLabel("");

    private JPanel btnsPanels = new JPanel();
    
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton bDivide = new JButton("/");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton bMultiply = new JButton("*");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton bSubtract = new JButton("-");
    private JButton b0 = new JButton("0");
    private JButton bDot = new JButton(".");
    private JButton bAdd = new JButton("+");
    private JButton bEquals = new JButton("=");

    MainFrame() {

        resultLabel.setVerticalAlignment(JLabel.CENTER); // set label at the center vertically
        resultLabel.setHorizontalAlignment(JLabel.LEFT); // set label at right horizontally
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        resultLabel.setForeground(Color.BLACK);

        // Declare and resultPanel on the MainFrame
        resultPanel.setBackground(Color.GREEN);
        resultPanel.setBounds(7, 7, 372, 93);
        resultPanel.setLayout(new BorderLayout());
        resultPanel.add(resultLabel);
        // Add the components for the resultPanel 
        this.add(resultPanel);

        // Set font size for all the buttons
        b7.setFont(new Font("Arial", Font.PLAIN, 35));
        b8.setFont(new Font("Arial", Font.PLAIN, 35));
        b9.setFont(new Font("Arial", Font.PLAIN, 35));
        bDivide.setFont(new Font("Arial", Font.PLAIN, 35));
        b4.setFont(new Font("Arial", Font.PLAIN, 35));
        b5.setFont(new Font("Arial", Font.PLAIN, 35));
        b6.setFont(new Font("Arial", Font.PLAIN, 35));
        bMultiply.setFont(new Font("Arial", Font.PLAIN, 35));
        b1.setFont(new Font("Arial", Font.PLAIN, 35));
        b2.setFont(new Font("Arial", Font.PLAIN, 35));
        b3.setFont(new Font("Arial", Font.PLAIN, 35));
        bSubtract.setFont(new Font("Arial", Font.PLAIN, 35));
        b0.setFont(new Font("Arial", Font.PLAIN, 35));
        bDot.setFont(new Font("Arial", Font.PLAIN, 35));
        bAdd.setFont(new Font("Arial", Font.PLAIN, 35));
        bEquals.setFont(new Font("Arial", Font.PLAIN, 35));

        // set the border of all buttons
        b7.setBorder(BorderFactory.createEtchedBorder());
        b8.setBorder(BorderFactory.createEtchedBorder());
        b9.setBorder(BorderFactory.createEtchedBorder());
        bDivide.setBorder(BorderFactory.createEtchedBorder());
        b4.setBorder(BorderFactory.createEtchedBorder());
        b5.setBorder(BorderFactory.createEtchedBorder());
        b6.setBorder(BorderFactory.createEtchedBorder());
        bMultiply.setBorder(BorderFactory.createEtchedBorder());
        b1.setBorder(BorderFactory.createEtchedBorder());
        b2.setBorder(BorderFactory.createEtchedBorder());
        b3.setBorder(BorderFactory.createEtchedBorder());
        bSubtract.setBorder(BorderFactory.createEtchedBorder());
        b0.setBorder(BorderFactory.createEtchedBorder());
        bDot.setBorder(BorderFactory.createEtchedBorder());
        bAdd.setBorder(BorderFactory.createEtchedBorder());
        bEquals.setBorder(BorderFactory.createEtchedBorder());

        // Set the background color of all the buttons
        b8.setBackground(Color.DARK_GRAY);
        b9.setBackground(Color.DARK_GRAY);
        b7.setBackground(Color.DARK_GRAY);
        bDivide.setBackground(Color.DARK_GRAY);
        b4.setBackground(Color.DARK_GRAY);
        b5.setBackground(Color.DARK_GRAY);
        b6.setBackground(Color.DARK_GRAY);
        bMultiply.setBackground(Color.DARK_GRAY);
        b1.setBackground(Color.DARK_GRAY);
        b2.setBackground(Color.DARK_GRAY);
        b3.setBackground(Color.DARK_GRAY);
        bSubtract.setBackground(Color.DARK_GRAY);
        b0.setBackground(Color.DARK_GRAY);
        bDot.setBackground(Color.DARK_GRAY);
        bAdd.setBackground(Color.DARK_GRAY);
        bEquals.setBackground(new Color(0xd19132));

        // Set font color of all buttons
        b8.setForeground(Color.WHITE);
        b9.setForeground(Color.WHITE);
        b7.setForeground(Color.WHITE);
        bDivide.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);
        b6.setForeground(Color.WHITE);
        bMultiply.setForeground(Color.WHITE);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        bSubtract.setForeground(Color.WHITE);
        b0.setForeground(Color.WHITE);
        bDot.setForeground(Color.WHITE);
        bAdd.setForeground(Color.WHITE);
        bEquals.setForeground(Color.WHITE);

        // set MouseListener for the buttons
        b8.addMouseListener(new BtnNumHandler(b8, resultLabel));
        b9.addMouseListener(new BtnNumHandler(b9, resultLabel));
        b7.addMouseListener(new BtnNumHandler(b7, resultLabel));
        b4.addMouseListener(new BtnNumHandler(b4, resultLabel));
        b5.addMouseListener(new BtnNumHandler(b5, resultLabel));
        b6.addMouseListener(new BtnNumHandler(b6, resultLabel));
        b1.addMouseListener(new BtnNumHandler(b1, resultLabel));
        b2.addMouseListener(new BtnNumHandler(b2, resultLabel));
        b3.addMouseListener(new BtnNumHandler(b3, resultLabel));
        b0.addMouseListener(new BtnNumHandler(b0, resultLabel));
        bDot.addMouseListener(new BtnNumHandler(bDot, resultLabel));
        bDivide.addMouseListener(new BtnNumHandler(bDivide, resultLabel));
        bMultiply.addMouseListener(new BtnNumHandler(bMultiply, resultLabel));
        bSubtract.addMouseListener(new BtnNumHandler(bSubtract, resultLabel));
        bAdd.addMouseListener(new BtnNumHandler(bAdd, resultLabel));
        bEquals.addMouseListener(new BtnNumHandler(bEquals, resultLabel));

        // Declare and add btnPanels on the MainFrame
        btnsPanels.setBackground(Color.WHITE);
        btnsPanels.setBounds(7, 105, 372, 352);
        btnsPanels.setLayout(new GridLayout(4, 4));
        this.add(btnsPanels);
        // Add components for the btnPanels
        btnsPanels.add(this.b7);
        btnsPanels.add(this.b8);
        btnsPanels.add(this.b9);
        btnsPanels.add(this.bDivide);
        btnsPanels.add(this.b4);
        btnsPanels.add(this.b5);
        btnsPanels.add(this.b6);
        btnsPanels.add(this.bMultiply);
        btnsPanels.add(this.b1);
        btnsPanels.add(this.b2);
        btnsPanels.add(this.b3);
        btnsPanels.add(this.bSubtract);
        btnsPanels.add(this.b0);
        btnsPanels.add(this.bDot);
        btnsPanels.add(this.bAdd);
        btnsPanels.add(this.bEquals);

        this.setTitle("Simple Calculator");
        this.setSize(400, 500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100, 100);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}