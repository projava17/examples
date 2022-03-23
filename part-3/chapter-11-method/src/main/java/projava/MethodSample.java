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
public class MethodSample {

    public static void main(String[] args) {
        var result = twice(3);
        System.out.println(result);
    }

    static int twice(int x) {
        return x * 2;
    }
}
