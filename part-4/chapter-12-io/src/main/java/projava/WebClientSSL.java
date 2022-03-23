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
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/**
 * プロになるJava
 * 第12章 「入出力と例外」のサンプルです
 * 
 * @author naoki
 */
public class WebClientSSL {

    public static void main(String[] args) throws IOException {
        var domain = "example.com";
        SocketFactory factory = SSLSocketFactory.getDefault();
        try (Socket soc = factory.createSocket(domain, 443);
             var pw = new PrintWriter(soc.getOutputStream());
             var isr = new InputStreamReader(soc.getInputStream());
             var bur = new BufferedReader(isr)) {
            pw.println("GET /index HTTP/1.1");
            pw.println("Host: " + domain);
            pw.println();
            pw.flush();
            bur.lines()
               .limit(18)
               .forEach(System.out::println);
        }
    }
}
