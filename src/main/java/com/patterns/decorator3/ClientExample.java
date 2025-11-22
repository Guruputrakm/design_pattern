package com.patterns.decorator3;

public class ClientExample {

    public static void main(String[] args) {
        ICharacter mario = new Hightup(new GunPowerUp(new StarPoweupDecorator(new Mario())));
        System.out.println(mario.getAbilities());

        mario = new GunPowerUp( new Hightup( new StarPoweupDecorator(new Mario())));
        System.out.println(mario.getAbilities());
    }
}
