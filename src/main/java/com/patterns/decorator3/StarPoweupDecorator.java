package com.patterns.decorator3;

public class StarPoweupDecorator extends CharacterDecorator{
    public StarPoweupDecorator(ICharacter iCharacter) {
        super(iCharacter);
    }

    @Override
    public String getAbilities() {
        return iCharacter.getAbilities() + " Startpowerup";
    }
}
