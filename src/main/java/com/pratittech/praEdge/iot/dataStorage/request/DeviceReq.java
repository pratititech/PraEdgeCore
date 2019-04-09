package com.pratittech.praEdge.iot.dataStorage.request;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class DeviceReq {

	private String deviceId;
	private String manufactureName; 
	private String hardwareId;
	private String protocol;	
	private String host;
	private String port;
	private String userName;
	private String password;
	private String modelNumber;
	private List<ParameterReq> parameterList;
	
	/*
	 * public DeviceConfig(String deviceId, String manufactureName, String
	 * hardwareId, String protocol, String host, String port, String userName,
	 * String password, String modelNumber, Parameter[] parameterList) { super();
	 * this.deviceId = deviceId; this.manufactureName = manufactureName;
	 * this.hardwareId = hardwareId; this.protocol = protocol; this.host = host;
	 * this.port = port; this.userName = userName; this.password = password;
	 * this.modelNumber = modelNumber; this.parameterList = parameterList; }
	 */
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getManufactureName() {
		return manufactureName;
	}
	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}
	public String getHardwareId() {
		return hardwareId;
	}
	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public List<ParameterReq> getParameterList() {
		return this.parameterList;
	}
	public void setParameterList(List<ParameterReq> parameters) {
		this.parameterList = parameters;
	}
	@Override
	public String toString() {
		return "DeviceConfig [deviceId=" + deviceId + ", manufactureName=" + manufactureName + ", hardwareId="
				+ hardwareId + ", protocol=" + protocol + ", host=" + host + ", port=" + port + ", userName=" + userName
				+ ", password=" + password + ", modelNumber=" + modelNumber + ", parameterList="
				+ parameterList + "]";
	}
  
	
}

