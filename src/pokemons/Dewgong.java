package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;
public class Dewgong extends Seel{
    public Dewgong(String name, int level){
        super(name, level);
        setStats(90,70,80,70,95,70);

        FrostBreathe frostBreathe = new FrostBreathe(60, 90);

        addMove(frostBreathe);
    }
}
