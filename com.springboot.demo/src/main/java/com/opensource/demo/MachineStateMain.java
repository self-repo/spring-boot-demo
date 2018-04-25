package com.opensource.demo;

public class MachineStateMain {

	public static void main(String[] args) {

		MachineState state = MachineState.FAILURE;
		System.out.println(state.name());
		System.out.println(state.getValue());

		MachineState ms = MachineState.formMachineStateByName(state.name());
		System.out.println(ms);

		ms = MachineState.formMachineStateByValue(state.getValue());
		System.out.println(ms);
	}

}
