package projava;

/**
 * プロになるJava
 * 11章「メソッド」のサンプルです
 * @author naoki
 */
public class MethodSample {

    public static void main(String[] args) {
        var result = twice(3);
        System.out.println(result);
    }

    static int twice(int x) {
        return x * 2;
    }
}
