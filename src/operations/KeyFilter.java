package operations;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyFilter {
    public static String digitsOnlyFilter(String value) {
        int len = value.length();
        String result = "";
        boolean oneget = false;

        for (int i = 0; i < len; i++) {
            char ch = value.charAt(i);
            if (Character.isDigit(ch)) {
                result += value.substring(i, i + 1);
            } else if ((ch == '.') && !oneget) {
                oneget = true;
                result += value.substring(i, i + 1);
            }
        }
        return result;
    }

    public static void addKeyFilter(final JTextField field) {
        field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                field.setText(digitsOnlyFilter(field.getText()));
            }
        });
    }
}


