package fr.campus.donjon_et_dragonnet.Character;

public class Warrior extends Character {

    // Le constructeur du Guerrier ne demande QUE le nom,
    // car on connait déjà ses stats de base !
    public Warrior(String name) {

        // super() appelle le constructeur de la classe mère (Character)
        // Il attend 3 choses : un nom, des PV, de l'attaque.
        super(name, 10, 5);
    }
}