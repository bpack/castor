package com.ioglyph.castor.feature;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class CastorRuntime {

    private static final List<FeatureFlagProvider> providers = new CopyOnWriteArrayList<>();

    public static boolean isFeatureEnabled(Feature feature){
        AtomicBoolean value = new AtomicBoolean(false);
        providers.stream()
                .filter(provider -> provider.hasFeature(feature))
                .min(Comparator.comparingInt(FeatureFlagProvider::getPriority))
                .ifPresentOrElse(
                        provider -> value.set(provider.isFeatureEnabled(feature)),
                        () -> value.set(feature.getDefault()));
        return value.get();
    }

    public static void addProvider(FeatureFlagProvider provider){
        providers.add(provider);
    }
}
