package net.cheltsov.entity;

import java.time.Month;
import java.time.Year;
import java.util.Objects;

public class Magazine extends Edition{

    private Duration duration;
    private int number;
    private Year year;
    private Month month;

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return number == magazine.number &&
                duration == magazine.duration &&
                Objects.equals(year, magazine.year) &&
                month == magazine.month;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), duration, number, year, month);
    }



    static public enum  Duration {
        WEEK, MONTH
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "duration=" + duration +
                ", number=" + number +
                ", year=" + year +
                ", month=" + month +
                "} " + super.toString();
    }
}
