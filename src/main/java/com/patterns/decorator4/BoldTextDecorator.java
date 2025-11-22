package com.patterns.decorator4;

public class BoldTextDecorator extends TextDecorator{

    public BoldTextDecorator(IText iText) {
        super(iText);
    }

    @Override
    public String text(String str) {
        return iText.text(str) + "Bold";
    }
}
