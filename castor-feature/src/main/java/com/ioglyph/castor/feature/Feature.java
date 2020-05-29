package com.ioglyph.castor.feature;

/**
 * A feature identifies segments of application code that might be enabled or
 * disabled based on settings defined at run time. Features have only two
 * states - on/off.
 */
public interface Feature {
    String getKey();
    String getName();
    String getDescription();
    boolean getDefault();
}
