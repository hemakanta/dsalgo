package com.ds.practice;

public class DSTestIng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = { 1, 2, 3, 4, 4 };
		
		boolean visited[] = new boolean[A.length + 1];

		// for each element of the array mark it as visited and
		// return the element if it is seen before
		for (int value : A) {
			// if element is seen before
			if (visited[value]) {
				System.out.println("Value duplicate: "+ value);
				break;
			}
			// mark element as visited
			visited[value] = true;
		}
		

	}

}
