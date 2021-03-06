package com.agam.truecaller.model.impl;

import com.agam.truecaller.model.inf.IContactStorage;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@ToString
public class ContactStorage implements IContactStorage {

    private List<Contact> contacts = new ArrayList<Contact>();


    public Contact add(Contact contact) {
        this.contacts.add(contact);
        return contact;
    }

    public List<Contact> getAll() {
        return this.contacts;
    }

    public int size() {
        return this.contacts.size();
    }
}
