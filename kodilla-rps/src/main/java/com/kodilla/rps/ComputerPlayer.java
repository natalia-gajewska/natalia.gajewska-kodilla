package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Game { //klasa komputer
    @Override
    public String getName() { //konstruktor daj imię
        return "I'm your Opponent."; //jestem twoim przeciwnikiem

    }


    public String makeMove() { //konstruktor wykonaj ruch
        Random random = new Random();
        Integer computerMove = random.nextInt(3) + 1;
        return computerMove.toString();

    }
}