package all.codes;

public class FindALetterAndPossition {

	public static void main(String[] args) {
		// String name="sarower";
				String name2 = new String("UNITED STATE OF AMERICA");
				int count = 1;

				for (int i = 0; i < name2.length(); i++) {

					if (name2.charAt(i) == 'E') {
						
						System.out.println(name2.charAt(i) + "::Position =" + i);
						// System.out.println(i);
						count++;
					}
					
					
				}
				System.out.println("COUNT ::"+count);
//				int count =0;
//				for(int i=0; i<name2.length();i++) {
//					if(name2.charAt(i)=='E') {
//						count++;
//					}
//				}
//				System.out.println(count);
				

			}

	}


