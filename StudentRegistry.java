package prototype.registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	
	private Map<String, Student> registryMap = new HashMap<>();
	
	void register(String key, Student value)
	{
		registryMap.put(key, value);
		
	}
	
	Student get(String key)
	{
		return registryMap.get(key);
		
	}

}
