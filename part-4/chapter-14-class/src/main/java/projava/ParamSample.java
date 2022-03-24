/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.util.Arrays;

/**
 * プロになるJava
 * 第14章 「クラスとインタフェース」のサンプルです
 * 
 * コマンドライン引数のサンプル
 * 
 * @author naoki
 */
public class ParamSample {

    /**
     * プログラム開始時に呼び出される
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        // 引数の内容を表示(配列は直接表示できないのでArraysのメソッドを使う)
        System.out.println(Arrays.toString(args));
    }
}

/*
 publicではないアウタークラス
 複数のアウタークラスをひとつのファイルに定義できることを示すため
 */
class Dummy {
}