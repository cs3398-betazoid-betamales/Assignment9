package carcraft;

import carcraft.*;

public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting:  Creating Cars without Decorator Pattern\n");
		ICar basicCar = new BasicCar();
		System.out.println(basicCar.GetDescription());

		System.out.println("Make a Supercharged Basic Car:");
        ICar SuperCharger = new SuperCharger(basicCar);
		System.out.println(SuperCharger.GetDescription());

		System.out.println("Make a Basic Car with an Air Scoop:");
		ICar carWithAirScoop = new AirScoop(basicCar);
		System.out.println(carWithAirScoop.GetDescription());

		System.out.println("MORE OPTIONS!:");
		ICar carWithMoreOptions = new AirScoop(new SuperCharger(new BasicCar()));
		System.out.println(carWithMoreOptions.GetDescription());

		System.out.println("Super charged blue car with air scoop.");
		ICar prettyMuscleCar = new PaintColor(new SuperCharger(new AirScoop(new BasicCar())), "Blue");
		System.out.println(prettyMuscleCar.GetDescription());

		System.out.println("Red car with sports wheels:");
		ICar redCarWithSportWheels = new SportWheels(new PaintColor(new BasicCar(), "Red"));
		System.out.println(redCarWithSportWheels.GetDescription());


	}

}
