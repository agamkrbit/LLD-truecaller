package com.agam.truecaller.model.impl;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
public class Subscription {

    private SubscriptionType type;

    private List<FeatureType> feature = new ArrayList<FeatureType>();
    private Map<FeatureType, Integer> featureLimit = new HashMap<FeatureType, Integer>();

    public Subscription(SubscriptionType type) {
        this.type = type;
    }

    public Subscription addFeature(FeatureType type) {
        this.feature.add(type);
        return this;
    }

    public Subscription addFeatureLimit(FeatureType type, int limit) {
        this.featureLimit.put(type, limit);
        return this;
    }

    public int  getFeatureLimt(FeatureType type) {
        return this.featureLimit.getOrDefault(type, 0);
    }

}
