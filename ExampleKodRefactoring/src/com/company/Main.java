package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] _weekDays = {"Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        int _dayOfWeek = scanner.nextInt();
        System.out.println(_weekDays[--_dayOfWeek]);
    }
}
