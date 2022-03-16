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
public class SwitchSample3 {

    public static void main(String[] args) {
        var a = 3;
        switch (a) {
            case 1:
            case 2:
                System.out.println("one-two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
