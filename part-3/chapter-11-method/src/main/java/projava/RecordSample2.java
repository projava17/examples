package projava;

/**
 * プロになるJava
 * 11章「メソッド」のサンプルです
 * @author naoki
 */
public class RecordSample2 {

    record Student(String name, int englishScore, int mathScore){
        int average() {
            return (this.englishScore() + this.mathScore()) / 2;
        }
    }

    public static void main(String[] args) {
        var kis = new Student("きしだ", 60, 80);
        var a = kis.average();
        System.out.println("平均点は%d点です".formatted(a));
    }
}
