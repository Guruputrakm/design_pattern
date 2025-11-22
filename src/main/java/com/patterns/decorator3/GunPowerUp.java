package com.patterns.decorator3;

public class GunPowerUp extends CharacterDecorator{
    public GunPowerUp(ICharacter iCharacter) {
        super(iCharacter);
    }

    @Override
    public String getAbilities() {
        return iCharacter.getAbilities() + " GunPower ";
    }
}
