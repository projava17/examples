/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * プロになるJava
 * 第12章 「入出力と例外」のサンプルです
 * 
 * @author naoki
 */
public class WebServer {

    public static void main(String[] args) throws IOException {
        var server = new ServerSocket(8880);
        for (;;) {
            try(Socket soc = server.accept();
                var isr = new InputStreamReader(soc.getInputStream());
                var bur = new BufferedReader(isr);
                var w   = new PrintWriter(soc.getOutputStream()))
            {
                System.out.println("connected from " + soc.getInetAddress());
                bur.lines()
                   .takeWhile(line -> !line.isEmpty())
                   .forEach(System.out::println);
                w.println("""
                          HTTP/1.1 200 OK
                          Content-Type: text/html

                          <html><head><title>Hello</title></head>
                          <body><h1>Hello</h1>It works!</body></html>
                          """);
            }
        }
    }
}
