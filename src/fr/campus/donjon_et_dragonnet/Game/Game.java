package fr.campus.donjon_et_dragonnet.Game;

import fr.campus.donjon_et_dragonnet.Entity.Character;
import fr.campus.donjon_et_dragonnet.Game.Menu;

import java.util.Scanner;

public class Game {
    //Atributs
    Scanner keyboard = new Scanner(System.in);
    private Character player;
    private int currentCell;
    private final int TOTAL_CELL = 64; //final car la taille du plateau ne change jamais
    private final Dice DICE = new Dice();

    public Game(Character player) {
        this.player = player;
        this.currentCell = 1;

    }
    //méthodes
    public void play(){
        while(currentCell<TOTAL_CELL) {
            System.out.println("Appuyez sur Entrée pour lancer le dé...");
            keyboard.nextLine();
            int diceValue = DICE.roll();
            currentCell = diceValue + currentCell;
            if (currentCell > 64){
                currentCell = 64;
            }
            System.out.println("Vous avez fait " + diceValue + " ! Vous avancez donc jusqu'à la case" + currentCell + ".");
        }
        Menu menu = Menu.getInstance();
        menu.victory();

    }
}
