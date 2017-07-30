package com.scoopen.springHello;

public class HelloWorld 
{
	
	String name;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello()
    {
        System.out.println( "Hello World!"+name );
    }
}
