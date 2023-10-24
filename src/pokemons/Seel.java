package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Seel extends Pokemon {
    public Seel(String name, int level){
        super(name, level);
        super.addType(Type.WATER);
        super.setStats(65,45,55,45,70,45);

        TakeDown takeDown = new TakeDown(90, 85);
        AquaRing aquaRing = new AquaRing(0,100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 100);

        setMove(takeDown, aquaRing, doubleTeam);
    }
}
