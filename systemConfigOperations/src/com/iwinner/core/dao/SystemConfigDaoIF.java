package com.iwinner.core.dao;

import com.iwinner.core.execptions.DaoException;

public interface SystemConfigDaoIF {


	public Boolean isDownTimeStatus(String applicatioName)throws DaoException;

	public Boolean isEmailStatus(String applicatioName)throws DaoException;

	public Boolean isSMSStatus(String applicatioName)throws DaoException;

	public Boolean isLoginStatus(String applicatioName)throws DaoException;

	public Boolean isEdrsStatus(String applicatioName)throws DaoException;

}
