package all.codes;

public class FactorialNumber {
  public static void main(String[] args) {
//	int num=4; int fac=1;
//	for(int i=1; i<=num; i++) {
//		fac=fac*i;
//	}
//	System.out.println(fac);
	  
	  int num=5; long fac=1;
	  for(int i=num ; i>=1; i--) {
		  fac=fac*i;
		  
	  }
	  System.out.println(fac);
}
}