package ProblemSolving.GoldmanSachs;

import java.util.*;

public class IPAddresses {

    /*
    *  Given a list of logs with IP addresses in the following format.
	lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]
	Return the most frequent IP address from the logs. The returned IP address value must be in a string format. If multiple IP addresses have the count equal to max count, then return the address as a comma-separated string with IP addresses in sorted order.

    * */

    public static void main(String[] args) {
        String[] lines = new String[]{"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-20", "10.0.0.3 - GET 2020-08-20", "10.0.0.4 - GET 2020-08-20"};
        System.out.println(getMostFrequentIPAddress(lines));
    }

    private static String getMostFrequentIPAddress(String[] lines) {
        Map<String, Integer> map = new HashMap<>();
        for (String line : lines) {
            String ip = line.split(" - ")[0];
            map.put(ip, map.getOrDefault(ip, 0) + 1);
        }
        int max = 0;
        for (int value : map.values()) {
            max = Math.max(max, value);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list.size() == 1 ? list.get(0) : String.join(",", list);
    }
}
