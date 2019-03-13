
package carcraft;

public class CarWithSuperCharger extends BasicCar  {

	public String SuperCharger;


    public CarWithSuperCharger()
    {
      System.out.print(" CarWithSuperCharger Constructor\n");
			SuperCharger = "SuperCharger";
    }

    @Override
    public String GetDescription()
  	{
        return super.GetDescription() + " with " + SuperCharger;
  	}
}

