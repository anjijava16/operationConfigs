package com.iwinner.core.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.iwinner.core.model.SystemConfigDTO;

public class SystemConfigDaoImpl implements SystemConfigDaoIF{

	private JdbcTemplate jdbcTemplate; 

    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
		
	/*public SystemConfigDTO getSystemConfigInformation() {
		try {
	          
			List list = jdbcTemplate.query("select * from url_system_configs where SYSTEM_NAME= ?",new Object[]{applicationName},new RowMapper(){
	    		
	    		public SystemConfigDTO mapRow(ResultSet rs, int rowNum)
	                    throws SQLException{
	    			SystemConfigDTO systemConfig = new SystemConfigDTO();
	    			systemConfig.setSystemId(rs.getInt("SYSTEM_CONFIG_ID"));
	    			systemConfig.setIsLoginStatus(rs.getBoolean("IS_LOGIN_STATUS"));
	    			systemConfig.setSystemName(rs.getString("SYSTEM_NAME"));
	    			systemConfig.setSystemCode(rs.getString("SYSTEM_CODE"));
	    			systemConfig.setIsDownStatus(rs.getBoolean("IS_DOWN_STATUS"));
	    			systemConfig.setIsEDRSStatus(rs.getBoolean("IS_EDRS_STATUS"));
	    			systemConfig.setIsEmailStatus(rs.getBoolean("IS_EMAIL_STATUS"));
	    			systemConfig.setIsLOGSStatus(rs.getBoolean("IS_LOGS_STATUS"));
	    			systemConfig.setIsSMSStatus(rs.getBoolean("IS_SMS_STATUS"));
	    			systemConfig.setCreatedDate(rs.getDate("CREATED_DATE"));
	    			systemConfig.setCreateBy(rs.getString("CREATED_BY"));
	    	        systemConfig.setSystemRemarks(rs.getString("SYSTEM_REMARKS"));
	    			return systemConfig;
	    		}});
			
			
	    	if(list != null && list.size() > 0)
	            return (SystemConfigDTO)list.get(0);
		} catch (Exception e) {
	                           e.printStackTrace();
		}
		

	}
	
*/
	public SystemConfigDTO getSystemConfigInformationByUsingSystemName(String applicationName) {
		
		try {
          
			List list = jdbcTemplate.query("select * from url_system_configs where SYSTEM_NAME= ?",new Object[]{applicationName},new RowMapper(){
	    		
	    		public SystemConfigDTO mapRow(ResultSet rs, int rowNum)
	                    throws SQLException{
	    			SystemConfigDTO systemConfig = new SystemConfigDTO();
	    			systemConfig.setSystemId(rs.getInt("SYSTEM_CONFIG_ID"));
	    			systemConfig.setIsLoginStatus(rs.getBoolean("IS_LOGIN_STATUS"));
	    			systemConfig.setSystemName(rs.getString("SYSTEM_NAME"));
	    			systemConfig.setSystemCode(rs.getString("SYSTEM_CODE"));
	    			systemConfig.setIsDownStatus(rs.getBoolean("IS_DOWN_STATUS"));
	    			systemConfig.setIsEDRSStatus(rs.getBoolean("IS_EDRS_STATUS"));
	    			systemConfig.setIsEmailStatus(rs.getBoolean("IS_EMAIL_STATUS"));
	    			systemConfig.setIsLOGSStatus(rs.getBoolean("IS_LOGS_STATUS"));
	    			systemConfig.setIsSMSStatus(rs.getBoolean("IS_SMS_STATUS"));
	    			systemConfig.setCreatedDate(rs.getDate("CREATED_DATE"));
	    			systemConfig.setCreateBy(rs.getString("CREATED_BY"));
	    	        systemConfig.setSystemRemarks(rs.getString("SYSTEM_REMARKS"));
	    			return systemConfig;
	    		}});
			
			
	    	if(list != null && list.size() > 0)
	            return (SystemConfigDTO)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Boolean isDownTimeStatus(String applicatioName) {

		Boolean isDownStatus=Boolean.FALSE;
		SystemConfigDTO systemConfigDTO=getSystemConfigInformationByUsingSystemName(applicatioName);
		
		isDownStatus=systemConfigDTO.getIsDownStatus();
		
		if(isDownStatus){
			isDownStatus=Boolean.TRUE;
			return isDownStatus;
		}else{
			isDownStatus=Boolean.TRUE;
			return isDownStatus;
		}
	}

	public Boolean isEmailStatus(String applicatioName) {
		Boolean isEmailStatus=Boolean.FALSE;
		SystemConfigDTO systemConfigDTO=getSystemConfigInformationByUsingSystemName(applicatioName);
		
		isEmailStatus=systemConfigDTO.getIsEmailStatus();
		
		if(isEmailStatus){
			isEmailStatus=Boolean.TRUE;
			return isEmailStatus;
		}else{
			isEmailStatus=Boolean.TRUE;
			return isEmailStatus;
		}

	}

	public Boolean isSMSStatus(String applicatioName) {
		Boolean isSMSStatus=Boolean.FALSE;
		SystemConfigDTO systemConfigDTO=getSystemConfigInformationByUsingSystemName(applicatioName);
		
		isSMSStatus=systemConfigDTO.getIsSMSStatus();
		
		if(isSMSStatus){
			isSMSStatus=Boolean.TRUE;
			return isSMSStatus;
		}else{
			isSMSStatus=Boolean.TRUE;
			return isSMSStatus;
		}
	}

	public Boolean isLoginStatus(String applicatioName) {
		Boolean isLoginStatus=Boolean.FALSE;
		SystemConfigDTO systemConfigDTO=getSystemConfigInformationByUsingSystemName(applicatioName);
		
		isLoginStatus=systemConfigDTO.getIsLoginStatus();
		
		if(isLoginStatus){
			isLoginStatus=Boolean.TRUE;
			return isLoginStatus;
		}else{
			isLoginStatus=Boolean.TRUE;
			return isLoginStatus;
		}
		
	}

	public Boolean isEdrsStatus(String applicatioName) {
		Boolean isEdrsStatus=Boolean.FALSE;
		SystemConfigDTO systemConfigDTO=getSystemConfigInformationByUsingSystemName(applicatioName);
		
		isEdrsStatus=systemConfigDTO.getIsEDRSStatus();

		if(isEdrsStatus){
			isEdrsStatus=Boolean.TRUE;
			return isEdrsStatus;
		}else{
			isEdrsStatus=Boolean.TRUE;
			return isEdrsStatus;
		}
		
	}

}
