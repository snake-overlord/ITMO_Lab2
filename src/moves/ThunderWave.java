package moves;

import ru.ifmo.se.pokemon.*;
import Lab.Main;

public class ThunderWave extends PhysicalMove{
    public ThunderWave(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.paralyze(p);
        }
    @Override
    protected String describe(){
        return "использует " + getClass().getSimpleName();
    }
}
