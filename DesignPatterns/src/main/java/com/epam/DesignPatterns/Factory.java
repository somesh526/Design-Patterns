package com.epam.DesignPatterns;

interface transport
{
	abstract void deliver();
}
class truck implements transport
{
	public void deliver()
	{
		System.out.println("travelling through truck");
	}
}
class ship implements transport
{
	public void deliver()
	{
		System.out.println("travelling through ship");
	}
}
public class Factory {
public static void main(String args[])
{
	System.out.println("factory class");
	truck ob=new truck();
	ship ob1=new ship();
	ob.deliver();
	ob1.deliver();
}
}	