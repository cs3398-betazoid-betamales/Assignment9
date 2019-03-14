package carcraft;

public class PaintColor extends CarOptions {
	public String color;

	public PaintColor (ICar car, String color){
		super(car);
		System.out.println("Paint Color constructor");
		this.color = color;
	}

	@Override
	public String GetDescription(){
		return super.GetDescription() + "Paint color: " + color + "\n";
	}
}
