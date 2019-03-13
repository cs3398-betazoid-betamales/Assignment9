package carcraft;

public abstract class CarOptions implements ICar {
	protected ICar decoratedCar;

	public CarOptions(ICar decoratedCar) {
		super();
		this.decoratedCar = decoratedCar;
	}
}
