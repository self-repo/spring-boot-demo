package com.opensource.demo.factory;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("Black");
	}

	@Override
	public void talk() {
		System.out.println("Black talk");
	}

}
