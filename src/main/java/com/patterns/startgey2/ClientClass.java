package com.patterns.startgey2;

public class ClientClass {
    public static void main(String[] args) {
        Robot robot = new CompactRobot(new NormalProjection(), new NormalWalk(), new NormalTaclking());
        robot.project();

        FlyingRobot robot1 = new FlyingRobot(new NormalProjection(), new NoWalk(),new NoTalking(), new JetFlyable());
        robot1.fly();
    }
}
