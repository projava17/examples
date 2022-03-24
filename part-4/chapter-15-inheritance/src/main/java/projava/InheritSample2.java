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
public class InheritSample2 {
    static abstract class User {
        String name;

        User(String name) {
            this.name = name;
        }        
        
        public String getName() {
            return name;
        }

        abstract String profile();
        
        @Override
        public String toString() {
            return profile();
        }        
    }

    static class Student extends User {
        int score;

        Student(String name, int score) {
            super(name);
            this.score = score;
        }

        public int getScore() {
            return score;
        }
        
        @Override
        String profile() {
            return "学生 %s, %d点".formatted(getName(), getScore());
        }        
    }

    static class Teacher extends User {
        String subject;

        Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
        
        @Override
        String profile() {
            return "先生 %s, 教科 %s".formatted(getName(), getSubject());
        }
    }

    public static void main(String[] args){
        List<User> people = List.of(
                new User("匿名") {
                    @Override
                    String profile() {
                        return "ダミー";
                    }
                },
                new Student("kis", 80),
                new Teacher("hosoya", "Math"));
        for (var p : people) {
            System.out.println("こんにちは%sさん".formatted(p.getName()));
        }
    }
}
