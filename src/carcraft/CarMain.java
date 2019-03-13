
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting:  Creating Cars without Decorator Pattern\n");
	
		System.out.println("Make a Supercharged Basic Car:");
		ICar carWithSuperCharger = new CarWithSuperCharger();
		System.out.println("Done. " + carWithSuperCharger.GetDescription());
		
		System.out.println("\nMake a Painted Supercharged Basic Car:");
		ICar paintedCarWithSuperCharger = new PaintedCarWithSuperCharger("Blue");
		
		System.out.println("Done. " + paintedCarWithSuperCharger.GetDescription());
	}

}

