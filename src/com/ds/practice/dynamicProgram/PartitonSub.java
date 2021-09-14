package com.ds.practice.dynamicProgram;

import java.util.ArrayList;
import java.util.List;


public class PartitonSub {
	
	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		PartitonSub obj =  new PartitonSub();
		obj.nonRepeate(null);
		long end = System.nanoTime();
		System.out.println("\n Execution time nano: " + (end - start)/*+", mili: "+ (end-start)/1000000*/);
		
	}
	
	public void nonRepeate(String stream) {
		stream = "aabcdcebdf";
		boolean[] repeted = new boolean[MAX_CHAR];
		List<Character> inDll = new ArrayList();
		for(int i=0; i<stream.length(); i++){
			char x = stream.charAt(i);
			if(!repeted[x]){
				inDll.add(x);
				repeted[x]= true;
			}else {
				if(inDll.contains(x)) {
					inDll.remove((Character)x);
				}
			}
			if(inDll.size()>0) {
				System.out.print(inDll.get(0)+" ");
			}else {
				System.out.print("-1 ");
			}
		}
	}

}
