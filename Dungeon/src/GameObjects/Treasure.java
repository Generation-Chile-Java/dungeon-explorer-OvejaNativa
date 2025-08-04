package GameObjects;

import Interfaces.GameObject;
import Player.Player;

public class Treasure implements GameObject {

    //Se declaran atributos
    private String name;
    private String description;
    private int value; //podríamos sumarle un valor, algo que sume puntos o algo así

    //contructor
    public Treasure(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //se sobreescribe el método use
    @Override
    public void use(Player player){
        System.out.println("Encontraste un tesoro llamado: " + name + "!");
    }

}
