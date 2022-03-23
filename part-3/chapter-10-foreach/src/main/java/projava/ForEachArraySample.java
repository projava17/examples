/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * プロになるJava
 * 10章「データ構造の処理」のサンプルです
 * @author naoki
 */
public class ForEachArraySample {

    public static void main(String[] args) {
        var nums = new int[]{2, 3, 5, 7};
        for (var num : nums) {
            System.out.println(num);
        }     
    }
}
