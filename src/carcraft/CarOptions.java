package carcraft;

public class CarOptions implements ICar {
	protected ICar car;

	public CarOptions(ICar car) {
	    this.car = car;
	}
	
	@Override
	public String GetDescription() {
	   return this.car.GetDescription();
	}
}
