package practice;

import java.util.HashMap;
import java.util.Map;

public class Occurrence_02 {

	public static void main(String[] args) {
		
		int[] list = { 2, 3, 4, 2, 5, 3 };
		
		Map<Integer, Integer> number = new HashMap<>();
		
		for(int num : list) {
			
			if(number.containsKey(num)) {
				number.put(num, number.get(num)+1);
			}else {
				number.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : number.entrySet()) {
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
		}
	}
}
