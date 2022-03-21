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
