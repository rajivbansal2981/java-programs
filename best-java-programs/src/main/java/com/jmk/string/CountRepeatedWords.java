package com.jmk.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountRepeatedWords {
	public static void main(String[] args) {
		String sentence="Hello Delhi Hello Namaste Hello Namaste";
		List<String> words=Arrays.asList(sentence.split(" "));
		Map<String,Integer> wordCount=new HashMap();
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word,wordCount.get(word)+1);
			}else {
				wordCount.put(word,Integer.valueOf(1));
			}
		}
		
		Set<Map.Entry<String,Integer>> wordCountResult=wordCount.entrySet().stream().filter(word->word.getValue()>1).collect(Collectors.toSet());
		
		
		wordCountResult.stream().forEach(wordCounts->System.out.println(wordCounts));
	}

}
