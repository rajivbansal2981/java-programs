package com.jmk.codingtest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPrograms {
	
	public Map<String,String> filterMap(Map<String,String> map){
		return map.entrySet().stream().filter(entry->entry.getKey().startsWith("A")).collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue()));
	}
	
	public List<String> filterList(List<String> items){
		return items.stream().filter(item->item.startsWith("P")).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
