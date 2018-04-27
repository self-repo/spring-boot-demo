package com.opensource.demo.factory;

public class FactoryTest {

	public static void main(String[] args) {

		AbstractHumanFactory abstractHumanFactory = new HumanFactory();
		Human blackMan = abstractHumanFactory.createHuman(BlackHuman.class); // 黑人诞生了
		blackMan.talk();
		Human yellowMan = abstractHumanFactory.createHuman(YellowHuman.class); // 黄人诞生了
		yellowMan.talk();
		Human whiteMan = abstractHumanFactory.createHuman(WhiteHuman.class); // 白人诞生了
		whiteMan.talk();

	}

}
