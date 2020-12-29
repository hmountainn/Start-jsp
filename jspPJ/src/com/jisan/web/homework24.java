package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homework24")
public class homework24 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); // UTF-8로 응답보낼게
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8로 받아라
		PrintWriter out = resp.getWriter();
		
		String[] num_ = req.getParameterValues("num"); //값여러개 배열로 받기
		int result = 0;
		
		for(int i=0; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			result = result+num;
		}
		
		out.print("총합은: "+result);
		
		}
	
		
	}

