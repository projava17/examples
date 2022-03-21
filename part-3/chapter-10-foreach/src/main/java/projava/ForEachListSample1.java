package projava;

import java.util.List;

/**
 * プロになるJava
 * 10章「データ構造の処理」のサンプルです
 * @author naoki
 */
public class ForEachListSample1 {

    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "grape");
        for (int i = 0; i < strs.size(); i++) {
            var str = strs.get(i);
            System.out.println(str);
        }     
    }
}
