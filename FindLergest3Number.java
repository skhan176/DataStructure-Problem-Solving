package AllCodes.codes;

public class FindLergest3Number {

	public static void main(String[] args) {
		
		
		int num =1100;
		int num2=200;
		int num3=1330;
		
		if(num>num2 && num>num3) {
			System.out.println("Largest Number "+ num);
			
		}else if (num2>num && num2>num3) {
			System.out.println("Largest Number "+num2);
			
			
		}else {
			System.out.println("Largest Number "+ num3);
		}
		

	}

}
