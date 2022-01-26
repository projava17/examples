package projava;

public class Olympic {
    public boolean isSummerOlympicYear(int year) {
        if (2032 < year) {
            throw new IllegalArgumentException("2032年までをサポートしています。入力: " + year);
        }
        return year % 4 == 0;
    }
}
