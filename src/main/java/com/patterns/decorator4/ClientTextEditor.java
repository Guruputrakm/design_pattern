package com.patterns.decorator4;

public class ClientTextEditor {
    public static void main(String[] args) {
        IText iText = new UnderlineDecorator(new BoldTextDecorator(new ItalicDecorato(new BaseText())));
        IText iText1 = new BaseText();
        iText1 = new ItalicDecorato(iText1);
        iText1 = new BoldTextDecorator(iText1);
        iText1 = new UnderlineDecorator(iText1);
        String result = iText.text("Guruputra ");


        System.out.println(result);
        System.out.println( iText1.text("Kiran "));
    }
}
