/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
 */
package projava;

/**
 * 9章「繰り返し」のサンプルです
 *
 * @author naoki
 */
public class KakezanTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d | ", i * j);
            }
            System.out.println();
        }
    }
}
