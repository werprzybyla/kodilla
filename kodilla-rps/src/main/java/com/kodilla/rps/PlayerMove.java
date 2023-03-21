package com.kodilla.rps;

import java.util.Scanner;

public class PlayerMove {

    private Scanner playerAnswer = new Scanner(System.in);
    private String playerName = "";
    private int numberOfWins;
    private String playerChoice = "";
    private String yesOrNo = "";
    private String newGameOrExit = "";

    public void scanPlayerName() {
        playerName = playerAnswer.nextLine();
    }

    public void scanNumberOfWins() {

        boolean continueLoop = true;

        while(continueLoop) {
            try {
                numberOfWins = Integer.parseInt(playerAnswer.nextLine());
                continueLoop = false;
            } catch (NumberFormatException a) {
                System.out.print("Please enter a number\n");
                continueLoop = true;
            }
        }
    }

    public void scanPlayerChoice() {
        playerChoice = playerAnswer.nextLine();
    }

    public void scanYesOrNo() {
        yesOrNo = playerAnswer.nextLine();
    }

    public void scanNewGameOrExit() {
        newGameOrExit = playerAnswer.nextLine();
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public String getPlayerChoice() {
        if (playerChoice.equals("1")) return "rock";
        else if (playerChoice.equals("2")) return "paper";
        else if (playerChoice.equals("3")) return "scissors";
        else if (playerChoice.equals("n")) return "new game";
        else if (playerChoice.equals("x")) return "exit";

        return playerChoice;
    }

    public String getYesOrNo() {
        return yesOrNo;
    }

    public String getNewGameOrExit() {
        return newGameOrExit;
    }
}
