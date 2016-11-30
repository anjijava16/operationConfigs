package com.iwinner.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwinner.core.dao.SystemConfigDaoIF;
import com.iwinner.core.execptions.DaoException;
import com.iwinner.core.execptions.ServiceException;

@Service
public class SystemConfigServiceImpl implements SystemConfigServiceIF {

	@Autowired
	private SystemConfigDaoIF systemConfigDao;

	
	public SystemConfigDaoIF getSystemConfigDao() {
		return systemConfigDao;
	}

	public void setSystemConfigDao(SystemConfigDaoIF systemConfigDao) {
		this.systemConfigDao = systemConfigDao;
	}

	@Override
	public Boolean isDownTimeStatus(String applicatioName) throws ServiceException {

		try {
			return systemConfigDao.isDownTimeStatus(applicatioName);
		} catch (DaoException e) {
			return false;
		}
	}

	@Override
	public Boolean isEmailStatus(String applicatioName) throws ServiceException {
		try {
			return systemConfigDao.isEmailStatus(applicatioName);
		} catch (DaoException e) {
			return false;
		}

	}

	@Override
	public Boolean isSMSStatus(String applicatioName) throws ServiceException {
		try {
			return systemConfigDao.isSMSStatus(applicatioName);
		} catch (DaoException e) {
			return false;
		}

	}

	@Override
	public Boolean isLoginStatus(String applicatioName) throws ServiceException {
		try {
			return systemConfigDao.isLoginStatus(applicatioName);
		} catch (DaoException e) {
			return false;
		}

	}

	@Override
	public Boolean isEdrsStatus(String applicatioName) throws ServiceException {
		try {
			return systemConfigDao.isEdrsStatus(applicatioName);
		} catch (DaoException e) {
			return false;
		}

	}

}
