package com.skillio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
	        System.out.println("We are in SERVLET file");
	    }

}

/*
GET ---> doGet
POST ---> doPost
PUT  ----> doPut
DELETE ---> doDelete
*/