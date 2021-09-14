package com.ds.practice.arrays;

public class LinearArray {

	public LinearArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int LA[] =  { 1, 10, 4, 67, 29, 7, 19 };
		int size = LA.length, item = 45, k = 3;
		
		int LA2[] = new int[size+1];
		int i = 0, j =size-1;

		System.out.println("Original array:");

		for (i = 0; i < size; i++) {
			//System.out.println("LA[" + i + "] = " + LA[i]);
			System.out.print(LA[i]+" ");
			LA2[i]=LA[i];
		}
		size = size + 1;
		while (j >= k-1) {
			LA2[j + 1] = LA2[j];
			j = j - 1;
		}
		LA2[k-1] = item;
		size = LA2.length;
		System.out.println("\n\nAfter adding array:");

		for (i = 0; i < size; i++) {
			//System.out.println("LA2[" + i + "] = " + LA2[i]);
			System.out.print(LA2[i] +" ");
		}
		
		j = 3;
		System.out.println("\nDeletion of element in posiotion:  "+ j);
		
		   while( j < LA.length) {
		      LA[j-1] = LA[j];
		      j = j + 1;
		   }
			
		   size = LA.length-1;
		   
		   System.out.println("\nThe array elements after deletion :");
			
		   for(i = 0; i<size; i++) {
			   //System.out.println("LA["+i+"]"+" - "+LA[i]);
			   System.out.print(LA[i]+" ");
		   }
		
		/*int size=0, numInsert=0, numPosition = 0;
		String[] scAry = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		size = sc.nextInt(); //Integer.parseInt(sc.nextLine());
		System.out.println("Enetr the number to insert");
		numInsert = sc.nextInt(); //Integer.parseInt(sc.nextLine());
		System.out.println("Enetr the position to insert the number");
		numPosition = sc.nextInt(); //Integer.parseInt(sc.nextLine());
		//scAry = sc.nextLine().trim().split("\\s");
		
		int[] la1 = new int[size];
		int[] la2 = new int[size+1];
		System.out.println("Enetr the Arraay");
		for (int i = 0; i < size; i++)
		{
			la1[i]=sc.nextInt();
			la2[i]=la1[i];
		}
//		for (int i = 0; i < scAry.length; i++) {
//			la1[i]=Integer.parseInt(scAry[i]);
//			la2[i]=Integer.parseInt(scAry[i]);
//		}
		for (int i = 0; i < la1.length; i++) {
			System.out.print(la1[i]+ " ");
			
		}
		int j = size-1;
		while(j >= numPosition) 
		{
			la2[j+1] = la2[j];
			j = j-1;
		}
		la2[numPosition]=numInsert;
		System.out.println("\nAfter inert the number:");
		for (int i = 0; i < la2.length; i++) {
			System.out.print(la2[i]+ " ");
			
		}*/
	}

}
