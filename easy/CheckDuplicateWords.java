package easy;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicateWords {
	public static void main(String[] args) {
		String values = "Rahul is a good boy boy boy boy";
		String[] splitValue = values.split(" ");
		
		HashMap<String, Integer> stringMapCount = new HashMap<String,Integer>();
		
		for(int i = 0 ; i < splitValue.length;i++) {
			//System.out.println(splitValue[i]);
			if(stringMapCount.containsKey(splitValue[i])){
				stringMapCount.put(splitValue[i], (stringMapCount.get(splitValue[i]) + 1));
			}else {
				stringMapCount.put(splitValue[i], 1);
			}
		}
		
		//Print the HashMap
		for (Map.Entry<String,Integer> entry : stringMapCount.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		
	}
}
