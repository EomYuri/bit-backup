package day2.mypoint;

class MyColorPoint extends MyPoint{  
	private String color;
	public MyColorPoint(int x, int y, String color){ 
		super(x,y);
		this.color=color; 
	}
	
	protected void move(int x,int y){ 
		this.x=x; this.y=y; 
	}
	protected void reverse(){ 
		int temp; 
		temp=this.x; 
		this.x=this.y;
		this.y=temp;
	}
	protected void show(){
		System.out.println(x+","+y+","+color);  
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	MyPoint p= new MyColorPoint(2,3,"blue"); 
	p.move(3, 4);
	p.reverse(); 
	p.show();



}

}
