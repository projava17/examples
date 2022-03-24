/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import java.util.List;

/**
 * プロになるJava
 * 第15章 「継承」のサンプルです
 * @author naoki
 */
public class InheritSample1 {
    static class User {
        String name;

        public String getName() {
            return name;
        }
    }

    static class Student extends User {
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }

    static class Teacher extends User {
        String subject;

        Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
    }

    public static void main(String[] args){
        List<User> people = List.of(
                new Student("kis", 80),
                new Teacher("hosoya", "Math"));
        for (var p : people) {
            System.out.println("こんにちは%sさん".formatted(p.getName()));
        }
    }
}
