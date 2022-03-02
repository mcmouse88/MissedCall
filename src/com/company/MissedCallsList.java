package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCallsList {

    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(LocalDateTime time, String number) {
        missedCalls.put(time, number);
    }

    public Contact findContact(String number, PhoneBook phoneBook) {
        return phoneBook.getAllContactInGroup().get(number);
    }

    public void showMissedCalls(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy г. hh:mm:ss");
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            sb.append(entry.getKey().format(formatter)).append(" -> ")
                    .append(findContact(entry.getValue(), phoneBook) == null ? entry.getValue() : findContact(entry.getValue(), phoneBook)).append("\n");
        }
        String missCall = sb.toString();
        System.out.println(missCall);
    }
}
