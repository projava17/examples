/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * プロになるJava
 * 第13章 「処理の難しさの段階」のサンプルです
 * 
 * @author naoki
 */
public class CheckFloat {

    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO
    }

    static boolean check(String data) {
        var state = FloatState.START;
        for (char ch : data.toCharArray()) {
            switch (state) {
                case START -> { // 開始
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }
                case ZERO -> { // 頭のゼロ
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                case INT -> { // 整数部
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                    } else if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }
                case FRAC_START, FRAC -> { // 小数部
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else {
                        return false;
                    }
                }
            }
        }
        return switch (state) {
            case ZERO, INT, FRAC -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        System.out.println(check(""));     // false
        System.out.println(check("012"));  // false
        System.out.println(check(".12"));  // false
        System.out.println(check("12."));  // false
        System.out.println(check("1.2.3"));// false
        System.out.println(check("1..3")); // false
        System.out.println(check("0"));    // true
        System.out.println(check("12"));   // true
        System.out.println(check("12.3")); // true
        System.out.println(check("0.3"));  // true
        System.out.println(check("12.30"));// true
    }
}
