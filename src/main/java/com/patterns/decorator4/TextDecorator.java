package com.patterns.decorator4;

public abstract class TextDecorator implements IText {
    IText iText;

    public TextDecorator(IText iText) {
        this.iText = iText;
    }
}
