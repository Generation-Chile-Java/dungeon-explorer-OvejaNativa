package GameObjects;
import Interfaces.GameObject;
import Player.Player;
public class Potion implements GameObject {
    //declaración de atributos
    private String name;
    private int healingAmount;

    //Constructor: lo que cada poción debe llevar si o sí
    public Potion(String name, int healingAmount) {
        this.name = name;
        this.healingAmount = healingAmount;
    }
    //definimos lo que pasa cuando se hace Use
    //en este caso, se usará el objeto en cuanto entre a la Room

    @Override
    public void use(Player player) {
        System.out.println("Encontraste una" + name + "!");
        player.heal(healingAmount); //se llama al método heal, deinifdo en clase player y se le dice que tome el valor de healAmount
    }
}
