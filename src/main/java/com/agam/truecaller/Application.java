package com.agam.truecaller;

import com.agam.truecaller.exception.StorageFullException;
import com.agam.truecaller.model.impl.Contact;
import com.agam.truecaller.model.impl.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Application {

    public static void main(String arg[]) throws StorageFullException {
        Logger logger = LogManager.getLogger(Application.class);

        logger.info("application is starting");

        User user = new User("agam", "agam.kr@gmail.com");

        user.addContact(new Contact("test 1", "test 1"));
        user.addContact(new Contact("test 1", "test 1"));
        user.addContact(new Contact("test 1", "test 1"));
        user.addContact(new Contact("test 1", "test 1"));
        user.addContact(new Contact("test 1", "test 1"));
        user.addContact(new Contact("test 1", "test 1"));
        user.addContact(new Contact("test 1", "test 1"));

        System.out.println(user.getAllContacts());
    }

}
