package com.kodilla.rps;


public class Game {
    PlayerMove playerMove = new PlayerMove();
    ComputerMove computerMove = new ComputerMove();

    public void introduction() {
        System.out.println("Welcome in Rock-Paper-Scissors Game! Enter your name:");
        playerMove.scanPlayerName();
    }

    public void winsAndInstructions() {
        System.out.println("To how many wins do you want to play?");
        playerMove.scanNumberOfWins();

        System.out.println("Instructions:\n" +
                "1 - rock\n" +
                "2 - paper\n" +
                "3 - scissors\n" +
                "n - new game\n" +
                "x - exit\n");
    }

    public void singleGame() {

        int numberOfWins = playerMove.getNumberOfWins();
        int playerPoints = 0;
        int computerPoints = 0;

        while (playerPoints < numberOfWins && computerPoints < numberOfWins) {
            System.out.println("Chose your move");
            playerMove.scanPlayerChoice();
            String player = playerMove.getPlayerChoice();
            String playerName = playerMove.getPlayerName();
            String computer = computerMove.findComputerMove();

            if (player.equals(computer)) {
                System.out.println("Your move: " + player + "\n" +
                        "Computer move: " + computer + "\n" +
                        "Draw!\n" +
                        playerName + ": " + playerPoints + ", computer: " + computerPoints + "\n");
            } else if ((player.equals("rock") && computer.equals("scissors"))
                    || (player.equals("scissors") && computer.equals("paper"))
                    || (player.equals("paper") && computer.equals("rock"))) {
                playerPoints++;
                System.out.println("Your move: " + player + "\n" +
                        "Computer move: " + computer + "\n" +
                        "Point for " + playerName + "!\n" +
                        playerName + ": " + playerPoints + ", computer: " + computerPoints + "\n");
            } else if ((player.equals("rock") && computer.equals("paper"))
                    || (player.equals("scissors") && computer.equals("rock"))
                    || (player.equals("paper") && computer.equals("scissors"))) {
                computerPoints++;
                System.out.println("Your move: " + player + "\n" +
                        "Computer move: " + computer + "\n" +
                        "Point for computer!\n" +
                        playerName + ": " + playerPoints + ", computer: " + computerPoints + "\n");

            } else if (player.equals("new game")) {
                System.out.println("Are you sure you want to start a new game?\n" +
                        "y - yes\n" +
                        "n - no");
                playerMove.scanYesOrNo();
                String yesOrNo = playerMove.getYesOrNo();

                if (yesOrNo.equals("y")) {
                    computerPoints = 0;
                    playerPoints = 0;
                }
                else if (yesOrNo.equals("n")) System.out.println("Continue then");

            } else if (player.equals("exit"))  {
                System.out.println("Are you sure you want to quit?\n" +
                        "y - yes\n" +
                        "n - no");
                playerMove.scanYesOrNo();
                String yesOrNo = playerMove.getYesOrNo();

                if (yesOrNo.equals("n")) System.out.println("Continue then");
                else System.exit(0);
            }
        }
        if (playerPoints == numberOfWins) System.out.println("You won! Congratulations!\n");
        else if (computerPoints == numberOfWins) System.out.println("Computer won!\n");
    }

    public void nextGame() {
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Choose:\n" +
                    "n - new game\n" +
                    "x - exit");
            playerMove.scanNewGameOrExit();
            String newGameOrExit = playerMove.getNewGameOrExit();

            if (newGameOrExit.equals("n")) {
                System.out.println("Are you sure you want to start a new game?\n" +
                        "y - yes\n" +
                        "n - no");
                playerMove.scanYesOrNo();
                String yesOrNo = playerMove.getYesOrNo();

                if (yesOrNo.equals("y")) continueLoop = false;
                else if (yesOrNo.equals("n")) continueLoop = true;

            } else if (newGameOrExit.equals("x")) {
                System.out.println("Are you sure you want to quit?\n" +
                        "y - yes\n" +
                        "n - no");
                playerMove.scanYesOrNo();
                String yesOrNo = playerMove.getYesOrNo();

                if (yesOrNo.equals("n")) continueLoop = true;
                else System.exit(0);
            }
        }
    }
}
