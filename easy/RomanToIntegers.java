package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {
    private static final Map<String,Integer> dict = new HashMap<String,Integer>(){{
        put("I",1);
        put("V",5);
        put("X",10);
        put("L",50);
        put("C",100);
        put("D",500);
        put("M",1000);
    }};
    
    public static void main(String[] args){
        String s = "IV";
        Integer intVal = 0;
        
        char[] ch = s.toCharArray();
        for(char c : ch){
        	System.out.println(c);
        	intVal += dict.get(Character.toString(c));
        }
        System.out.println(intVal);
    }

}
