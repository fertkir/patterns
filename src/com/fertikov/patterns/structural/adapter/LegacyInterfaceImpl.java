package com.fertikov.patterns.structural.adapter;

import java.util.Date;

public class LegacyInterfaceImpl implements LegacyInterface {
    @Override
    public Date getSomeDate() {
        return new Date();
    }
}
