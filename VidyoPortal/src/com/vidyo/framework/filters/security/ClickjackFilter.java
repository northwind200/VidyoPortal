package com.vidyo.framework.filters.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class ClickjackFilter implements Filter {
	
	private String mode = "DENY";

	@Override
	public void destroy() {

	}

	/**
     * Add X-FRAME-OPTIONS response header to tell IE8 (and any other browsers who
     * decide to implement) not to display this content in a frame. For details, please
     * refer to http://blogs.msdn.com/sdl/archive/2009/02/05/clickjacking-defense-in-ie8.aspx.
     */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse)response;
        res.addHeader("X-FRAME-OPTIONS", mode);			
        chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String configMode = filterConfig.getInitParameter("mode");
        if ( configMode != null ) {
            mode = configMode;
        }
	}

}
