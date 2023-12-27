package designPattern.prototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> map = new HashMap<>();

    //Method to add the prototype
    public void register(String key, Student student){
        map.put(key, student);
    }

    //method to retrieve the registry from prototype name
    public Student get(String key){
        return map.get(key);
    }
}
