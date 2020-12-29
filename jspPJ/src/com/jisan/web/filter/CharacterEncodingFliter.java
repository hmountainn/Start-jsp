package com.jisan.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFliter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		
		req.setCharacterEncoding("UTF-8"); // 입력받은거 UTF-8로 처리
		chain.doFilter(req,resp); //필터거치고 다음거 실행

	}

}
