package com.opensource.demo;

public enum MachineState {

	// 0£º³É¹¦ 1£ºÊ§°Ü
	SUCCESS("0"), FAILURE("1");

	private final String value;

	private MachineState(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static MachineState formMachineStateByName(String name) {
		if (name.equals(MachineState.SUCCESS.name())) {
			return MachineState.SUCCESS;
		} else if (name.equals(MachineState.FAILURE.name())) {
			return MachineState.FAILURE;
		}
		return null;
	}

	public static MachineState formMachineStateByValue(String value) {
		if (value.equals(MachineState.SUCCESS.getValue())) {
			return MachineState.SUCCESS;
		} else if (value.equals(MachineState.FAILURE.getValue())) {
			return MachineState.FAILURE;
		}
		return null;
	}
}
