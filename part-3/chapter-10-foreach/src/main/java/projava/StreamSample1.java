package projava;

import java.util.ArrayList;
import java.util.List;

/**
 * プロになるJava
 * 10章「データ構造の処理」のサンプルです
 * @author naoki
 */
public class StreamSample1 {

    public static void main(String[] args) {
        var data = List.of("apple", "banana", "grape");

        var result = new ArrayList<String>();
        for (var s : data) {
            if (s.length() >= 5) {
                result.add(s);
            }
        }
        System.out.println(result);
    }
}
