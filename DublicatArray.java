package AllCodes.codes;

import java.util.HashSet;

public class DublicatArray {

	public static void main(String[] args) {
		
		String str []= { "JAVA","RUBY","c#","PYTHON","JAVA"};
		
		boolean flag=false;
		for(int i=0; i<str.length; i++) {
			for(int j=i+1;j<str.length; j++) {
				if(str[i]==str[j]) {
					System.out.println("Dublicat value :"+str[i]);
					flag=true;
				}
				
			}
		}
		if(flag==false) {
			System.out.println("No Dublicat value");
		}
		//HashSet Approach
		
//		
//		HashSet<String> hs=new HashSet<>();
//		
//		boolean flag=false;
//		for(String value:str) {
//			
//			if(hs.add(value)==false) {
//				System.out.println("Dublicate :"+value);
//				flag=true;
//			}
//		}
//		if(flag==false) {
//			System.out.println("No Dublicate ");
//		}

	}

}
