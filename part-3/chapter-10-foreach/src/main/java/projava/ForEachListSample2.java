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
