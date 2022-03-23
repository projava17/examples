/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.util.List;

/**
 * プロになるJava
 * 10章「データ構造の処理」のサンプルです
 * @author naoki
 */
public class ForEachListSample2 {

    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "grape");
        for (var str : strs) {
            System.out.println(str);
        }     
    }
}
