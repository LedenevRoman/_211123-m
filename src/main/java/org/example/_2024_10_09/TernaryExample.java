package org.example._2024_10_09;

public class TernaryExample {
    public static void main(String[] args) {
        int day = 6;

        String dayName;
        if (day == 1) {
            System.out.println("сделай что то");
            dayName = "Monday";
        } else {
            dayName = "Tuesday";
        }
        System.out.println(dayName);

        String dayName2 = (day == 1) ? "Monday" : "Tuesday";
        System.out.println(dayName2);

        System.out.println((day > 0 && day < 6) ? "Working" : "Holiday");
    }
}
