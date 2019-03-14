package carcraft;

public class SuperCharger extends CarOptions  {

	public String SuperCharger;


    public SuperCharger(ICar car)
    {
      super(car);
      System.out.print("SuperCharger Constructor\n");
			SuperCharger = "SuperCharger";
    }

    @Override
    public String GetDescription()
  	{
      
      return super.GetDescription() + "Adding " + SuperCharger + "\n";
  	}
}

