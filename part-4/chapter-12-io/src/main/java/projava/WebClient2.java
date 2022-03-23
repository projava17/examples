/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * プロになるJava
 * 第12章 「入出力と例外」のサンプルです
 * 
 * @author naoki
 */
public class WebClient2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("https://example.com/");
        HttpRequest req = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        body.lines()
            .limit(5)
            .forEach(System.out::println);
    }
}
