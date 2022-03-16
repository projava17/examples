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
public class ForSampleContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("skip");
                continue;
            }
            System.out.println(i);
        }
    }
}
