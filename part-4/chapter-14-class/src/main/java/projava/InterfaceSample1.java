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
 * 第14章 「クラスとインタフェース」のサンプルです
 * @author naoki
 */
public class InterfaceSample1 {
    record Student(String name, int score) {}
    record Teacher(String name, String subject) {}

    public static void main(String[] args){
        var people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"));

        for (var p : people) {
            var n = p instanceof Student s ? s.name() :
                    p instanceof Teacher t ? t.name() :
                                             "---";
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }
}
