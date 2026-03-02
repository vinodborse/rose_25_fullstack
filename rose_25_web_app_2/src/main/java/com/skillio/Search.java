package com.skillio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
		
			String searchReq = req.getParameter("q");
			String searchData = "Sorry!!!!!";
			if(searchReq.equals("cricket")) {
				searchData = "Live cricket scores and updates on India tour of England 2025 and all current top-level cricket matches for men and women";
			} else if(searchReq.equals("football")) {
				searchData = "Football is the world's most popular sport, featuring two teams of 11 players aiming to score by moving a ball into the opposing goal, primarily using their feet.";
			}
			
			
			req.setAttribute("data",searchData);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
        }

}
