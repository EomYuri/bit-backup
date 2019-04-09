package practice02;

public class Problem03 {

	public static void main(String[] args) {
		char c[] =  {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'}; 
		
		
		for(int i = 0; i<c.length;i++) {
			if(c[i]==' ') {
				c[i]=',';

			}
			
		}
		System.out.println(c);

	}

}
