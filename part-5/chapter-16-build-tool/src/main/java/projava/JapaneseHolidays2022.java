/*
「プロになるJava」サンプル
https://gihyo.jp/book/2022/978-4-297-12685-8

Yusuke Yamamoto 2022 copyright reserved.
License: CC0 1.0 Universal
*/
package projava;

import one.cafebabe.bc4j.BusinessCalendar;

import java.time.LocalDate;

import static one.cafebabe.bc4j.BusinessCalendar.JAPAN;

public class JapaneseHolidays2022 {
    public static void main(String[] args) {
        BusinessCalendar.newBuilder().holiday(JAPAN.PUBLIC_HOLIDAYS).build()
                .getHolidaysBetween(LocalDate.of(2022, 1, 1),
                        LocalDate.of(2022, 12, 31))
                .forEach(System.out::println);
    }
}
