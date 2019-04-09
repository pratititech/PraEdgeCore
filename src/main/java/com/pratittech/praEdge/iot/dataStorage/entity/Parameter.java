package com.pratittech.praEdge.iot.dataStorage.entity;

import java.io.Serializable;

public class Parameter  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6410276663002518858L;
	private String name;
	private String regAddress;
	private int numOfRegs;
	private int modbusCommand;
	private String type;
	private String NAN;
	private float MultiplicationFactor;
	private String value;
	
	/*
	 * public Parameter(String name, String regAddress, int numOfRegs, int
	 * modbusCommand, String type, String nAN, float multiplicationFactor) {
	 * super(); this.name = name; this.regAddress = regAddress; this.numOfRegs =
	 * numOfRegs; this.modbusCommand = modbusCommand; this.type = type; NAN = nAN;
	 * MultiplicationFactor = multiplicationFactor; }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public int getNumOfRegs() {
		return numOfRegs;
	}

	public void setNumOfRegs(int numOfRegs) {
		this.numOfRegs = numOfRegs;
	}

	public int getModbusCommand() {
		return modbusCommand;
	}

	public void setModbusCommand(int modbusCommand) {
		this.modbusCommand = modbusCommand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNAN() {
		return NAN;
	}

	public void setNAN(String nAN) {
		NAN = nAN;
	}

	public float getMultiplicationFactor() {
		return MultiplicationFactor;
	}

	public void setMultiplicationFactor(float multiplicationFactor) {
		MultiplicationFactor = multiplicationFactor;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Parameter [name=" + name + ", regAddress=" + regAddress + ", numOfRegs=" + numOfRegs
				+ ", modbusCommand=" + modbusCommand + ", type=" + type + ", NAN=" + NAN + ", MultiplicationFactor="
				+ MultiplicationFactor + "]";
	}
	
	
	
}
