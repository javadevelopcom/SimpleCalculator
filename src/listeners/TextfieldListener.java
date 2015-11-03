package listeners;

import gui.CalcGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextfieldListener implements FocusListener {

    private JTextField field;

    public TextfieldListener(JTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(CalcGUI.INPUT_NUMBER)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(CalcGUI.INPUT_NUMBER);
            field.setForeground(Color.GRAY);
        }
    }
}
