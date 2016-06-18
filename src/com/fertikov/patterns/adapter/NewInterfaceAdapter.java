package com.fertikov.patterns.adapter;

import java.time.LocalDate;
import java.time.ZoneId;

public class NewInterfaceAdapter implements NewInterface {

    private LegacyInterface legacyComponent;

    public NewInterfaceAdapter(LegacyInterface legacyComponent) {
        this.legacyComponent = legacyComponent;
    }

    @Override
    public LocalDate getDate() {
        return legacyComponent.getSomeDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
