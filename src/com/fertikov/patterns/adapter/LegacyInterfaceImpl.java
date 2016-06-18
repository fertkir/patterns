package com.fertikov.patterns.adapter;

import java.util.Date;

public class LegacyInterfaceImpl implements LegacyInterface {
    @Override
    public Date getSomeDate() {
        return new Date();
    }
}
