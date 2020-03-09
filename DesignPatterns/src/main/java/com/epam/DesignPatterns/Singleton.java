package com.epam.DesignPatterns;

class government
{
	void show()
	{
		System.out.println("this is india government singleton class");
	}
}
class card extends government
{
	void display()
	{
		System.out.println("this card is valid only in india");
	}
}
public class Singleton {
public static void main(String arg[])
{
	card c=new card();
	c.show();
	c.display();
}
}