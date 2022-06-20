package AllCodes.codes;

import java.util.Arrays;

public class TwoArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int a[]= {1,2,3,4,5,6};
		

		boolean status = true;
		if(arr.length==a.length) 
		{
			
		
			for(int i=0; i<arr.length;i++) {
				if(arr[i]!=a[i]) {
					status = false;
				}
			}
		}
	
		else {
			status=false;
		}
		if(status ==true) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}

}

}
