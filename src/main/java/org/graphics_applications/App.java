package org.graphics_applications;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private Toolkit screen = Toolkit.getDefaultToolkit();
    public App() {
        super("tempest");
        this.init();
    }

    public void init() {
        this.createFrame();
        this.addComponents();
        this.setupWindow();
    }

    public void addComponents() {
        Panel appPanel = new Panel();
        appPanel.setBackground(SystemColor.window);
        appPanel.createJLabel("Hello world", Color.ORANGE, new Font("Tahoma", Font.BOLD, 26));
        getContentPane().add(appPanel, "North");
    }

    public void createFrame() {
        Dimension screenSize = this.screen.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        setBounds(width / 4, height / 4, width / 2, height / 2);
    }

    private void setupWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
