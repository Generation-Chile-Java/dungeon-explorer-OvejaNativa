import GameObjects.Enemy;
import GameObjects.Potion;
import GameObjects.Treasure;
import Interfaces.Room;
import Player.Player;
import Room.EmptyRoom;
import Room.EnemyRoom;
import Room.TreasureRoom;
import Room.*; //con esto se importaban todas las room xddd

import java.util.*;


public class Main {
    //se declaran atributos, se deben importar las clases a las que se hace referencia
    private Player player;
    private List<Room> dungeon;
    private int currentRoom = 0; //se declara que la habitación actual

    public static void main(String[] args) {
        //se busca que interactuen los objetos, clases e interfaces creadas
  //acá es donde se corre el juego;
        Main game = new Main(); //instancia un Main llamado game
        game.start(); //llama al método start declarado en game (?) o algo así como que le puse de nombre
    }

    public void start() { //se declara método start para dar inicio al juego
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu personaje");//se importa el teclado
        String playerName = teclado.nextLine();
        player = new Player(playerName, 100);

        dungeon = createDungeon(); //se llama al arrayList definido en el main

        //partiré con un while, para decir que mientras existan salas por recorrer, el juego se ejecuta
        //es decir, mientras currentRoom sea menor que el size de la arrayList llamada createDungeon
        //y agregaré la condición de estar viva, porque si está muerta pos ni al caso xddd

        while (currentRoom < dungeon.size() && player.isAlive()) { //se usan las condiciones descritas con anterioridad
            showCurrentRoom(); //se llama al método definodo en Main
            currentRoom++; //se aumenta el número de current room para mostrar el 1

            if (player.getHealth() <= 0) { //no se puede declarar como un !player.isAlive, ya que este while solo corre si el player está vivo, so, nunca llegaría a lanzarse la línea, aunque muera. (si tuve que cambiarlo)
                System.out.println(playerName + " ha muerto en la mazmorra");
                return;
            }
            if (currentRoom < dungeon.size()) {
                System.out.println("presiona una tecla para ir a la siguiente sala");
                teclado.nextLine();
            }
        } //se acaba el while, lo que viene ahora es lo que se hará mientras no se cumplan las condiciones del while
        if (player.isAlive()) { //se llega a esto solo si el numero de salas coincide con el current room y además, quedam puntos de vida
            System.out.println(playerName + " ha ganado el juego con " + player.getHealth() + " puntos de vida");
        } //este if termina acá y solo se utiliza en el caso mencionado
    } //acá termina el método start game (te me le había ido este cierre y me dio dolores de cabeza)

    //métodos principales, a los que se llama directamente en el Main
    //pueden ser privados, ya que solo se usan en esta clase
    //se debe declarar fuera de la otra función, para que no sea una función dentro de una función
    private void showCurrentRoom() { //Función que muestra la sala actual
            System.out.println("\n Sala actual: " + (currentRoom + 1) + " de " + dungeon.size() + " ==="); //al current room se le suma 1, ya que parte en cero
            Room room = dungeon.get(currentRoom);
            room.enter(player); //considerando que se inicia el juego con esto, la primera acción necesaria es que el personaje entre a la sala
    }
    //ahora crearé los objetos, las empty room van solas, las treasure room con un objeto y las enemy room, con enemy
    private List<Room> createDungeon() { //esto no sé muy bien qué es, lo dimos como atributo hace un rato, creo que es algo así como la lista a la que tiene acceso
            List<Room> rooms = new ArrayList<>(); // Asmi mismo, acá se menciona que List<Room> es una ArrayList
            //las ArrayList se crean sin elementos, los agregaré, y al hacerlo, crearé las distintas room, con distintos objetos
            //se agregan siempre en el mis orden, es decir, esta será la lista definitiva de rooms
        //haré 6, dos de cada una
        rooms.add(new EmptyRoom("estás en una sala vacía, no hay mucho que hacer aquí"));
        rooms.add(new TreasureRoom("AL fondo de de la sala se observa algo brillante", new Treasure(" Caliz de los Deseos", "Este es un cáliz, puedes pedir un deseo")));
        rooms.add(new EnemyRoom("Te encuentras en medio de una sala oscura, cerca de ti, sientes un ruido", new Enemy("El Malo", 40,15)));
        rooms.add(new EmptyRoom("Gran sala, se escucha agua cerca, pero no hay nada más"));
        rooms.add(new TreasureRoom("Tropiezas con un cofre", new Potion("Poción de salud", 30)));
        rooms.add(new EnemyRoom("Ves la luz al final del tunel, pero...", new Enemy("El malo más malo", 60, 15)));

        return rooms; //esto tampoco lo entiendo, es como para que retorne una lsta llamada rooms?
    }

    }
