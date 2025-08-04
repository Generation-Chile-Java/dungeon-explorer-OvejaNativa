package Interfaces;

import Player.Player;

public interface GameObject {
    void use(Player player); // métodos definidos en cada clase que implementa GameObject
    //en este caso, HealthPotion, Treasure, Sword (aunque esta ultima, quizá quede fuera)
    //también quiero que diga la descripción y nombre del item encontrado
    //pero creo que es mejor crear las clases primero.

}
