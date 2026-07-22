package fr.campus.donjon_et_dragonnet.Game;

import fr.campus.donjon_et_dragonnet.Entity.Character;
import fr.campus.donjon_et_dragonnet.Entity.Warrior;
import fr.campus.donjon_et_dragonnet.Entity.Wizard;

import java.util.Scanner;

public class Menu {
    private static final Menu INSTANCE = new Menu();
    Scanner keyboard = new Scanner(System.in);

    private Menu() {}

    public static Menu getInstance() {
        return INSTANCE;
    }

    public void intro() {
        displayMessage("           ======================================");
        displayMessage("           = BIENVENUE DANS DONJON ET DRAGONNET =");
        displayMessage("           ======================================");
        displayMessage("\n              APPUIE SUR ENTREE POUR COMMENCER");
    }

    public String displayMessage(String message) {
        System.out.println(message);
        return message;
    }

    public int askPlayerInt(String message) {
        displayMessage(message);
        System.out.print("> ");
        try {
            return keyboard.nextInt();
        }
        catch (java.util.InputMismatchException e) {
        }
        return 0;
    }

    public String askPlayerName(String message) {
        keyboard.nextLine(); //vider buffer
        System.out.println(message);
        System.out.print("> ");
        return keyboard.nextLine();
    }

}
