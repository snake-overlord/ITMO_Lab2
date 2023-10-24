package moves;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {
    public Agility(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect effect = new Effect().stat(Stat.SPEED, 2);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует " + getClass().getSimpleName();
    }
}
