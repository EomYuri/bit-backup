package practice01;

public class Problem04 {

	public static void main(String[] args) {
		/*
		 * for(int i=1;i<=10;i++) { System.out.print(i+"\t"); for(int j=i+1;j<i+10;j++)
		 * { System.out.print(j+"\t"); } System.out.println(); }
		 */
		
		for(int i =1;i<=10;i++) {
			System.out.print(i+"\t");
			for(int j = 0; j<10;j++) {
				System.out.println(i+j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
