package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        LocalDate laborDayOfSameYear = LocalDate.of(date.getYear(), 5, 1);
        long between;

        if (date.isAfter(laborDayOfSameYear)) {
            LocalDate laborDayOfNextYear = laborDayOfSameYear.withYear(date.getYear() + 1);
            between = ChronoUnit.DAYS.between(laborDayOfNextYear, date);
        } else {
            between = ChronoUnit.DAYS.between(laborDayOfSameYear, date);
        }
        return Math.abs(between);
    }
}
