package i01_Date_defaultconstructor;

import java.time.LocalDate;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public LocalDate getLocalDate(){
        return LocalDate.of(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("The provided date is not valid!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    private boolean isCorrect(int year, int month, int day){
        return isValidYear(year) && isValidMonth(month) && isValidDay(year, month, day);
    }

    private boolean isValidYear(int year){
        return year>=1900;
    }
    private boolean isValidMonth(int month){
        return 1<=month && month<=12;
    }
    private boolean isValidDay(int year, int month, int day){
        return 1<=day && day<=calculateMonthLength(year, month);
    }

    private int calculateMonthLength(int year, int month) {
        int actualNumberOfDaysInMonth;
        switch (month) {
            case 1:
                actualNumberOfDaysInMonth = 31;
                break;
            case 2:
                actualNumberOfDaysInMonth = (isLeapYear(year) ? 29 : 28);
                break;
            case 3:
                actualNumberOfDaysInMonth = 31;
                break;
            case 4:
                actualNumberOfDaysInMonth = 30;
                break;
            case 5:
                actualNumberOfDaysInMonth = 31;
                break;
            case 6:
                actualNumberOfDaysInMonth = 30;
                break;
            case 7:
                actualNumberOfDaysInMonth = 31;
                break;
            case 8:
                actualNumberOfDaysInMonth = 31;
                break;
            case 9:
                actualNumberOfDaysInMonth = 30;
                break;
            case 10:
                actualNumberOfDaysInMonth = 31;
                break;
            case 11:
                actualNumberOfDaysInMonth = 30;
                break;
            case 12:
                actualNumberOfDaysInMonth = 31;
                break;
            default:
                actualNumberOfDaysInMonth = 0;
        }
        return actualNumberOfDaysInMonth;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 > 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }


public int getYear(){
        return year;
        }

public int getMonth(){
        return month;
        }

public int getDay(){
        return day;
        }
        }
