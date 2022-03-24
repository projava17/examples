/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * プロになるJava
 * 第13章 「処理の難しさの段階」のサンプルです
 * 
 * @author naoki
 */
public class RemoveDuplicate2 {

    public static void main(String[] args) {
        var data = "abcccbaabcc";

        char prev = 0;
        var builder = new StringBuilder();
        for (char ch : data.toCharArray()) {
            if (ch == prev) {
                continue;
            }
            builder.append(ch);
            prev = ch;
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
