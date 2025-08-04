package Room;

import GameObjects.Treasure;
import Interfaces.GameObject; //Primer uso de GameObject (importacipón)
import Interfaces.Room;
import Player.Player;

public class TreasureRoom implements Room {
    //atributos
    private String description;
    private GameObject treasure; //segundo uso de GameObject (declaración)

    //constructor
    public TreasureRoom(String description, GameObject treasure)  {
        //tercer uso de GameObject, no sé qué hace, sé que es el constructor, llamando a Treasure que implementa a GameObject, entonces lo usa indirectamente??
        this.description = description;
        this.treasure = treasure;
    }

    //sobreescribimos método enter

    @Override
    public void enter(Player player) {
        System.out.println(description);
        treasure.use(player); //llama al uso del objeto definido en treasure

        //aun no construyo la clase Treasure
        //debe incluir una descripción
    }
}
