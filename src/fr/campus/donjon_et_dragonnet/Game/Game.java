package fr.campus.donjon_et_dragonnet.Game;

import fr.campus.donjon_et_dragonnet.Entity.Character;
import fr.campus.donjon_et_dragonnet.Entity.Warrior;
import fr.campus.donjon_et_dragonnet.Entity.Wizard;
import fr.campus.donjon_et_dragonnet.Item.Potion;

import java.util.Scanner;

public class Game {

    private static final Game INSTANCE = new Game();
    private Game() {

    }

    public static Game getInstance() {
        return INSTANCE;
    }

    //Atributs
    Scanner keyboard = new Scanner(System.in);
    private Character player;
    private int currentCell;
    private final int TOTAL_CELL = 64; //final car la taille du plateau ne change jamais
    private final Dice DICE = new Dice();
    private Character player1;
    private Menu menu = Menu.getInstance(); //on récupère notre Menu
    private Board board;

    public Game(Character player) {
        this.player = player;
        this.currentCell = 1;

    }

    //méthodes

    public void startGame(){

        //On lance l'intro
        menu.intro();

        //On lance la création ET ON ATTRAPE LE RÉSULTAT dans une variable
        player1 = characterCreation();

        //Petit message d'annonce
        menu.displayMessage("\n" + player1.getName() + " entre dans le donjon. Bonne Chance !");

        //init plateau
        this.board = new Board();

        //On lance la boucle de dés !
        this.play();
    }

    public Character characterCreation() {
        String playerName = menu.askPlayerName("\nDit moi quel est ton nom jeune héro ? : ");
        Character tmp = null;
        int playerInt = menu.askPlayerInt("\n" + playerName + " ? Un nom interessant ! Maintenant, choisis ta classe ! : \n 1.Guerrier\n 2.Mage");

        if (playerInt == 1) {
            tmp = new Warrior(playerName);
            System.out.println("\n" + tmp);
        }

        else if (playerInt == 2) {
            tmp = new Wizard(playerName);
            System.out.println("\n" + tmp);

        }
        else {
            menu.displayMessage("\n Tu dois taper 1 pour Guerrier et 2 pour Mage !\n");
            characterCreation();
        }

        if (menu.askPlayerInt("\nCe personnage te convient ?\n1. Oui\n2. Non") != 1){
            characterCreation();
        }

        return tmp;
    }

    public void play(){
        while(currentCell<TOTAL_CELL) {
            menu.displayMessage("\nAppuyez sur Entrée pour lancer le dé...");
            keyboard.nextLine();
            int diceValue = DICE.roll();
            currentCell = diceValue + currentCell;
            if (currentCell > 64){
                currentCell = 64;
            }
            Cell cell = board.getCell(currentCell);
            menu.displayMessage("Vous avez fait " + diceValue + " ! Vous avancez donc jusqu'à la case " + currentCell + ".");
            if (cell.getContent() instanceof Character) {

            } else if (cell.getContent() instanceof Potion) {

            }

        }
        menu.displayMessage("\nVictoire pour le peuple !");
        endGame();
    }

    public void endGame(){ //avec Thanos et tout
        Menu menu = Menu.getInstance();

        if (menu.askPlayerInt("\nVoulez vous rejouer ? :\n1. Oui\n2. Non") != 1){
            return;
        }
        startGame();
    }
}
