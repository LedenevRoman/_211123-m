package org.example;

import java.util.*;

/**
 * Даны n билетов с указанием станции отправления и станции прибытия. Составь из них маршрут.
 */

public class MapTask {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("A", "B");
        Ticket t2 = new Ticket("B", "C");
        Ticket t3 = new Ticket("C", "D");
        Ticket t4 = new Ticket("D", "E");
        Ticket t5 = new Ticket("E", "F");
        Ticket t6 = new Ticket("F", "G");
        Ticket t7 = new Ticket("G", "H");

        Set<Ticket> tickets = Set.of(t1, t2, t3, t4, t5, t6, t7);
        System.out.println(tickets);
        System.out.println(getRoute(tickets));
    }

    private static List<Ticket> getRoute(Set<Ticket> tickets) {
        String[] arr = null;
        LinkedList<Ticket> result = new LinkedList<>();
        Ticket someTicket = tickets.stream().findAny().orElseThrow(() -> new IllegalArgumentException("set is empty"));
        Map<String, Ticket> departureTicketMap = new HashMap<>();
        Map<String, Ticket> arrivalTicketMap = new HashMap<>();
        for (Ticket ticket : tickets) {
            departureTicketMap.put(ticket.departure(), ticket);
            arrivalTicketMap.put(ticket.arrival(), ticket);
        }
        while (someTicket != null) {
            result.add(someTicket);
            someTicket = departureTicketMap.get(someTicket.arrival());
        }
        someTicket = result.getFirst();
        while (arrivalTicketMap.containsKey(someTicket.departure())) {
            someTicket = arrivalTicketMap.get(someTicket.departure());
            result.addFirst(someTicket);
        }
        return result;
    }
}

record Ticket(String departure, String arrival) {
}
