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
public class RemoveDuplicate {

    public static void main(String[] args) {
        var data = "abcccbaabcc";

        var builder = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (i > 0 && ch == data.charAt(i - 1)) {
                continue;
            }
            builder.append(ch);
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
