package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pichu{
    public Pikachu(String name, int level){
        super(name, level);
        setStats(35, 55, 40, 50, 50, 90);
        Agility agility = new Agility(0, 100);

        addMove(agility);
    }
}
