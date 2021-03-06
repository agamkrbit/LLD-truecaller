package com.agam.truecaller.model.impl;

import com.agam.truecaller.exception.StorageFullException;
import com.agam.truecaller.model.inf.IContactStorage;

import java.util.List;

public class User {

    private String name;

    private String email;

    private IContactStorage contactStorage = new ContactStorage();

    private Subscription subscription;


    public User(String name, String email) {
        this.name = name;
        this.email = email;

        this.subscription = SubscriptionFactory.create(SubscriptionType.FREE);
    }

    public User(String name, String email, SubscriptionType type) {
        this(name, email);

        this.subscription = SubscriptionFactory.create(type);
    }

    public void addContact(Contact contact) throws StorageFullException {
        if (this.subscription.getFeatureLimt(FeatureType.CALL_STORAGE) > this.contactStorage.size()) {
            this.contactStorage.add(contact);
        } else {
            throw new StorageFullException();
        }
    }

    public List<Contact> getAllContacts() {
        return this.contactStorage.getAll();
    }

}
