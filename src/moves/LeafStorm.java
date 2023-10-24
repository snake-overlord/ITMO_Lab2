package moves;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {
    public LeafStorm(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "использует " + getClass().getSimpleName();
    }
}
