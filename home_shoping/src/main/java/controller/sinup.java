package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.sinupdao;
import home_shoping.dto;
@WebServlet("/sinupp")
public class sinup extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("UserName");
	String email=req.getParameter("UserEmail");
	String password=req.getParameter("UserPassword");
	long phno=Long.parseLong(req.getParameter("UserPhno"));
	String Address=req.getParameter("UserAddress");
    String date=req.getParameter("UserDate");
    
    dto dto=new dto();
    dto.setUserAddress(Address);
    dto.setUserDate(date);
    dto.setUserName(name);
    dto.setUserPassword(password);
    dto.setUserPhno(phno);
    dto.setUserEmail(email);
    
    sinupdao sinupdao=new sinupdao();
    dto dto2=sinupdao.insert(dto);
    if(dto2!=null)
    {
    	System.out.println(dto2.getId());
    	req.setAttribute("message","your detales sucessufully sinup");
    	RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
    	dispatcher.forward(req, resp);
    }
}
}
