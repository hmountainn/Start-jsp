package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

@WebServlet("/jsp16")
public class jsp16 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //UTF-8�� �����ڴ�
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8�� �޾ƶ�
		
		PrintWriter out = resp.getWriter();
		
		String cnt_ = req.getParameter("cnt"); //cnt�� ������Ʈ�� �̿��ؼ� ����ڿ��� ����
		
		int cnt = 10; //�⺻��
		if(cnt_ !=null && !cnt_.equals("")) {  //������Ʈ������ �Է¹����� �װ����� ����
			cnt = Integer.parseInt(cnt_);
		}
		
		for(int i=0; i<cnt; i++) {
		out.println((i+1)+": �ȳ� servlet<br/>");
		
		}
	}
}
