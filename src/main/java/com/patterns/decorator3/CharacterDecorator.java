package com.patterns.decorator3;

public abstract class CharacterDecorator implements ICharacter{

    ICharacter iCharacter;

    public CharacterDecorator(ICharacter iCharacter) {
        this.iCharacter = iCharacter;
    }

}
