package moves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applySelfDamage(Pokemon p, double v) {
        //Take Down deals damage, but the user receives 1⁄4 of the damage it inflicted in recoil
    }
    @Override
    protected String describe(){
        return "использует " + getClass().getSimpleName();
    }
}
