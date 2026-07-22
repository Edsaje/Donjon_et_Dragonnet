package fr.campus.donjon_et_dragonnet.Game;

import java.util.ArrayList;
import java.util.Random;
import fr.campus.donjon_et_dragonnet.Entity.Dragon;
import fr.campus.donjon_et_dragonnet.Entity.Goblin;
import fr.campus.donjon_et_dragonnet.Entity.Sorcerer;
import fr.campus.donjon_et_dragonnet.Item.Potion;
import fr.campus.donjon_et_dragonnet.Item.Weapon;


public class Board {
    //Attributs
    private ArrayList<Cell> cells = new ArrayList<>();

    //constructor
    public Board(){

        Random random = new Random();
        for (int i = 0; i < 64; i++) {
            int roll = random.nextInt(100);

            if (roll < 60) {
                cells.add(new Cell());
            }

            else if (roll < 80) {
                cells.add(new Cell("Un Gobelin", new Goblin()));
            }
            else if (roll < 98) {
                cells.add(new Cell("Un Sorcier", new Sorcerer()));
            }
            else {
                cells.add(new Cell("Une potion de soin", new Potion()));
            }
        }
    }

    //methodes


    public Cell getCell(int index) {
        return cells.get(index - 1);
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }
}
