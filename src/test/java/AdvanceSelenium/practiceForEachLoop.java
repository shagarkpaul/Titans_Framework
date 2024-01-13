package AdvanceSelenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class practiceForEachLoop {

	public static void main(String[] args) {
		
		ArrayList<String> mylist = new ArrayList<>(); 
		
		mylist.add("paul"); 
		mylist.add("hwy"); 
		mylist.add("i am ok"); 
		mylist.add("how r y"); 
		mylist.add("i am fine"); 
		
		System.out.println(mylist);
		
		for(String items:mylist ) {
			
			System.out.println(items);
		}
		
		Set<Integer> myset = new HashSet<>();
		
		
		myset.add(23);
		myset.add(54);
		myset.add(98);
		myset.add(21);
		myset.add(14);
		
		for(int x : myset) {
			System.out.println(x);
		}

	}

}
