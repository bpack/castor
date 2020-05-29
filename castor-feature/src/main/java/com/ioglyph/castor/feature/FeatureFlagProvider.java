package com.ioglyph.castor.feature;

public interface FeatureFlagProvider {
    public static final int TEST_PRIORITY = 0;
    public static final int MAX_PRIORITY = 1;
    public static final int MEDIUM_PRIORITY = 2;
    public static final int MIN_PRIORITY = 3;

    int getPriority();
    boolean hasFeature(Feature feature);
    boolean isFeatureEnabled(Feature feature);
}
