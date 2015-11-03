package gui;

import javax.swing.*;

public class CalcButtons extends JButton {

    public CalcButtons(String titleButton) {
        super.setText(titleButton);
    }

    public CalcButtons(String titleButton, int width, int height) {
        this(titleButton);
        super.setSize(width, height);
    }
}
