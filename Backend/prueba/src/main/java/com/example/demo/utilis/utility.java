package com.example.demo.utilis;

import javax.servlet.http.HttpServletRequest;

public class utility {
    public  static String getSiteURL(HttpServletRequest request) {
		String siteURL = request.getRequestURI().toString();
    	return siteURL.replace(request.getServletPath(), "");
    	
    }
	
	
}
