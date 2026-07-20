package fr.campus.donjon_et_dragonnet.Game;

import fr.campus.donjon_et_dragonnet.Character.GameCharacter;
import java.util.Scanner;

public class Menu {
    //Attributs
    private final Scanner scanner = new Scanner(System.in);

    //Constructeur
    public Menu () {
    }

    //Méthode publique
    /*public GameCharacter creationCharacter() {

        System.out.println("Bienvenue dans DONJON ET DRAGONNET");

        GameCharacter.CharacterType type = chooseClass();

        System.out.println("Veuillez choisir un nom :");
        String name = scanner.nextLine();

        GameCharacter player = switch (type) {
            case GUERRIER -> new GameCharacter(
                    GameCharacter.CharacterType.GUERRIER, name, 10, 5, "sword"
            );
            case MAGE -> new GameCharacter(
                    GameCharacter.CharacterType.MAGE, name, 6, 8, "staff"
            );
        };

        return player;
    }*/

    public int askPlayerInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    //Méthode privée


    //toString

    @Override
    public String toString() {
        return "Menu{" +
                "scanner=" + scanner +
                '}';
    }
}

