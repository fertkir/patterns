package com.fertikov.patterns.behavioral.visitor;

public class LivingRoom extends Room {
    public void watchTV() {
        System.out.println("Watching TV...");
    }

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
