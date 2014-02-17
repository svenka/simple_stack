package simplestack;

public class Stack {

private int stack_mass[]=new int[10];
private int current_el;

Stack(int size)
{
	stack_mass=new int[size];
current_el=-1;	
	}

void push(int item)
{
	if(current_el==stack_mass.length-1)
	{
		System.out.println("Stack is full");
	}
	else
		stack_mass[++current_el]=item;
	}


int pop()
{
	if(current_el<0)
	{
		System.out.println("Stack is not loaded");
		return 0;
	}
	else
	return stack_mass[current_el--];	
	}
	
}
