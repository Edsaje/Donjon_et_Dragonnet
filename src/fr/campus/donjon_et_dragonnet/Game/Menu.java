package fr.campus.donjon_et_dragonnet.Game;

import java.util.Scanner;

public class Menu {
    // 1. Attributs
    // Le Scanner devient un attribut de la classe ! Comme ça on peut l'utiliser partout.
    private Scanner keyboard;

    // 2. Constructeur
    public Menu() {
        // On initialise le scanner quand on crée le menu
        this.keyboard = new Scanner(System.in);
    }

    // 3. La méthode start() (appelée par le Main)
    public void start() {
        int choixMenu = 0;
        System.out.println("🏰 Bienvenue dans Donjons & Dragonnets ! 🏰");

        while (choixMenu != 2) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Créer un personnage");
            System.out.println("2. Quitter le jeu");
            System.out.println("Faites votre choix : ");

            choixMenu = this.keyboard.nextInt();

            if (choixMenu == 1) {
                createCharacter(); // On appelle une méthode pour garder le code lisible
            }
            else if (choixMenu == 2) {
                System.out.println("Au revoir et à bientôt !");
            }
        }
    }

    // 4. La méthode pour créer le personnage (qu'on a appelé juste au-dessus)
    private void createCharacter() {
        System.out.print("Quel est ton nom de héro ? : ");
        String playerName = this.keyboard.next();
        System.out.print("Quel est ta classe ? : ");
        System.out.print("1. Guerrier\n 2. Mage ");
    }
}