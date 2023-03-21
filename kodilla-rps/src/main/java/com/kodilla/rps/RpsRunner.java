package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();

        boolean end = false;
        game.introduction();

        while(!end) {
            game.winsAndInstructions();
            game.singleGame();
            game.nextGame();
        }

    }
}