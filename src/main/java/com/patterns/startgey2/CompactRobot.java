package com.patterns.startgey2;

public class CompactRobot extends Robot{

    private Walkable walkable;
    private Talkable talkable;

    public CompactRobot(Projectable projectable, Walkable walkable, Talkable talkable) {
        super(projectable);
        this.walkable =walkable;
        this.talkable = talkable;
    }

    @Override
    public void project() {
        String str = walkable.walk() + talkable.talk();
        System.out.println(str);
        super.project();
    }
}
