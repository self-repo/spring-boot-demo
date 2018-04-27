package com.opensource.demo.factory;

public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> clazz) {
		Human human = null;

		try {
			human = (Human) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return (T) human;
	}

}
