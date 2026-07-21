package fr.campus.donjon_et_dragonnet.Item;

public class OffensiveEquipment {
    private String type;
    private String name;
    private int attackLevel;

    public OffensiveEquipment(String type, String name, int attackLevel) {
        this.type = type;
        this.name = name;
        this.attackLevel = attackLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", attackLevel=" + attackLevel +
                '}';
    }
}
