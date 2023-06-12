package com.singelton;

public class Singelton implements Cloneable{
	
	private static Singelton singeltonobj;
	
	private Singelton() {
		
	}
	public static Singelton getSingleton() {
		if(singeltonobj==null) {
			singeltonobj = new Singelton();
			
		}else {
			return singeltonobj;
		}
		return singeltonobj;
	}
	protected Object clone() {
		return singeltonobj;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Singelton singelton = getSingleton();
		Object object = singelton.clone();
		System.out.println(object.hashCode());
		System.out.println(singelton.hashCode());
	}

}
