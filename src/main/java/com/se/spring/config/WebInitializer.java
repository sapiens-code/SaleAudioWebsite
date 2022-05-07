package com.se.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class[] {AppConfig.class};
	}
	

	@Override
    protected Class<?>[] getRootConfigClasses()
    {
        // TODO Auto-generated method stub
        return null;
    }
 
 
    @Override
    protected String[] getServletMappings()
    {
        // TODO Auto-generated method stub
        return new String[] { "/" };
    }
}
