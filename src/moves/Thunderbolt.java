package moves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).condition(Status.PARALYZE);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        super.describe();
        return "использует " + getClass().getSimpleName();
    }
}
