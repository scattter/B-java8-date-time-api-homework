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
        int targeMonth = 5;
        int targetDay = 1;
        int timeStampToDayUnit = 1000 * 3600 * 24;
        int targetYear = date.getMonthValue() > targeMonth - 1 ? date.getYear() + 1 : date.getYear();
        LocalDate targetDate = LocalDate.of(targetYear, targeMonth, targetDay);
        long dateTimeStamp = date.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();
        long targetTimeStamp = targetDate.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();
        long day = (targetTimeStamp - dateTimeStamp) / timeStampToDayUnit;

        return day;
    }
}
