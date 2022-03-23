/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * プロになるJava
 * 10章「データ構造の処理」のサンプルです
 * @author naoki
 */
public class StreamSample1Stream {

    public static void main(String[] args) {
        var data = List.of("apple", "banana", "grape");

        var result = data.stream()
                .filter(s -> (s.length() >= 5))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);
    }
}
