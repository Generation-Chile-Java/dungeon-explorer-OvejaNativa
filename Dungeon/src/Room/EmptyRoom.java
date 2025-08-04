package Room;

import Interfaces.Room;
import Player.Player;

public class EmptyRoom implements Room {
    //se definen atributos
    private String description;

    //este es el constructor, toda sala vacía debe tener una descripción
    //los objetos se crean en el main, la descripción se genera cuando se crea una empty room
    public EmptyRoom(String description){
        this.description = description;
    }
    //se define el método enter, que indica como actuar en caso de que player entre a cada sala
    //Se llama en la interfaz, cada tipo de Room tiene su propio enter
    //que se sobreescribe en función a lo que dicte el tipo de sala (polimorfimo)
    public void enter(Player player){
        System.out.println(description); //esto dará la descipción generalm que se dio al crear la sala
        System.out.println("Sala vacía, puedes continuar");
    }
}
