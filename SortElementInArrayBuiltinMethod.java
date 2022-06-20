package all.codes;

import java.util.Arrays;
import java.util.Collections;

public class SortElementInArrayBuiltinMethod {
	public static void main(String[] args) {
	/*
		
		//Approach 1
		
		int a[]= {10,20,90,60,50,45};
		
		System.out.println();
		Arrays.parallelSort(a);
		
		System.out.println("after sort"+Arrays.toString(a));
	}

 int arr[] = { 4, 3, 6, 2, 5 };
System.out.println("Before Shorting Array "+Arrays.toString(arr));
Arrays.sort(arr);
System.out.println("After Shorting Array "+ Arrays.toString(arr));
 */
	
	//Descending order
		
	Integer arr[] = { 4, 3, 6, 2, 5 };
	System.out.println("Before Shorting Array "+Arrays.toString(arr));
	
	Arrays.sort(arr,Collections.reverseOrder());
	
	System.out.println("After Shorting Array "+Arrays.toString(arr));

	
	
	
	
}
	
	
}