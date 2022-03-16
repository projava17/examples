/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * 7章「条件分岐」のサンプルです
 * @author naoki
 */
public class IfSample {

    public static void main(String[] args) {
        var a = 2;
        if (a < 3) {
            System.out.println("小さい");
        } else if (a < 7) {
            System.out.println("中くらい");
        } else {
            System.out.println("大きい");
        }
    }
}
