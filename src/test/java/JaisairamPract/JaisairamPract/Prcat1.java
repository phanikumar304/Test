package JaisairamPract.JaisairamPract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Prcat1 {
	public static void main(String[] args){
		
		int num = 112;
		
		String st = Integer.toString(num);
		
		char[] words = st.toCharArray();
		
		System.out.println(Arrays.toString(words));
		
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(Character word:words){
			if(!count.containsKey(word)){
				count.put(word, 1);
			}
			
			else{
				count.put(word, count.get(word)+1);
			}
		}
		
		//System.out.println(count.entrySet());
		
		for(Entry pcount:count.entrySet()){
			
			System.out.println(pcount.getKey()+""+pcount.getValue());
		}
	}

}
