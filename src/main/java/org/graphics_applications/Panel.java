package org.graphics_applications;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() { }

//    private void init() {
//        JLabel label = this.createJLabel("Hello world", Color.ORANGE, new Font("Tahoma", Font.BOLD, 26));
//        add(label);
//    }

    public JLabel createJLabel(String text, Color colorText, Font fontFamily) {
        JLabel label = new JLabel(text);
        label.setForeground(colorText);
        label.setFont(fontFamily);

        return label;
    }
}
