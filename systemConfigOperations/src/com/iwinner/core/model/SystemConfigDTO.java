package com.iwinner.core.model;

import java.util.Date;

public class SystemConfigDTO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer systemId;
	private String systemName;
	private String systemCode;
	private Boolean isLoginStatus;
	private Boolean isEmailStatus;
	private Boolean isSMSStatus;
	private Boolean isEDRSStatus;
	private Boolean isLOGSStatus;
	private Boolean isDownStatus;
	private Boolean isApplicationRunStatus;
	private Date createdDate;
	private String createBy;
	private String systemRemarks;
	
	
	
	

	
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getSystemRemarks() {
		return systemRemarks;
	}

	public void setSystemRemarks(String systemRemarks) {
		this.systemRemarks = systemRemarks;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public Boolean getIsLoginStatus() {
		return isLoginStatus;
	}

	public void setIsLoginStatus(Boolean isLoginStatus) {
		this.isLoginStatus = isLoginStatus;
	}

	public Boolean getIsEmailStatus() {
		return isEmailStatus;
	}

	public void setIsEmailStatus(Boolean isEmailStatus) {
		this.isEmailStatus = isEmailStatus;
	}

	public Boolean getIsSMSStatus() {
		return isSMSStatus;
	}

	public void setIsSMSStatus(Boolean isSMSStatus) {
		this.isSMSStatus = isSMSStatus;
	}

	public Boolean getIsEDRSStatus() {
		return isEDRSStatus;
	}

	public void setIsEDRSStatus(Boolean isEDRSStatus) {
		this.isEDRSStatus = isEDRSStatus;
	}

	public Boolean getIsLOGSStatus() {
		return isLOGSStatus;
	}

	public void setIsLOGSStatus(Boolean isLOGSStatus) {
		this.isLOGSStatus = isLOGSStatus;
	}

	public Boolean getIsDownStatus() {
		return isDownStatus;
	}

	public void setIsDownStatus(Boolean isDownStatus) {
		this.isDownStatus = isDownStatus;
	}

	public Boolean getIsApplicationRunStatus() {
		return isApplicationRunStatus;
	}

	public void setIsApplicationRunStatus(Boolean isApplicationRunStatus) {
		this.isApplicationRunStatus = isApplicationRunStatus;
	}

	@Override
	public String toString() {
		return "SystemConfigDTO [systemId=" + systemId + ", systemName=" + systemName + ", systemCode=" + systemCode
				+ ", isLoginStatus=" + isLoginStatus + ", isEmailStatus=" + isEmailStatus + ", isSMSStatus="
				+ isSMSStatus + ", isEDRSStatus=" + isEDRSStatus + ", isLOGSStatus=" + isLOGSStatus + ", isDownStatus="
				+ isDownStatus + ", isApplicationRunStatus=" + isApplicationRunStatus + ", createdDate=" + createdDate
				+ ", createBy=" + createBy + ", systemRemarks=" + systemRemarks + "]";
	}


	
	
	
	
}
