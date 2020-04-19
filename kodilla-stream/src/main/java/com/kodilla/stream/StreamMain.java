package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Bellow you will find beautified text:");
        System.out.println("Unchanged text format");

        poemBeautifier.beautify("Some beautified text", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Another text", text -> "// " + text + " //");
        poemBeautifier.beautify("Different text", text -> "** " + text.toUpperCase() + " **");
        poemBeautifier.beautify("Last changed text", text -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i%2==0){
                    builder.append(text.substring(i, i + 1).toUpperCase());
                } else {
                    builder.append(text.substring(i, i + 1).toLowerCase());
                }
            }
            return builder.toString();
        });

    }
}
