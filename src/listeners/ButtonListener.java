package listeners;

import operations.CalcOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {
    public JTextField textFieldOne;
    public JTextField textFieldTwo;
    public JTextField textFieldThree;


    public ButtonListener(JTextField textFieldOne, JTextField textFieldTwo, JTextField textFieldThree) {
        this.textFieldOne = textFieldOne;
        this.textFieldTwo = textFieldTwo;
        this.textFieldThree = textFieldThree;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }

        JButton btn = (JButton) e.getSource();

        final double a = Double.parseDouble(textFieldOne.getText());
        final double b = Double.parseDouble(textFieldTwo.getText());


        if (btn.getActionCommand().equals("+")) {
            textFieldThree.setText(String.valueOf(CalcOperations.calcSum(a, b)));
        } else if (btn.getActionCommand().equals("-")) {
            textFieldThree.setText(String.valueOf(CalcOperations.calcSubtact(a, b)));
        } else if (btn.getActionCommand().equals("*")) {
            textFieldThree.setText(String.valueOf(CalcOperations.calcMultuply(a, b)));
        } else if (btn.getActionCommand().equals("/")) {
            textFieldThree.setText(String.valueOf(CalcOperations.calcDivide(a, b)));
        }else if (btn.getActionCommand().equals("C")){
            textFieldThree.setText("");
            textFieldOne.setText("0");
            textFieldTwo.setText("0");
        }
    }
}