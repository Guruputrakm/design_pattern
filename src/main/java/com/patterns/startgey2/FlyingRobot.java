package com.patterns.startgey2;

public class FlyingRobot extends Robot implements FlyingRobots{

    private Walkable walkable;
    private Talkable talkable;
    private Flyable flyable;

    public FlyingRobot(Projectable projectable, Walkable walkable, Talkable talkable, Flyable flyable) {
        super(projectable);
        this.walkable = walkable;
        this.talkable = talkable;
        this.flyable = flyable;
    }

    public void fly(){
        String s = walkable.walk() + talkable.talk();
        System.out.println(s);
        flyable.fly();
        project();
    }

}
