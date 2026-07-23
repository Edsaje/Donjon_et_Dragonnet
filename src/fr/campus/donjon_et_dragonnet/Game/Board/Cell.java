package fr.campus.donjon_et_dragonnet.Game.Board;


public class Cell {
    //attributs
    private String name;
    private Object content;

    //constructeur case vide
    public Cell(){
        this.name = "Rien à signaler ! Tu peux continuer d'avancer";
        this.content = null;
    }

    //constructeur case avec contenu
    public Cell(String name, Object content){
        this.name = name;
        this.content = content;
    }

    //méthodes
    public boolean isEmpty() {
        return this.content == null;
    }

    //Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}