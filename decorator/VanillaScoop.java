package decorator;

public class VanillaScoop extends IceCreamDecorator {
	
	
	public VanillaScoop(IceCream iceCream) {
		super(iceCream);
		
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return iceCream.description()+" Vanilla Scoop ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return iceCream.getCost() + 50;
	}

}
