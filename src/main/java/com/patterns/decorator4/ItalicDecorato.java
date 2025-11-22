package com.patterns.decorator4;

public class ItalicDecorato extends TextDecorator{
    public ItalicDecorato(IText iText) {
        super(iText);
    }

    @Override
    public String text(String str) {
        return iText.text(str) + "Italic";
    }
}
