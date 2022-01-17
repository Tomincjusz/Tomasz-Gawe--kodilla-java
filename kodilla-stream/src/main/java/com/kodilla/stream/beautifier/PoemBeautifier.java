package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String myName, PoemDecorator poemDecorator) {
        String beautifiedmyName = poemDecorator.decorate(myName);
        System.out.println(beautifiedmyName);
    }
}