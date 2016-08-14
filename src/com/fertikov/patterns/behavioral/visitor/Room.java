package com.fertikov.patterns.behavioral.visitor;

public abstract class Room {
    public void openTheDoor() {
        System.out.println("Opened the door in " + getClass().getSimpleName());
    }

    public abstract void accept(RoomVisitor visitor);
}
