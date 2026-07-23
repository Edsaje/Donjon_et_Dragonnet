package fr.campus.donjon_et_dragonnet.Game.Board;

import java.util.ArrayList;
import java.util.Random;

import fr.campus.donjon_et_dragonnet.entity.enemy.Dragon;
import fr.campus.donjon_et_dragonnet.entity.enemy.Goblin;
import fr.campus.donjon_et_dragonnet.entity.enemy.Sorcerer;
import fr.campus.donjon_et_dragonnet.equipment.item.Potion;


public class Board {
    //Attributs
    private ArrayList<Cell> cells = new ArrayList<>();
    private int maxGoblin = 10;
    private int maxSorcerer = 10;

    //constructor
    public Board(){

        Random random = new Random();
        for (int i = 0; i < 63; i++) {
            int roll = random.nextInt(100);


            if (roll < 30 && maxGoblin > 0) {
                cells.add(new Cell("Un pauvre Gobelin viens de croiser ta route, BASTON !", new Goblin()));
                maxGoblin -= 1;
                System.out.println(maxGoblin + " Gobelin restants");
            }
            else if (roll < 50 && maxSorcerer > 0) {
                cells.add(new Cell("Un vilain Sorcier commence une incantation, BASTON !", new Sorcerer()));
                maxSorcerer -= 1;
                System.out.println(maxSorcerer + " Sorciers restants");
            }
            else if (roll < 55) {
                cells.add(new Cell("Une potion de soin se trouve par terre, ça peut toujours être utile", new Potion()));
            }
            else {
                cells.add(new Cell());
            }
        }
        cells.add(new Cell("Un terrifiant Dragon se dresse devant toi, c'est le dernier rempart... BASTON", new Dragon()));
    }

    //methodes


    public Cell getCell(int index) {
        return cells.get(index - 1);
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }
}
