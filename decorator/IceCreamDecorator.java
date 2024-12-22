package decorator;

public abstract class IceCreamDecorator implements IceCream {
	
	protected IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		super();
		this.iceCream = iceCream;
	}
	

}
