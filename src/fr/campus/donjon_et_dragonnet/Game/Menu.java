package fr.campus.donjon_et_dragonnet.Game;

import fr.campus.donjon_et_dragonnet.Entity.Character;
import fr.campus.donjon_et_dragonnet.Entity.Warrior;
import fr.campus.donjon_et_dragonnet.Entity.Wizard;

import java.util.Scanner;

public class Menu {
    private static final Menu INSTANCE = new Menu();
    Scanner keyboard = new Scanner(System.in);

    public static Menu getInstance() {
        return INSTANCE;
    }

    public void intro() {
        System.out.println("           ======================================");
        System.out.println("           = BIENVENUE DANS DONJON ET DRAGONNET =");
        System.out.println("           ======================================");
        System.out.println("\n              APPUIE SUR ENTREE POUR COMMENCER");
        System.out.println("\n(tu peux choisir à tout moment de fuir et quitter avec ESC.)");
    }

    public int askPlayerInt(String message) {
        System.out.println(message);
        System.out.println(">");
        return keyboard.nextInt();
    }

    public String askPlayerName(String message) {
        keyboard.nextLine(); //vider buffer
        System.out.println(message);
        System.out.println(">");
        return keyboard.nextLine();
    }

    public Character characterCreation() {
        intro();
        String playerName = askPlayerName("Dit moi quel est ton nom jeune héro ? : ");
        while (true) {
            int playerInt = askPlayerInt(playerName + " ? Un nom interessant ! Maintenant, choisis ta classe ! : \n 1.Guerrier\n 2.Mage");
            if (playerInt == 1) {
                Character warrior = new Warrior(playerName);
                //System.out.println(warrior.getName());
                return warrior;
            } else if (playerInt == 2) {
                Character wizard = new Wizard(playerName);
                //System.out.println(wizard.getName());
                return wizard;
            } else {
                System.out.println("Tu dois taper 1 pour Guerrier et 2 pour Mage !\n");
            }
        }
    }

    public void victory () {
        System.out.println("Victoire POUR LE PEUPLE !");
        System.out.println("Appuyez sur Entrée pour relancer le jeu");
        keyboard.nextLine(); //vider buffer
        keyboard.nextLine();
        characterCreation();
    }
}
