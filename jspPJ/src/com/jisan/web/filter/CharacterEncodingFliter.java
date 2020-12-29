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
		
		
		req.setCharacterEncoding("UTF-8"); // �Է¹����� UTF-8�� ó��
		chain.doFilter(req,resp); //���Ͱ�ġ�� ������ ����

	}

}
