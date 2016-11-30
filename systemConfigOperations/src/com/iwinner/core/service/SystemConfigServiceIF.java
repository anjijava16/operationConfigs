package com.iwinner.core.service;

import com.iwinner.core.execptions.ServiceException;

public interface SystemConfigServiceIF {

	

	public Boolean isDownTimeStatus(String applicatioName)throws ServiceException;

	public Boolean isEmailStatus(String applicatioName)throws ServiceException;

	public Boolean isSMSStatus(String applicatioName)throws ServiceException;

	public Boolean isLoginStatus(String applicatioName)throws ServiceException;

	public Boolean isEdrsStatus(String applicatioName)throws ServiceException	;

}
