package projava;

import java.util.List;

/**
 * プロになるJava
 * 10章「データ構造の処理」のサンプルです
 * @author naoki
 */
public class StreamSample2 {

    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiyama");

        var result = 0;
        for (var s : data) {
            if (s.length() >= 5) {
                result++;
            }
        }
        System.out.println(result);  
    }
}
