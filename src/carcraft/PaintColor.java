package carcraft;

public class PaintColorDecorator extends CarOptions {
	protected Color color;

	public PaintColorDecorator (ICar decoratedCar, Color color){
		super(decoratedCar);
		this.color = color;
	}

	@Override
	public String GetDescription(){
		return "Paint color: " + this.color;
	}
}
