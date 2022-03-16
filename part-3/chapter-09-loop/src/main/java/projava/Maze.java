/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
 */
package projava;

import java.io.IOException;

/**
 * 9章「繰り返し」のサンプルです
 *
 * @author naoki
 */
public class Maze {

    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
            {1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 1);
        var goal = new Position(4, 3);
        for (;;) {
            // 迷路の表示
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x == current.x() && y == current.y()) {
                        System.out.print("o");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            // ゴール判定
            if (current.equals(goal)) {
                System.out.println("GOAL!!!");
                break;
            }
            // キー入力処理
            int ch = System.in.read();
            // 押された方向の座標を得る
            var next = switch (ch) {
                case 'a' ->
                    new Position(current.x() - 1, current.y());
                case 'w' ->
                    new Position(current.x(), current.y() - 1);
                case 's' ->
                    new Position(current.x() + 1, current.y());
                case 'z' ->
                    new Position(current.x(), current.y() + 1);
                default ->
                    current;
            };
            // 押された方向が通路なら進む
            if (map[next.y()][next.x()] == 0) {
                current = next;
            }
            // Enterキーの入力を捨てる
            System.in.read();
        }
    }
}
