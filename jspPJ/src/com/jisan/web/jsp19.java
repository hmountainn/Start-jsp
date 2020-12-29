package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice")
public class jsp19 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //UTF-8�� �����ڴ�
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8�� �޾ƶ�
		
		PrintWriter out = resp.getWriter();
		
		String title = req.getParameter("title");  //�̸��� title���� �ޱ�
		String content = req.getParameter("content"); //�̸��� content���� �ޱ�
		
		out.println(title);
		out.println(content);
		
		
	}
}
