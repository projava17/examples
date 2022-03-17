/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Yusuke Yamamoto 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

public class Olympic {
    public boolean isSummerOlympicYear(int year) {
        if (2032 < year) {
            throw new IllegalArgumentException("2032年までをサポートしています。入力: " + year);
        }
        return year % 4 == 0;
    }
}
