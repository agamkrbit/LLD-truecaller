package com.agam.truecaller.model.inf;

import com.agam.truecaller.model.impl.Contact;

import java.util.List;

public interface IContactStorage {

    public Contact add(Contact contact);

    public List<Contact> getAll();

    public int size();
}
