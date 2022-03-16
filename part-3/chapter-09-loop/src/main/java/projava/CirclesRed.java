/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
 */
package projava;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 9章「繰り返し」のサンプルです
 *
 * @author naoki
 */
public class CirclesRed {

    public static void main(String[] args) {
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var g = image.createGraphics();
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (x == 3) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillOval(x * 30 + 50, y * 30 + 20, 25, 25);
            }
        }

        var f = new JFrame("格子");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel(new ImageIcon(image)));
        f.pack();
        f.setVisible(true);
    }
}
