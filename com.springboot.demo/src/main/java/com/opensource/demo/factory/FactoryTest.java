package com.opensource.demo.factory;

public class FactoryTest {

	public static void main(String[] args) {

		AbstractHumanFactory abstractHumanFactory = new HumanFactory();
		Human blackMan = abstractHumanFactory.createHuman(BlackHuman.class); // ���˵�����
		blackMan.talk();
		Human yellowMan = abstractHumanFactory.createHuman(YellowHuman.class); // ���˵�����
		yellowMan.talk();
		Human whiteMan = abstractHumanFactory.createHuman(WhiteHuman.class); // ���˵�����
		whiteMan.talk();

	}

}
