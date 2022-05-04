
public class Cons {
	
	int in1,int2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons c = new Cons(10,100);
		
		System.out.println(c.in1);

	}
	
	Cons(int a, int b){
		this.in1 = a;
		this.int2 = b;
		
		System.out.println(a+b);
	}

}
