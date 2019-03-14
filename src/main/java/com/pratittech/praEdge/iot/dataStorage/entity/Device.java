package com.pratittech.praEdge.iot.dataStorage.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Device")
public class Device {
	@Id
    private String id;
    private String name;
    private String description;
    private String hardwareId;
    private String Mfd;
    private String parentId;
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



	public String getHardwareId() {
		return hardwareId;
	}



	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
	}



	public String getMfd() {
		return Mfd;
	}



	public void setMfd(String mfd) {
		Mfd = mfd;
	}



	public String getParentId() {
		return parentId;
	}



	public void setParentId(String parentId) {
		this.parentId = parentId;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getId() {
        return id;
    }

    

    public Device(String name) {
		super();
		this.name = name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Mfd == null) ? 0 : Mfd.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((hardwareId == null) ? 0 : hardwareId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
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
		if (hardwareId == null) {
			if (other.hardwareId != null)
				return false;
		} else if (!hardwareId.equals(other.hardwareId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parentId == null) {
			if (other.parentId != null)
				return false;
		} else if (!parentId.equals(other.parentId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", description=" + description + ", hardwareId=" + hardwareId
				+ ", Mfd=" + Mfd + ", parentId=" + parentId + "]";
	}



	
     
}
