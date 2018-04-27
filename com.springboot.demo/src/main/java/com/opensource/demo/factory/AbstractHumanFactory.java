package com.opensource.demo.factory;

public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> clazz);

}
