package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pichu extends Pokemon {
    public Pichu(String name, int level){
        super(name, level);
        addType(Type.ELECTRIC);
        setStats(20, 40, 15, 35, 35, 60);

        ThunderWave thunderWave = new ThunderWave(0, 90);
        Thunderbolt thunderbolt = new Thunderbolt(90, 100);

        setMove(thunderWave, thunderbolt);

    }
}
