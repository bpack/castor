package com.ioglyph.castor.feature;

import java.util.HashMap;
import java.util.Map;

public class SimpleFeatureFlagProvider implements FeatureFlagProvider {
    private Map<Feature, Boolean> features = new HashMap<>();

    @Override
    public int getPriority() {
        return TEST_PRIORITY;
    }

    @Override
    public boolean hasFeature(Feature feature) {
        return features.containsKey(feature);
    }

    @Override
    public boolean isFeatureEnabled(Feature feature) {
        return features.getOrDefault(feature, Boolean.FALSE);
    }

    public void setFeatureEnabled(Feature feature, Boolean enabled){
        features.put(feature, enabled);
    }
    public void clearFeatures(){
        features.clear();
    }
}
