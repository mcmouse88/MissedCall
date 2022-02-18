package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {

    private final String name;
    private List<Contact> contactList = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addContactList(Contact contact) {
        contactList.add(contact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Contact contact : contactList) {
            sb.append(contact).append("\n");
        }
        return String.format("Контакты группы: %s%n%s", name, sb);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Group.class)) return false;

        Group altGroup = (Group) obj;
        return name.equals(altGroup.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
