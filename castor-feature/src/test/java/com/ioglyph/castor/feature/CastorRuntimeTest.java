package com.ioglyph.castor.feature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CastorRuntimeTest {

    static SimpleFeatureFlagProvider provider = new SimpleFeatureFlagProvider();

    @BeforeAll
    public static void init(){
        CastorRuntime.addProvider(provider);
    }

    @BeforeEach
    public void reset(){
        provider.clearFeatures();
    }

    @Test
    public void testDefaultFeatureIsTrue(){
        Assertions.assertTrue(CastorRuntime.isFeatureEnabled(FeatureFlag.DISPLAY_STARTUP_PARAMS));
    }

    @Test
    public void testFeatureEnabledTrue(){
        provider.setFeatureEnabled(FeatureFlag.DISPLAY_STARTUP_PARAMS, Boolean.TRUE);

        Assertions.assertTrue(CastorRuntime.isFeatureEnabled(FeatureFlag.DISPLAY_STARTUP_PARAMS));
    }

    @Test
    public void testFeatureEnabledFalse(){
        provider.setFeatureEnabled(FeatureFlag.DISPLAY_STARTUP_PARAMS, Boolean.FALSE);

        Assertions.assertFalse(CastorRuntime.isFeatureEnabled(FeatureFlag.DISPLAY_STARTUP_PARAMS));
    }
}
