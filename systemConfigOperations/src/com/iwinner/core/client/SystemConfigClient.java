package com.iwinner.core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iwinner.core.service.SystemConfigServiceIF;
import com.iwinner.core.service.SystemConfigServiceImpl;

public class SystemConfigClient {
	
	public static void main(String[] args) {	
		
		try{
		ApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		
		SystemConfigServiceIF	 systemConfig=(SystemConfigServiceImpl)context.getBean("systemServiceConfig");
		
		System.out.println(systemConfig.isDownTimeStatus("URLSAVER"));
			
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
}
}
