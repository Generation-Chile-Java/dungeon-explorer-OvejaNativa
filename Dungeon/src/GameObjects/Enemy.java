package GameObjects;

public class Enemy {
    //declaración de atributos
    private String name;
    private int health;
    private int atk;

    //constructor
    public Enemy (String name, int health, int atk) {
        this.name = name;
        this.health = health;
        this.atk = atk;
    }

    //Dar acceso a datos privados
    public String getName(){
        return name;
    }
    public int getHealth() {
        return health;

    }
    public int getAtk() {
        return atk;

    }
}
