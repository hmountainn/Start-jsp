package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homework")
public class homework21 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); // UTF-8�� ���亸����
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8�� �޾ƶ�
		PrintWriter out = resp.getWriter();
		
		int x = Integer.parseInt(req.getParameter("x")); //x�� �ޱ�
		int y = Integer.parseInt(req.getParameter("y")); //y�� �ޱ�
		String bt = req.getParameter("bt");
		
		if(bt.equals("����")) {
			int sum = x+y;
			out.println("���� "+sum);
		}
		else {
			int minus = x-y;
			out.println("���� "+minus);
		}
		}
	
		
	}
