package Player;


import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    //nombrar a jugador
    Scanner input = new Scanner(System.in);
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = 100;
    }

    //acceso a datos privados desde otras clases
    public String getName() { //permite acceder al private String name desde otras clases sin modificar
        return name;
    }

    public int getHealth() {
        return health;
    }
    //Métodos de Player son curarse (suma vida),
    // recibir daño (resta vida)

    public void heal(int amount) { //método para curarse
        this.health += amount;
        System.out.println(name + " ha sumado" + amount + " puntos de vida");
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.println(name + " ha perdido " + amount + " puntos de vida");
    }

    //boolean si está vivo. El juego se ejecuta solo si el personaje está vivo
    //si la vida es igual o menor a 0, el juego termina
    //si no quedan salas por recorrer y aún queda vida, el juego termina
    public boolean isAlive (){ //retorna true si se cumple la condición return (vida mayor que cero)
        return this.health > 0;
    }
}
