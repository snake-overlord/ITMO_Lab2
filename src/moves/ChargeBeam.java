package moves;

import Lab.Main;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect effect = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(effect);
        }
    @Override
    protected String describe(){
        return "использует " + getClass().getSimpleName();
    }
}