package com.employee;

public class Date {
    private int dd , mm,yyyy;
    public void  setDate(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
    public void getDate() {
        System.out.println(dd +"/"+ mm +"/"+ yyyy);
    }
}
