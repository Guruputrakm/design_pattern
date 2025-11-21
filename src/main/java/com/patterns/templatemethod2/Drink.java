package com.patterns.templatemethod2;

public abstract class Drink {

    public final void make(){
        boilWatter();
        addIngredient();
        pour();
    }

    private void pour() {
        System.out.println("Pour to cup");
    }

    protected abstract void addIngredient();

    private void boilWatter() {
        System.out.println("Watter is boiling");
    }
}

