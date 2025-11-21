package com.patterns.startgey2;

public abstract class Robot {
   private Projectable projectable;

    public Robot(Projectable projectable) {
        this.projectable = projectable;
    }

    public void project(){
        this.projectable.projection();
    }
}
