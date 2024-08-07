package com.tnsif.dayeighteen.userdefinedfunctionalinterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetInterface obj=(s)->System.out.println("Hello "+s);

		obj.greet("Students");
		
		obj=(s)->System.out.println("Good Morning "+s);
		
		obj.greet("Students");
		
		
		System.out.println("------------------------------------");
		
		ArithmeticOperations opr;
		int result;
		
		opr=(x,y)->x+y;
		result=opr.perform(100, 20);
		System.out.println("Addition : "+result);
		
		opr=(x,y)->x-y;
		result=opr.perform(100, 20);
		System.out.println("Subtraction : "+result);
		
		opr=(x,y)->x*y;
		result=opr.perform(100, 20);
		System.out.println("Multiplication : "+result);
		
		opr=(x,y)->x/y;
		result=opr.perform(100, 20);
		System.out.println("Division : "+result);
		
		opr=(x,y)->{
			int p=1;
			while(y>0)
			{
				p=p*x;
				y--;
			}
			return p;
					
		};
		result=opr.perform(4, 3);
		System.out.println("Power is : "+result);
	}

}
