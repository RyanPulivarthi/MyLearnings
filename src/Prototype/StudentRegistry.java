package Prototype;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,Student> hashMap=new HashMap<String, Student>();

    public void register(String key, Student st){
        hashMap.put(key,st);
    }
    public Student get(String key){
        return hashMap.get(key);
    }
}
