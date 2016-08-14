package com.fertikov.examples;

import com.fertikov.patterns.behavioral.visitor.DiningRoom;
import com.fertikov.patterns.behavioral.visitor.LivingRoom;
import com.fertikov.patterns.behavioral.visitor.Room;
import com.fertikov.patterns.behavioral.visitor.RoomVisitor;

import java.util.List;

import static java.util.Arrays.asList;

public class VisitorExample {
    public static void main(String[] args) {
        List<Room> rooms = asList(new DiningRoom(), new LivingRoom());
        rooms.forEach(room -> room.accept(new RoomVisitor()));
    }
}
