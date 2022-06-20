package all.codes;

public class FindANumberInArray {

	public static void main(String[] args) {
		
		int[] numberall = { 1, 2, 3, 4, 5 };
		int toFind = 5 ;
		boolean found = false;

		for (int n : numberall) {
			if (n == toFind) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(toFind + " is found.");
		else
			System.out.println(toFind + " is not found.");
	}
}
