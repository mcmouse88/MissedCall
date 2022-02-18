package com.company;

import java.util.Objects;

public class Contact {

    private final String name;
    private Group group;

    public Contact(String name, Group group) {
        this.name = name;
        this.group = group;
        group.addContactList(Contact.this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Contact.class)) return false;

        Contact altContact = (Contact) obj;
        return name.equals(altContact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
