package example;

class Restaurant
{
	IHotDrink hotDrink;

	// Constructor 
	Restaurant(IHotDrink hotDrink)
	{
		this.hotDrink = hotDrink ;
	}
	/*Setter method also be used
	 * public void setHotDrink(IHotDrink hotDrink) { hotDrink = this.hotDrink; }
	 */
	public void prepareHotDrink()
	{
		
		hotDrink.prepareTea();
	}
}

// Tea is prepared 
interface IHotDrink 
{
	public void prepareTea();
}

class Tea implements IHotDrink 
{
	public void prepareTea() 
	{
		// Code to Prepare Tea
		System.out.println("Tea Prepared");
	}
}

class GreenTea implements IHotDrink 
{
	public void prepareTea() 
	{
		// Code to Prepare Tea
		System.out.println("Green Tea Prepared");
	}
}


public class DependencyInjuctionExample {

	public static void main(String[] args) 
	{
		//Pass tea object to Restaurant 
		Restaurant r =  new Restaurant(new GreenTea());
		r.prepareHotDrink();
	}

}
