package com.pratittech.praEdge.iot.dataStorage.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class DeviceAssignments {
	@Id
	private String assignmentId;
    private String deviceId;
    private String plantId;
    private String location;
    private String status;
    private String installedDate;

    public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getPlantId() {
		return plantId;
	}

	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInstalledDate() {
		return installedDate;
	}

	public void setInstalledDate(String installedDate) {
		this.installedDate = installedDate;
	}

	@Override
	public String toString() {
		return "DeviceAssignments [assignmentId=" + assignmentId + ", deviceId=" + deviceId + ", plantId=" + plantId
				+ ", location=" + location + ", status=" + status + ", installedDate=" + installedDate + "]";
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeviceAssignments other = (DeviceAssignments) obj;
		if (assignmentId == null) {
			if (other.assignmentId != null)
				return false;
		} else if (!assignmentId.equals(other.assignmentId))
			return false;
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (installedDate == null) {
			if (other.installedDate != null)
				return false;
		} else if (!installedDate.equals(other.installedDate))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (plantId == null) {
			if (other.plantId != null)
				return false;
		} else if (!plantId.equals(other.plantId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignmentId == null) ? 0 : assignmentId.hashCode());
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((installedDate == null) ? 0 : installedDate.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((plantId == null) ? 0 : plantId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
