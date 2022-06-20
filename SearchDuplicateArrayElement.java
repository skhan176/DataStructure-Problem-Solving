package AllCodes.codes;

public class SearchDuplicateArrayElement {

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,4,5,6,7,4,8,6};
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if((arr[i]==arr[j])&&(i!=j)) {
					
					System.out.println("Duplicate Element:  "+arr[j]);
					
					//System.out.println();
				}
			}
			
		}

	}

}
