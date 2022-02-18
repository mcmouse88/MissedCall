package com.company;

import java.time.LocalDateTime;
import java.util.Random;

public class Main {

    private final static Random RAND = new Random();

    public static void main(String[] args) throws Exception {
        PhoneBook phoneBook = new PhoneBook();
        MissedCallsList missedCallsList = new MissedCallsList();
        phoneBook.fillPhoneBook();

        missedCallsList.addMissedCall(LocalDateTime.now(), "8 (962) 233-38-09");
        Thread.sleep(10_000 + RAND.nextInt(50_000 - 10_000));
        missedCallsList.addMissedCall(LocalDateTime.now(), "8 (909) 787-83-12");
        Thread.sleep(10_000 + RAND.nextInt(50_000 - 10_000));
        missedCallsList.addMissedCall(LocalDateTime.now(), "8 (911) 477-26-31");
        Thread.sleep(10_000 + RAND.nextInt(50_000 - 10_000));
        missedCallsList.addMissedCall(LocalDateTime.now(), "8 (999) 999-99-99");
        Thread.sleep(10_000 + RAND.nextInt(50_000 - 10_000));
        missedCallsList.addMissedCall(LocalDateTime.now(), "8 (988) 888-88-88");
        System.out.println(missedCallsList);
    }
}
