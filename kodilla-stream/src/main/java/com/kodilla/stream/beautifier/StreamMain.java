package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(" " + "ABC", (text) -> text + " " + "BCA");
        poemBeautifier.beautify(" " + "123", (text) -> " " + "321" + text);
        poemBeautifier.beautify(" " + "jeden,dwa,trzy", (text) -> text.toUpperCase()); //duże litery
        poemBeautifier.beautify(" " + "wlazl kotek na plotek", String::toUpperCase); // dużę litery referencje

        poemBeautifier.beautify(" " + "Piosenki" , (text) -> " " + "trzy" + text + " " + "albo dwie");
        poemBeautifier.beautify("oooooo", (text) -> " " + text.toUpperCase() + text.toLowerCase() + text.toUpperCase()); //duże litery, małe litery, duże litery

        System.out.println ("Koniec zadania ;)");
    }
}
