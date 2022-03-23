/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * プロになるJava
 * 11章「メソッド」のサンプルです
 * @author naoki
 */
public class RecLoop {

    public static void main(String[] args) {
        loop(0);
    }

    static void loop(int i) {
        if (i >= 5) {
            return;
        }
        System.out.println(i);
        loop(i + 1);
    }
}
