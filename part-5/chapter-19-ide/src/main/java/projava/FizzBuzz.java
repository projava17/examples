/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Yusuke Yamamoto 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String out = "";
            if (i % 3 == 0) {
                out += "Fizz";
            }
            if (i % 5 == 0) {
                out += "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                out += i;
            }
            System.out.println(out);
        }
    }

}