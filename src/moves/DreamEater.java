package moves;

import Lab.Main;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        //Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained.
    }
    @Override
    protected String describe(){
        return "использует " + getClass().getSimpleName();
    }
}
