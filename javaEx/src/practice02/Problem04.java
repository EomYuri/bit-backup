package practice02;

public class Problem04 {

	public static void main(String[] args) {

		int Lotto[] = new int[6];

		for(int i = 0 ; i<Lotto.length ; i++) {
			Lotto[i]=(int)(Math.random()*45)+1;
		}
		for(int i =0;i<Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
		}

	}

}

