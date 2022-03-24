/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * プロになるJava
 * 第14章 「クラスとインタフェース」のサンプルです
 * @author naoki
 */
public class ClassSample1 {

    record Student(String name, int score) {}

    public static void main(String[] args) {
        var s = new Student("kis", 89);
        System.out.println(s);
    }
}
