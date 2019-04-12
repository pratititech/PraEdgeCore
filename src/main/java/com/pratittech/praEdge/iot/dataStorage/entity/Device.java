package com.pratittech.praEdge.iot.dataStorage.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="Device")
@JsonInclude(Include.NON_NULL)
public class Device implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3695495752338558876L;
	@Id
	@JsonProperty
    private String deviceId;
	@JsonProperty
    private String name;
	@JsonProperty
    private String description;
	@JsonProperty
	private String manufactureName;
	@JsonProperty
	private String hardwareId;
	@JsonProperty
	private Date Mfd;
	@JsonProperty
	private String protocol;
	@JsonProperty
	private String host;
	@JsonProperty
	private String port;
	@JsonProperty
	private String userName;
	@JsonProperty
	private String password;
	@JsonProperty
	private String modelNumber;
	
	private ArrayList<Parameter> parameterList;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Date getMfd() {
		return Mfd;
	}

	public void setMfd(Date mfd) {
		Mfd = mfd;
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

	public ArrayList<Parameter> getParameterList() {
		return parameterList;
	}

	public void setParameterList(ArrayList<Parameter> parameterList) {
		this.parameterList = parameterList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Mfd == null) ? 0 : Mfd.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((hardwareId == null) ? 0 : hardwareId.hashCode());
		result = prime * result + ((host == null) ? 0 : host.hashCode());
		result = prime * result + ((manufactureName == null) ? 0 : manufactureName.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parameterList == null) ? 0 : parameterList.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
		result = prime * result + ((protocol == null) ? 0 : protocol.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (Mfd == null) {
			if (other.Mfd != null)
				return false;
		} else if (!Mfd.equals(other.Mfd))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (hardwareId == null) {
			if (other.hardwareId != null)
				return false;
		} else if (!hardwareId.equals(other.hardwareId))
			return false;
		if (host == null) {
			if (other.host != null)
				return false;
		} else if (!host.equals(other.host))
			return false;
		if (manufactureName == null) {
			if (other.manufactureName != null)
				return false;
		} else if (!manufactureName.equals(other.manufactureName))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parameterList == null) {
			if (other.parameterList != null)
				return false;
		} else if (!parameterList.equals(other.parameterList))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		if (protocol == null) {
			if (other.protocol != null)
				return false;
		} else if (!protocol.equals(other.protocol))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Device1 [deviceId=" + deviceId + ", name=" + name + ", description=" + description
				+ ", manufactureName=" + manufactureName + ", hardwareId=" + hardwareId + ", Mfd=" + Mfd + ", protocol="
				+ protocol + ", host=" + host + ", port=" + port + ", userName=" + userName + ", password=" + password
				+ ", modelNumber=" + modelNumber + ", parameterList=" + parameterList + "]";
	}

}
