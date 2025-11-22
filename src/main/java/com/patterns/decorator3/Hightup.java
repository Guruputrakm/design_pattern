package com.patterns.decorator3;

public class Hightup extends CharacterDecorator{


    public Hightup(ICharacter iCharacter) {
        super(iCharacter);
    }

    @Override
    public String getAbilities() {
        return iCharacter.getAbilities() + " Height Up ";
    }
}
