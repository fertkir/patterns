package com.fertikov.patterns.behavioral.visitor;

public class RoomVisitor {
    public void visit(DiningRoom diningRoom) {
        diningRoom.openTheDoor();
        diningRoom.haveDinner();
    }

    public void visit(LivingRoom livingRoom) {
        livingRoom.openTheDoor();
        livingRoom.watchTV();
    }
}
