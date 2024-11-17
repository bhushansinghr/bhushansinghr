package prototype.registry;

public class AppClient {
	
	static StudentRegistry studentRegister = new StudentRegistry();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		s.setAddres("Bangalore");
		s.setContact(1235);
		s.setName("Bhushan");
	
		IntelligentStudent is = new IntelligentStudent();
		
		is.setIq(360);
		
		fillRegistry("inteliStudent", is);

		fillRegistry("student",s);
		
		Student intelligentBhushan  = studentRegister.get("inteliStudent").clone();
		
		intelligentBhushan.setAddres(null);
		intelligentBhushan.setContact(0);
		
		intelligentBhushan.setName("Bhushan Rathour");
		
		System.out.println(intelligentBhushan);
		
	}

	
	
	public static void fillRegistry(String key , Student s)
	{
		studentRegister.register(key, s);
	}
	
	
}
