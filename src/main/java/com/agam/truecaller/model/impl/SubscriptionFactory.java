package com.agam.truecaller.model.impl;

public class SubscriptionFactory {
    public static Subscription create(SubscriptionType type) {
        Subscription subscription = new Subscription(type);

        if (type == SubscriptionType.FREE) {
            subscription
                    .addFeature(FeatureType.CALL_STORAGE)
                    .addFeatureLimit(FeatureType.CALL_STORAGE, 10);
        } else if (type == SubscriptionType.GOLD) {
            subscription
                    .addFeature(FeatureType.CALL_STORAGE)
                    .addFeatureLimit(FeatureType.CALL_STORAGE, 100);
        }
        return subscription;
    }
}
