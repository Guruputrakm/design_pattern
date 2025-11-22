package com.patterns.decorator4;

public class BaseText implements IText{
    @Override
    public String text(String str) {
        return str;
    }
}
