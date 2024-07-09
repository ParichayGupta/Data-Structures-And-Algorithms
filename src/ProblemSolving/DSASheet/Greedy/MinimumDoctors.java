package ProblemSolving.DSASheet.Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Event {
    int time;
    boolean isStart;

    public Event(int time, boolean isStart) {
        this.time = time;
        this.isStart = isStart;
    }
}

public class MinimumDoctors {
    public static void main(String[] args) {
        // Example input: start times and end times
        int[] startTimes = { 1, 3, 5, 8, 10 };
        int[] endTimes = { 4, 6, 7, 12, 15 };

        int n = startTimes.length * 2; // Total number of events
        Event[] events = new Event[n];

        for (int i = 0; i < startTimes.length; i++) {
            events[i] = new Event(startTimes[i], true); // Start time event
            events[i + startTimes.length] = new Event(endTimes[i], false); // End time event
        }

        // Sort events based on time
        Arrays.sort(events, Comparator.comparingInt(e -> e.time));

        int doctors = 0;
        int minDoctors = 0;

        for (Event event : events) {
            if (event.isStart) {
                doctors++;
            } else {
                doctors--;
            }
            minDoctors = Math.max(minDoctors, doctors);
        }

        System.out.println("Minimum doctors required: " + minDoctors);
    }
}

