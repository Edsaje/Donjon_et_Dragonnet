package fr.campus.donjon_et_dragonnet.Game;
import java.util.Random;

public class Dice {
    //Attribut
    private final Random RANDOM;

    //constructeur
    public Dice(){
        RANDOM = new Random();
    }

    //méthode
    public int roll() {
       int dice = RANDOM.nextInt(6) + 1;
       return dice;
    }


}
