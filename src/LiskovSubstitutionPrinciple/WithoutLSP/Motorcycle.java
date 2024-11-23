package LiskovSubstitutionPrinciple.WithoutLSP;

public class Motorcycle implements Bike {
    private boolean isEngineOn;
    private int speed;

    public Motorcycle(boolean isEngineOn, int speed) {
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
