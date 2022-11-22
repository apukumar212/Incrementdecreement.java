package com.task1;

public class Incrementdecreement 
{
void meth1()
{
	int a=10;
	System.out.println(++a);
	System.out.println(++a);
	a++;
	System.out.println(++a);
	System.out.println(--a);
	System.out.println(a);
	System.out.println(a--);
	System.out.println(a++);
	--a;
	System.out.println(a--);
	System.out.println(++a);
	a=a++ + ++a;
	System.out.println("====>"+a);
}
public static void main(String[] args) 
{
	Incrementdecreement aobj=new Incrementdecreement();
	aobj.meth1();
}
}
