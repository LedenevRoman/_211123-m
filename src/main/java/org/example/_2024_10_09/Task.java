package org.example._2024_10_09;

public class Task {
    public static void main(String[] args) {
        int day = 6;
        System.out.println(getBySwitchStatement(day));
        System.out.println(getBySwitchExpression(day));
        System.out.println(getByIfElse(day));
        System.out.println(getByTernary(day));
    }

    public static String getBySwitchStatement(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return  "Working";
            case 6:
            case 7:
                return "Holiday";
            default:
                return "Invalid";
        }
    }

    public static String getBySwitchExpression(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "Working";
            case 6, 7 -> "Holiday";
            default -> "Invalid";
        };
    }

    public static String getByIfElse(int day) {
        if (day > 0 && day < 6) {
            return "Working";
        } else if (day >= 6 && day < 8) {
            return "Holiday";
        } else {
            return "Invalid";
        }
    }

    public static String getByTernary(int day) {
        return (day < 6 && day > 0) ? "Working" : (day == 6 || day == 7) ? "Holiday" : "Invalid";
    }
}
