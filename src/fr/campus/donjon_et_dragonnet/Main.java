import fr.campus.donjon_et_dragonnet.Game.Menu;
import fr.campus.donjon_et_dragonnet.Game.Game;
import fr.campus.donjon_et_dragonnet.Entity.Character;

void main() {
    // 1. On récupère notre menu
    Menu menu = Menu.getInstance();

    // 2. On lance la création ET ON ATTRAPE LE RÉSULTAT dans une variable
    Character player1 = menu.characterCreation();

    // 3. On crée la partie en lui donnant le héros qu'on vient de fabriquer
    Game game = new Game(player1);

    // 4. On lance la boucle de dés !
    game.play();
}