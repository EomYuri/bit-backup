package day1;

public class RandomArray {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int num = (int) Math.round(Math.random()*9+1);
				array[i][j]=num;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();

		}

	}
}