package fr.campus.donjon_et_dragonnet;

import fr.campus.donjon_et_dragonnet.Game.Game;

class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.startGame();
    }
}