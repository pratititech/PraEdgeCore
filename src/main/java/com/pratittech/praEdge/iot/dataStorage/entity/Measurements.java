package com.pratittech.praEdge.iot.dataStorage.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Measurements")
public class Measurements {
	@Id
	private String id;
    private String assignmentId;
    private List<DeviceMeasurementParameters> parameterList;
	public List<DeviceMeasurementParameters> getParameterList() {
		return parameterList;
	}
	public void setParameterList(List<DeviceMeasurementParameters> parameterList) {
		this.parameterList = parameterList;
	}
	public String getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}
	@Override
	public String toString() {
		return "Measurements [id=" + id + ", assignmentId=" + assignmentId + ", parameterList=" + parameterList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignmentId == null) ? 0 : assignmentId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((parameterList == null) ? 0 : parameterList.hashCode());
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
		Measurements other = (Measurements) obj;
		if (assignmentId == null) {
			if (other.assignmentId != null)
				return false;
		} else if (!assignmentId.equals(other.assignmentId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parameterList == null) {
			if (other.parameterList != null)
				return false;
		} else if (!parameterList.equals(other.parameterList))
			return false;
		return true;
	}
	
	
	
    
}