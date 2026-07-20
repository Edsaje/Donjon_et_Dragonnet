import fr.campus.donjon_et_dragonnet.Game.Menu;

void main() {
    Menu gameMenu = new Menu();
    int choice = gameMenu.askPlayerInt("Veuillez choisir une classe :\n 1. Guerrier\n 2. Mage");
    System.out.println(choice);
}
