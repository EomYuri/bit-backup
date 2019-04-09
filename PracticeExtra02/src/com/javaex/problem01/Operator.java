package com.javaex.problem01;

public abstract class Operator {
	protected int x;
	protected int y;
	
	public abstract void setValue(int a, int b);
	public abstract int calculate();
	
}
