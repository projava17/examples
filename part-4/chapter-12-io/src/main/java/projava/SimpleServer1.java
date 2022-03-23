/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * プロになるJava
 * 第12章 「入出力と例外」のサンプルです
 * 
 * @author naoki
 */
public class SimpleServer1 {

    public static void main(String[] args) throws IOException {
        var server = new ServerSocket(1600);
        System.out.println("Waiting...");
        Socket soc = server.accept();
        System.out.println("connect from " + soc.getInetAddress());
        InputStream input = soc.getInputStream();
        System.out.println(input.read());
        input.close();
        soc.close();
    }
}
