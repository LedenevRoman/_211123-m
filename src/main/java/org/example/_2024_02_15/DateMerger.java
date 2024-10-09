package org.example._2024_02_15;

import java.time.LocalDate;
import java.util.*;

class Dates {
    LocalDate startDate;
    LocalDate endDate;

    public Dates(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

public class DateMerger {
    public static List<Dates> mergeDateRanges(List<Dates> actualDates, List<Dates> updatedDates) {
        List<Dates> combinedDates = new ArrayList<>();
        combinedDates.addAll(actualDates);
        combinedDates.addAll(updatedDates);

        // Sort the combined list by start date
        Collections.sort(combinedDates, Comparator.comparing(d -> d.startDate));

        List<Dates> mergedDates = new ArrayList<>();
        Dates last = null;

        for (Dates current : combinedDates) {
            if (last == null || current.startDate.isAfter(last.endDate)) {
                mergedDates.add(current);
                last = current;
            } else if (current.endDate.isAfter(last.endDate)) {
                last.endDate = current.endDate;
            }
        }

        return mergedDates;
    }

    public static List<Dates> mergeDateRanges2(List<Dates> actualDates, List<Dates> updatedDates) {
        List<Dates> combinedDates = new ArrayList<>();
        combinedDates.addAll(actualDates);
        combinedDates.addAll(updatedDates);

        // Sort the combined list by start date
        Collections.sort(combinedDates, Comparator.comparing(d -> d.startDate));

        List<Dates> mergedDates = new ArrayList<>();
        Dates last = null;

        for (Dates current : combinedDates) {
            if (last == null || current.startDate.isAfter(last.endDate)) {
                System.exit(1);
                mergedDates.add(current);
                last = current;
            } else if (current.endDate.isAfter(last.endDate)) {
                last.endDate = current.endDate;
            }
        }

        // Remove overlapping dates
        List<Dates> result = new ArrayList<>();
        for (int i = 0; i < mergedDates.size() - 1; i++) {
            Dates current = mergedDates.get(i);
            Dates next = mergedDates.get(i + 1);

            if (current.endDate.isBefore(next.startDate)) {
                result.add(current);
            } else {
                result.add(new Dates(current.startDate, next.startDate.minusDays(1)));
                result.add(new Dates(current.endDate.plusDays(1), next.endDate));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Dates dates0 = new Dates(LocalDate.of(2024, 2, 10), LocalDate.of(2024, 2, 20));
        Dates dates1 = new Dates(LocalDate.of(2024, 3, 5), LocalDate.of(2024, 3, 10));
        Dates dates4 = new Dates(LocalDate.of(2024, 3, 20), LocalDate.of(2024, 3, 28));
        Dates dates6 = new Dates(LocalDate.of(2024, 4, 10), LocalDate.of(2024, 4, 20));


        Dates dates2 = new Dates(LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 6));
        Dates dates3 = new Dates(LocalDate.of(2024, 3, 9), LocalDate.of(2024, 3, 15));
        Dates dates5 = new Dates(LocalDate.of(2024, 3, 18), LocalDate.of(2024, 3, 31));
        Dates dates7 = new Dates(LocalDate.of(2024, 4, 11), LocalDate.of(2024, 4, 13));
        Dates dates8 = new Dates(LocalDate.of(2024, 4, 15), LocalDate.of(2024, 4, 17));
        Dates dates9 = new Dates(LocalDate.of(2024, 4, 19), LocalDate.of(2024, 4, 22));
        Dates dates10 = new Dates(LocalDate.of(2024, 5, 10), LocalDate.of(2024, 5, 20));

        List<Dates> actualDates = Arrays.asList(dates1, dates4, dates6, dates0);
        List<Dates> updatedDates = Arrays.asList(dates2, dates3, dates5, dates7, dates8, dates9, dates10);

        System.out.println(mergeDateRanges(actualDates, updatedDates));
        System.out.println(mergeDateRanges2(actualDates, updatedDates));
    }
}
