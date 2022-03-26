package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] _weekDays = {"Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};

        Scanner sw = new Scanner(System.in);
        System.out.print("Введите число: ");
        int week = sw.nextInt();
        String day;
        switch (week) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "---";
                break;
        }
        System.out.println("The day is "+day);

    }

}