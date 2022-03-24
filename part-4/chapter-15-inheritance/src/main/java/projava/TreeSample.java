/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Naoki Kishida 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

/**
 * プロになるJava
 * 第15章 「継承」のサンプルです
 * @author naoki
 */
public class TreeSample {
    static abstract class Node {
        int val;

        Node(int val) {
            this.val = val;
        }

        abstract int sum();
    }

    static class Leaf extends Node {
        public Leaf(int val) {
            super(val);
        }

        @Override
        int sum() {
            return val;
        }
    }

    static class Branch extends Node {
        Node left;
        Node right;

        Branch(int val, Node left, Node right) {
            super(val);
            this.left = left;
            this.right = right;
        }

        @Override
        int sum() {
            int result = val;
            if (left != null) result += left.sum();
            if (right != null) result += right.sum();
            return result;
        }
    }

    public static void main(String[] args) {
        Node root =
            new Branch(5,
                new Branch(2,
                    new Leaf(4),
                    null),
                new Branch(7,
                    new Leaf(6),
                    new Leaf(8)));
        System.out.println(root.sum());
    }
}
