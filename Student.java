package prototype.registry;

public class Student {

	String name;
	String addres;
	int contact;
	
	public Student(Student s) {
		this.name = s.name;
		this.addres = s.addres;
		this.contact = s.contact;
	
	}
	
	public Student() {	
	}
	
	public Student clone()
	{
		return  new Student(this);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addres=" + addres + ", contact=" + contact + "]";
	}
	
	
}
