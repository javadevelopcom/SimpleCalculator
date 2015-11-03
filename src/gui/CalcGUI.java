package gui;

import listeners.ButtonListener;
import listeners.TextfieldListener;
import operations.KeyTyped;

import javax.swing.*;
import java.awt.*;


public class CalcGUI extends KeyTyped {
    public static final String INPUT_NUMBER = "0";

    public void createGUI() {
        JLabel labelOne = new JLabel("a=");
        JLabel labelTwo = new JLabel("b=");
        JLabel labelThree = new JLabel("Result: ");

        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelThree = new JPanel();

        JTextField textFieldOne = new JTextField(INPUT_NUMBER, 10);
        JTextField textFieldTwo = new JTextField(INPUT_NUMBER, 10);
        JTextField textFieldThree = new JTextField(15);
        textFieldThree.setEditable(false);
        textFieldThree.setFocusable(false);
        textFieldOne.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldTwo.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldThree.setHorizontalAlignment(SwingConstants.RIGHT);

        keyTyped(textFieldOne);
        keyTyped(textFieldTwo);

//        addKeyFilter(textFieldOne);
//        addKeyFilter(textFieldTwo);


// PANEL1 (for INPUT FIELDS)
        panelOne.setSize(100, 100);
        panelTwo.setBorder(BorderFactory.createEmptyBorder());
        panelOne.setPreferredSize(new Dimension(200, 50));
        panelOne.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelOne.add(labelOne);
        panelOne.add(textFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(textFieldTwo);

        textFieldOne.addFocusListener(new TextfieldListener(textFieldOne));
        textFieldTwo.addFocusListener(new TextfieldListener(textFieldTwo));

// PANEL2 (for BUTTONS)
        panelTwo.setSize(100, 100);
        panelTwo.setBorder(BorderFactory.createEmptyBorder());
        panelTwo.setPreferredSize(new Dimension(200, 80));
//        panelTwo.setLayout(new GridLayout(0, 4, 10, 10));

        CalcButtons button1 = new CalcButtons("+", 80, 80);
        CalcButtons button2 = new CalcButtons("-", 80, 80);
        CalcButtons button3 = new CalcButtons("*", 80, 80);
        CalcButtons button4 = new CalcButtons("/", 80, 80);
        CalcButtons button5 = new CalcButtons("C", 80, 80);

        panelTwo.add(button1);
        panelTwo.add(button2);
        panelTwo.add(button3);
        panelTwo.add(button4);
        panelTwo.add(button5);

        button1.addActionListener(new ButtonListener(textFieldOne, textFieldTwo, textFieldThree));
        button2.addActionListener(new ButtonListener(textFieldOne, textFieldTwo, textFieldThree));
        button3.addActionListener(new ButtonListener(textFieldOne, textFieldTwo, textFieldThree));
        button4.addActionListener(new ButtonListener(textFieldOne, textFieldTwo, textFieldThree));
        button5.addActionListener(new ButtonListener(textFieldOne, textFieldTwo, textFieldThree));


// PANEL3 (for RESULT)
        panelThree.setSize(100, 100);
        panelThree.setPreferredSize(new Dimension(200, 50));
        panelThree.setBorder(BorderFactory.createEmptyBorder());
        panelThree.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelThree.add(labelThree);
        panelThree.add(textFieldThree);


        JFrame frame = new JFrame("Calculator");
        frame.setName("Calc");
        frame.setSize(290, 180);
        frame.setResizable(false);


        frame.getContentPane().add(panelOne, BorderLayout.NORTH);
        frame.getContentPane().add(panelTwo, BorderLayout.CENTER);
        frame.getContentPane().add(panelThree, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}