/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * プロになるJava
 * 第12章 「入出力と例外」のサンプルです
 * 
 * @author naoki
 */
public class SimpleClient1 {

    public static void main(String[] args) throws IOException {
        var soc = new Socket("localhost", 1600);
        OutputStream output = soc.getOutputStream();
        output.write(234);
        output.close();
        soc.close();
    }
}
