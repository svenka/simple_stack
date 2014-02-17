package simplestack;

public class Test {

	public static void main(String[] args) {
		Stack s1=new Stack(5);
		Stack s2=new Stack(8);
		
		for(int i=0;i<5;i++)
			s1.push(i);
		
		for(int i=0;i<8;i++)
			s2.push(i);
		
		
	System.out.println("Stack number one");
	for(int i=0;i<5;i++)
		System.out.println(s1.pop());
	
	System.out.print("\n");
	System.out.println("Stack number two");
	for(int i=0;i<8;i++)
		System.out.println(s2.pop());


	}

}
