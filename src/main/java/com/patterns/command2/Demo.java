package com.patterns.command2;



public class Demo {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.press(Type.CHANNAL);
        remote.press(Type.INCREASE_VOL);

        remote.press(Type.INCREASE_VOL);
        remote.press(Type.INCREASE_VOL);
        remote.press(Type.INCREASE_VOL);
        remote.press(Type.REDUCE_VOL);

    }
}
