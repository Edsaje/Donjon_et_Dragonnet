package fr.campus.donjon_et_dragonnet.Item;

public class DefensiveEquipment {
    //Attributs
    private String type;
    private int defenseLevel;
    private String name;

    //Constructeur
    public DefensiveEquipment(String type, int defenseLevel, String name) {
        this.type = type;
        this.defenseLevel = defenseLevel;
        this.name = name;
    }

    //Getter
    public String getType() {
        return type;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getName() {
        return name;
    }

    //Setter
    public void setType(String type) {
        this.type = type;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString
    @Override
    public String toString(){
        return "L'objet " + name + " est un(e) " + type + " avec une defense de " + defenseLevel + " points.";
    }
}
