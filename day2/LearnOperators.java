package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// Arithmetic operations
		int x=5;
		int y=5;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//Assignment operations
		int z=10;
		z=z+10;
		z+=10; //short hand assignment
		System.out.println(z);
		
		//Comparison operations
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x<y);
		System.out.println(x<=5);
		System.out.println(x>y);
		System.out.println(x>=5);

		//Logical operations
		//AND * 1*1=1 T T T
		System.out.println((x==y) && (x<5));
		
		//OR + 1+1 =t 0+0=F
		System.out.println((x==y) || (x<5));
		
		//Not !
		System.out.println(!(x==y));
		
		boolean flag=false;
		
		System.out.println(!flag);
		
		
		//Increment operations (++)
		System.out.println(x++);  //post increment
		System.out.println(x);
		System.out.println(++x);  //pre increment
		
		
		//Decrement operations  (--)
		System.out.println(y--);
		System.out.println(y);
		System.out.println(--y);
		
          	}
	}

