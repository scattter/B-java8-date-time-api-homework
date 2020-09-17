package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.DayOfWeek.*;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

    public static LocalDate getNextWorkDate(LocalDate date) {
        int dateCompareWithFriday = 0;
        int oneDay = 1;
        DayOfWeek weekDay = date.getDayOfWeek();
        return weekDay.compareTo(FRIDAY) < dateCompareWithFriday ? date.plusDays(FRIDAY.compareTo(weekDay)) : date.plusDays((SUNDAY.compareTo(weekDay) + oneDay));
    }
}
