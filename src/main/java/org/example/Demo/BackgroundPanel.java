package org.example.Demo;

import javax.swing.*;
import java.awt.*;



public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Vẽ hình ảnh nền
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
