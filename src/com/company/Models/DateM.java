package com.company.Models;

import java.util.Date;

public class DateM {
    private int year,mounth,day;

    public DateM(int year, int mounth, int day) {
        this.year = year;
        this.mounth = mounth;
        this.day = day;
    }

    public DateM() {}

    public void now() {
        Date c = new Date();
        this.year=c.getYear()-100;
        this.mounth=c.getMonth();
        this.day=c.getDate();
    }

    public void set(int year, int mounth, int day){
        this.year = year;
        this.mounth = mounth;
        this.day = day;
    }

    public String getDate(){return (String.format("%s:%s:%s",day,mounth,year));}
}
