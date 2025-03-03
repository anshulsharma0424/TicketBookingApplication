package org.TicketBookingApplication.Entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainID;
    private String trainNumber;
    private List<List<Integer>> seats;
    private Map<String, Time> stationTimings;
    private List<String> stations;

}
