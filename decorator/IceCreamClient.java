package decorator;
import  static decorator.IceCreamHelper.addChocolateSyrup;

import  static decorator.IceCreamHelper.addVanillaScoop;

import  static decorator.IceCreamHelper.addIceCreamGlass;

public class IceCreamClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IceCream iceCream = 
				addChocolateSyrup(
						addVanillaScoop(
								addIceCreamGlass()
								)
						);
		
		
		System.out.println(" Order IceCream "+ iceCream.description());
		
		System.out.println(" Order IceCream "+ iceCream.getCost());

	}

}
