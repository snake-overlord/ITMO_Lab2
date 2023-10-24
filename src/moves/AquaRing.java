package moves;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    public AquaRing(double pow, double acc){
        super(Type.WATER, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        //The user of Aqua Ring surrounds itself with a veil of water, which restores 1⁄16 of its maximum HP at the end of each turn.
    }
    @Override
    protected String describe() {
        return "использует " + getClass().getSimpleName();
    }
}
