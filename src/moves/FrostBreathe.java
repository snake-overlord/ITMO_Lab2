package moves;

import ru.ifmo.se.pokemon.*;

public class FrostBreathe extends SpecialMove{
    public FrostBreathe(double pow, double acc){
        super(Type.ICE, pow, acc);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,
                                     Pokemon def){
        return 1.5;
    }
    @Override
    protected String describe() {
        return "использует " + getClass().getSimpleName();
    }
}
