
package carcraft;

public class PaintedCarWithSuperCharger extends CarWithSuperCharger
{
        public String Color;


        public PaintedCarWithSuperCharger(String color)
        {
            System.out.println(" PaintedCarWithSuperCharger Constructor\n");

            Color = color;
        }

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + Color + " color";
        }
}