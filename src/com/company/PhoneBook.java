package com.company;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static Map<String, Contact> allContactInGroup = new HashMap<>();

    public void fillPhoneBook() {
        Group family = new Group("Семья");
        Group work = new Group("Работа");
        Group friends = new Group("Друзья");

        allContactInGroup.put("8 (911) 477-26-31", new Contact("Gabe Logan Newell", friends));
        allContactInGroup.put("8 (921) 009-14-28", new Contact("John D. Carmack II", friends));
        allContactInGroup.put("8 (909) 787-83-12", new Contact("Sid Meier", friends));
        allContactInGroup.put("8 (963) 236-11-65", new Contact("Christopher Vincent Metzen", friends));
        allContactInGroup.put("8 (962) 233-38-09", new Contact("Peter Douglas Molyneux", work));
        allContactInGroup.put("8 (981) 716-96-93", new Contact("Todd Andrew Howard", work));
        allContactInGroup.put("8 (996) 556-74-13", new Contact("Drew Karpyshyn", work));
        allContactInGroup.put("8 (999) 614-44-77", new Contact("Markus Alexej Persson", work));
        allContactInGroup.put("8 (926) 585-17-81", new Contact("Hideo Kojima", family));
        allContactInGroup.put("8 (999) 999-99-99", new Contact("Bill Gates", family));
        allContactInGroup.put("8 (955) 555-55-55", new Contact("Steven Paul Jobs", family));
        allContactInGroup.put("8 (933) 333-33-33", new Contact("Lawrence Edward Page", family));
    }

    public static Map<String, Contact> getAllContactInGroup() {
        return allContactInGroup;
    }
}
