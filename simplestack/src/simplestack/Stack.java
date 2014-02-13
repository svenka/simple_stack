package simplestack;

public class Stack {

int stack_mass[]=new int[10];
int current_el;

Stack()
{
current_el=-1;	
	}

void push(int item)
{
	if(item==9)
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
