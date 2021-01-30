package collections.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class WordsCount {
	public static void main(String[] args) {
		//input list
		List<String> inputWords =	
				Arrays.asList("java", "php", "android", "sap", 
						"php", "java", "win", "ios", "win", "hana",
						"android","ios","ios");

		Map<String,Integer> wordsCount = new HashMap<>();

		//process each word and add to map
		for(String word:inputWords){
			if(wordsCount.containsKey(word)){
				int currCount = wordsCount.get(word);
				currCount++;
				//add word to map with updated count
				wordsCount.put(word,currCount);
			}else{
				//add word to map with count as 1
				wordsCount.put(word,1);
			}
		}

		//print all words with count
		for(Entry entry: wordsCount.entrySet()){
			System.out.println("word : "+entry.getKey() +
					", count="+entry.getValue());
		}

	}
}



