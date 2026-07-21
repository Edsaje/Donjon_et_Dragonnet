package fr.campus.donjon_et_dragonnet.Game;

import java.util.ArrayList;

public class Game {
    //Atributs
    private int playerPosition;
    private final Dice DICE = new Dice();

    //méthodes
    public void playTurn(){
        int diceValue = DICE.roll();

    }
}
