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
 * プロになるJava
 * 第15章 「継承」のサンプルです
 * @author naoki
 */
public class DiffSampleInherit {
    public static void main(String[] args) {
        var f = new JFrame("差分プログラミング");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var g = img.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 600, 400);
        g.drawImage(lineImage(), 10,10, f);
        g.drawImage(rectImage(), 300, 80, f);
        var label = new JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
    }

    static BufferedImage lineImage() {
        // 初刷では引数に誤りがあり結果が画像のようになりません。
        // var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        // graphics.drawLine(10, 10, 400, 300);
        graphics.drawLine(10, 10, 220, 180);
        return image;
    }


    static BufferedImage rectImage() {
        // var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_RGB);
        var graphics = image.createGraphics();
        // graphics.drawRect(10, 10, 400, 300);
        graphics.drawRect(10, 10, 220, 180);
        return image;
    }
}
