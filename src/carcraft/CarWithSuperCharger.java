package carcraft;

public class CarWithSuperCharger extends CarOptions  {

	public String SuperCharger;


    public CarWithSuperCharger(ICar car)
    {
      super(car);
      System.out.print(" CarWithSuperCharger Constructor\n");
			SuperCharger = "SuperCharger";
    }

    @Override
    public String GetDescription()
  	{
      
      return super.GetDescription() + "Adding" + SuperCharger + "\n";
  	}
}

