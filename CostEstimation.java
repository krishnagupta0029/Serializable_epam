public class CostEstimation
{
	public double houseConstructionCost(String materialStandard, double areaOfHouse, boolean fullyAutomated)
	{
		double cost;
		if(materialStandard.equals("standard")){
			cost = 1200 * areaOfHouse;
		}	
		else if(materialStandard.equals("abovestandard")){
			cost = 1500 * areaOfHouse;
		}
		else
		{
			if(fullyAutomated && materialStandard.equals("highstandard")){
				cost = 2500 * areaOfHouse;
			}
			else
				cost = 1800 * areaOfHouse;
		}
		return cost;
	}
}