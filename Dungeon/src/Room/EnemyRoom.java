package Room;

import GameObjects.Enemy;
import Interfaces.Room; //se debe importar para poder implementarla
import Player.Player;

public class EnemyRoom implements Room {
    //se declaran atributos específicos de una sala con enemigo
    //esta sala interactúa a su vez, con la clase Enemy, que es un objeto
    private String description;
    private Enemy enemy; //Hace referencia a objetos de clase Enemy y serán nombrados enemy

    //constructor
    //Toda enemy Room debe ser contruida en el main con una descripción
    //y con un enemy (que también se crea en el main)
    public EnemyRoom (String description, Enemy enemy) {
        this.description = description;  //this hace referencia a la descripción de la sala en particular
        this.enemy = enemy; //hace referencia al enemigo de la sala en particular
    }

    @Override //sobreescribe enter en interfaz Room
    //dicta el comportamiento específico cuando entra a una sala con enemigo
    public void enter(Player player) {
        System.out.println(description); //imprime la descripción creada en el main
        System.out.println("Comienza la batalla contra " + enemy.getName() + "!"); //anuncia que empieza batalla con el enemigo asociado a esta sala
        player.takeDamage(enemy.getAtk());

        //la clase enemy aun no la construyo
        //los Enemy tendrán nombre, HP y ATK

    }
}
