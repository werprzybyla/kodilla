package com.kodilla.rps;

import java.util.Random;

public class ComputerMove {
    Random computerMoveGenerator = new Random();

    public String findComputerMove() {
        int result = computerMoveGenerator.nextInt(3);
        String computerMove = "";

        if (result == 0) computerMove = "rock";
        else if (result == 1) computerMove = "paper";
        else if (result == 2) computerMove = "scissors";

        return computerMove;
    }
}
