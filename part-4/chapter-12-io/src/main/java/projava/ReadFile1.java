/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * プロになるJava
 * 第12章 「入出力と例外」のサンプルです
 * 
 * @author naoki
 */
public class ReadFile1 {

    public static void main(String[] args) throws IOException {
        var p = Path.of("test.txt");
        String s = Files.readString(p);
        System.out.println(s);
    }
}
