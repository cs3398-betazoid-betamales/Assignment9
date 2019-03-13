package carcraft;

public class AirScoop extends CarOptions {

    public String airScoop;

    public AirScoop(ICar car) {
        super(car);
        System.out.println("AirScoop constructor");
        airScoop = "Air Scoop";
    }

    @Override
    public String GetDescription() {
        return super.GetDescription() + "Adding " + airScoop + "\n";
    }
}