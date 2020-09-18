package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.ZoneOffset;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        int laborMonth = 5;
        int laborDay = 1;
        int isNextYear = date.getMonthValue() >= laborMonth ? 1 : 0;
        LocalDate targetDate = LocalDate.of(date.getYear() + isNextYear, laborMonth, laborDay);
        return targetDate.toEpochDay() - date.toEpochDay();
    }
}
