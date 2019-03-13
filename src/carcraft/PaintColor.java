package carcraft;

public class PaintColor extends CarOptions {
	public String color;

	public PaintColor (ICar car, String color){
		super(car);
		this.color = color;
	}

	@Override
	public String GetDescription(){
		return super.GetDescription() + "Paint color: " + color + "\n";
	}
}
