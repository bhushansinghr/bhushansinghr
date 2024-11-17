package prototype.registry;

public class IntelligentStudent extends Student {
	
	private int iq;

	public IntelligentStudent(IntelligentStudent is) {
		super(is);
		
		this.iq= is.iq;
	}
	
	
	public IntelligentStudent() {

	}


	public void setIq(int iq) {
		this.iq = iq;
	}


	public int getIq() {
		return iq;
	}


public IntelligentStudent clone()
  {
	return new IntelligentStudent(this);
	  
  }


@Override
public String toString() {
	
	return "IntelligentStudent [iq=" + iq + "]" +super.toString();
}


}
