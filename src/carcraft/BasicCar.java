
package carcraft;

public class BasicCar implements ICar {

    public BasicCar() {
		System.out.print("BasicCar Constructor\n");
	}

    @Override
    public String GetDescription() {
        return "Building a basic car\n";
    }
}

