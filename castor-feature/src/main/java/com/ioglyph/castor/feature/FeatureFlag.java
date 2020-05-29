package com.ioglyph.castor.feature;

public enum FeatureFlag implements Feature {
    DISPLAY_STARTUP_PARAMS("feature.startup_params",
            "Display Parameters",
            "Logs all settings at application startup",
            true)
    ;

    private final String key;
    private final String name;
    private final String description;
    private final boolean defaultValue;

    private FeatureFlag(String key, String name, String description, boolean defaultValue){
        this.key = key;
        this.name = name;
        this.description = description;
        this.defaultValue = defaultValue;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean getDefault() {
        return defaultValue;
    }
}
