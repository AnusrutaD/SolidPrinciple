package LiskovSubstitutionPrinciple.WithoutLSP;

public class Bycycle implements Bike{

    private boolean isEngineOn;
    private int speed;

    public Bycycle(boolean isEngineOn, int speed) {
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    // Narrowing down the method
    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
    }

    @Override
    public void accelerate() {
        speed += 2;
    }
}
