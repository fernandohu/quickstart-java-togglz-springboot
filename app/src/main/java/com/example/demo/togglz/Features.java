package com.example.demo.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum Features implements Feature {

    @Label("Greeting Old")
    GREETING_OLD,

    @Label("Greeting New")
    GREETING_NEW;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
