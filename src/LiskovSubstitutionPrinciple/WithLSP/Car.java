package LiskovSubstitutionPrinciple.WithLSP;

public class Car extends EngineVehicle{
    @Override
    public int numberOfWheels(){
        return 4;
    }
}
