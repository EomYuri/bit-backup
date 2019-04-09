package com.example.jacaex.reftype;

public class MainArgs {
	public static void main(String[] args) {
		System.out.printf("args length: %d%n",args.length);
		
		for ( int i = 0; i< args.length; i++) {
			System.out.printf("args[%d} = %s%n",i,args[i]);
		}

	}

}
