package carcraft;

public class SportWheels extends CarOptions {

    public String sportWheels;

    public SportWheels(ICar car) {
        super(car);
        System.out.println("Sport Wheels constructor");
        sportWheels = "Sport Wheels";
    }

    @Override
    public String GetDescription() {
        return super.GetDescription() + "Adding " + sportWheels + "\n";
    }
}