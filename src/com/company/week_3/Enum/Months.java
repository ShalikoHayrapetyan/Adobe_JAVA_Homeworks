package com.company.week_3.Enum;

public enum Months {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    public static Months getMonth(int index) {
        if(index>12 || index<1) throw new RuntimeException();
        return Months.values()[index-1];
    }

}
