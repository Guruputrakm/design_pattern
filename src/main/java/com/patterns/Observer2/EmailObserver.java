package com.patterns.Observer2;

public class EmailObserver implements Observer{
    @Override
    public void onEvent(int temp) {
        System.out.println("The Temprature is "+temp);
    }
}
