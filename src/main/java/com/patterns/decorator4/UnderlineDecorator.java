package com.patterns.decorator4;

public class UnderlineDecorator extends TextDecorator{

    public UnderlineDecorator(IText iText) {
        super(iText);
    }

    @Override
    public String text(String str) {
        return iText.text(str) + "Underline";
    }
}
