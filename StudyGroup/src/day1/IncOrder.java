package day1;
// �𸣰���
import java.util.Scanner;

public class IncOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 10���� �Է��ϼ���.");
		int array[] = new int[10];
		int tmp;
		for(int i=0;i<10;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					tmp = array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}


