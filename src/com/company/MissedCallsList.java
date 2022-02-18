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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy г. hh:mm:ss");
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            sb.append(entry.getKey().format(formatter)).append(" -> ").append(findContact(entry.getValue()) == null ? entry.getValue() : findContact(entry.getValue())).append("\n");
        }
        return sb.toString();
    }

    public Contact findContact(String number) {
        return PhoneBook.getAllContactInGroup().get(number);
    }
}
