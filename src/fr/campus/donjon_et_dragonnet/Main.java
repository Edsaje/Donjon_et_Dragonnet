package fr.campus.donjon_et_dragonnet;

import fr.campus.donjon_et_dragonnet.Game.Game;

class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.startGame();
    }
}


//================== TEST SQL ===================


/*import fr.campus.donjon_et_dragonnet.Database.CharacterDAO;
import fr.campus.donjon_et_dragonnet.Entity.Warrior;

public class Main {
    public static void main(String[] args) {
        // 1. Créer un personnage de test
        Warrior testHero = new Warrior("Conan");

        // 2. Utiliser notre DAO pour le sauvegarder dans la BDD
        CharacterDAO dao = new CharacterDAO();
        dao.saveCharacter(testHero);
    }
}*/
