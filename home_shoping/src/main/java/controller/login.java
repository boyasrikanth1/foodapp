package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.sinupdao;
import home_shoping.dto;
@WebServlet("/login")
public class login extends HttpServlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("UserEmail");
		String password=req.getParameter("UserPasssword");
		sinupdao sinupdao=new sinupdao();
		dto dto=sinupdao.feachbyemail(email);
		
		if(dto.getUserEmail().equals(email)&&dto.getUserPassword().equals(password))
		{
			List<dto>dtos=sinupdao.feachall();
			req.setAttribute("dtos", dtos);
			RequestDispatcher dispatcher=req.getRequestDispatcher("clothspage.jsp");
		dispatcher.forward(req, resp);
		}
		else
		{
			req.setAttribute("message","worng detailes ");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}

}
