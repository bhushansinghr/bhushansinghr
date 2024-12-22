package decorator;

public class IceCreamHelper {
	
	public static IceCream addVanillaScoop(IceCream iceCream)
	{
		return new VanillaScoop(iceCream);
		
	}
	
	public static IceCream addChocolateSyrup(IceCream iceCream )
	{
		return new ChocolateSyrup(iceCream);
		
	}
	
	public static IceCream addIceCreamGlass()
	{
		return new IceCreamGlass();
		
	}
	
	
	
	

}
