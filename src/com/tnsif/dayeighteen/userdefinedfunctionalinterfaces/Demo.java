package com.tnsif.dayeighteen.userdefinedfunctionalinterfaces;

public class Demo {
	public static void main(String[] args) {
		ArithmeticOperations opr;
		int result;
		
		opr=(x,y)->x+y;
		result=opr.perform(10, 2);
		System.out.println("Addition is "+result);

		opr=(x,y)->x-y;
		result=opr.perform(10, 2);
		System.out.println("Subtraction is "+result);

		opr=(x,y)->x*y;
		result=opr.perform(10, 2);
		System.out.println("Multiplication is "+result);
		
		opr=(x,y)->x/y;
		result=opr.perform(10, 2);
		System.out.println("Division is "+result);
		
		opr=(x,y)->{
			int p=1;
			while(y>0)
			{
				p=p*x;
				y--;
			}
			return p;
		};
		result=opr.perform(3, 4);
		System.out.println("Power is "+result);



	
	}

}
