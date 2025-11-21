package com.patterns.factory1;
 enum TYPE {
     BASIC,
     PREMIUM
 }

public class BurgerFactory {
     Burger burger;

    public BurgerFactory(Burger burger) {
        this.burger = burger;
    }

    Burger createBurger(TYPE type) {
        switch (type){
            case BASIC -> {
                burger = new BasicBurger();
                break;
            }
            case PREMIUM -> {
                burger = new PremiumBurger();
                break;
            }
            default -> burger = null;
        }
        return burger;
    }

}
