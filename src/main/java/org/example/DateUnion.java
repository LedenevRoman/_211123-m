package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DateUnion {

    private static class Dates {
        LocalDate startDate;
        LocalDate endDate;

        Dates(LocalDate startDate, LocalDate endDate) {
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

        System.out.println(getUnionDates(actualDates, updatedDates));
    }

    private static List<Dates> getUnionDates(List<Dates> actualDates, List<Dates> updatedDates) {
        List<Dates> result = new ArrayList<>();
        actualDates.sort(Comparator.comparing(o -> o.startDate));
        updatedDates.sort(Comparator.comparing(o -> o.startDate));

        int actualPointer = 0;
        int updatedPointer = 0;

        while (actualPointer < actualDates.size() || updatedPointer < updatedDates.size()) {
            if (actualPointer == actualDates.size()) {
                result.add(updatedDates.get(updatedPointer++));
                continue;
            }
            if (updatedPointer == updatedDates.size()) {
                result.add(actualDates.get(actualPointer++));
                continue;
            }
            LocalDate minDate = actualDates.get(actualPointer).startDate.isBefore(updatedDates.get(updatedPointer).startDate) ?
                    actualDates.get(actualPointer).startDate : updatedDates.get(updatedPointer).startDate;
            LocalDate loopMin = minDate;
            LocalDate maxDate = null;
            while (maxDate == null) {
                if (actualPointer == actualDates.size()) {
                    maxDate = updatedDates.get(updatedPointer++).endDate;
                    break;
                }
                if (updatedPointer == updatedDates.size()) {
                    maxDate = actualDates.get(actualPointer++).endDate;
                    break;
                }
                if (loopMin.equals(actualDates.get(actualPointer).startDate)) {
                    if (updatedDates.get(updatedPointer).startDate.isBefore(actualDates.get(actualPointer).endDate)) {
                        if (!updatedDates.get(updatedPointer).endDate.isAfter(actualDates.get(actualPointer).endDate)) {
                            updatedPointer++;
                            continue;
                        }
                        loopMin = updatedDates.get(updatedPointer).startDate;
                    } else {
                        maxDate = actualDates.get(actualPointer).endDate;
                    }
                    actualPointer++;
                } else {
                    if (actualDates.get(actualPointer).startDate.isBefore(updatedDates.get(updatedPointer).endDate)) {
                        if (!actualDates.get(actualPointer).endDate.isAfter(updatedDates.get(updatedPointer).endDate)) {
                            actualPointer++;
                            continue;
                        }
                        loopMin = actualDates.get(actualPointer).startDate;
                    } else {
                        maxDate = updatedDates.get(updatedPointer).endDate;
                    }
                    updatedPointer++;
                }
            }
            result.add(new Dates(minDate, maxDate));
        }
        return result;
    }
}
