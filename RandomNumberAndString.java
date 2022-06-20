package all.codes;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class RandomNumberAndString {

	public static void main(String[] args) {
		
		Random num = new Random();
		int max=100;
		
		for(int i=0; i<10;i++ ) {
			System.out.println(num.nextInt(max));
			
		}
		String ranString=RandomStringUtils.randomNumeric(5);
		
		System.out.println(ranString);
		String namName=RandomStringUtils.randomAscii(5);
		
		System.out.println(namName);

	}

}
