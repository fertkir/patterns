package com.fertikov.patterns.behavioral.visitor;

public class DiningRoom extends Room {
    public void haveDinner() {
        System.out.println("Having dinner, eating something...");
    }

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
