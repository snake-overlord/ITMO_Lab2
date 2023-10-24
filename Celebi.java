package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Celebi extends Pokemon {
    public Celebi(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC, Type.GRASS);
        setStats(100,100,100,100,100,100);

        ThunderWave thunderWave = new ThunderWave(0, 90);
        Confide confide = new Confide(0, 100);
        LeafStorm leafStorm = new LeafStorm(130, 90);
        DreamEater dreamEater = new DreamEater(100, 100);

        setMove(thunderWave, confide, leafStorm, dreamEater);
    }
}
