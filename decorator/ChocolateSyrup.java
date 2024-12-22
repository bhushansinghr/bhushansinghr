package decorator;

public class ChocolateSyrup extends IceCreamDecorator {

	public ChocolateSyrup(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return iceCream.description()+" Chocolate Scoop ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return iceCream.getCost() + 70;
	}

}
