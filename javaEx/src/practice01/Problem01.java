package practice01;

public class Problem01 {

	public static void main(String[] args) {
		// 1~100 수에서 5의 배수이면서 7의 배수인 수를 출력하세요

		/*		for (int i =1; i<=100;i++) {
			if(i%5!=0 || i%7!=0) {
				continue;
			}*/
		for (int i =1; i<=100;i++) {
			if(i%5==0&&i%7==0) {
				System.out.println(i);
			}
		}
	}
}


