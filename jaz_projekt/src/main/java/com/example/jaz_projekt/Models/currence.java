package com.example.jaz_projekt.Models;

import java.util.Date;

public class currence {
    private double average;
    private Date startDate;
    private Date endDate;

    public currence(double average, Date startDate, Date endDate) {
        this.average = average;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public currence(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
