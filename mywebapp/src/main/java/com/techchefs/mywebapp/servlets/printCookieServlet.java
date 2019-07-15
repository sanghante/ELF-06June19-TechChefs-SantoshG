package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printCookie")
public class printCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] ck = req.getCookies();

		if (ck != null) {
			int i=1;
			resp.getWriter().println("Found these cookies in req Header");
			for (Cookie c : ck) {
				
				resp.getWriter().println(""+i+++").  ");
				resp.getWriter().print(c.getName()+" ");
				resp.getWriter().println(c.getValue());
				
				//Arrays.asList(ck).stream().forEach(e -> resp.getWriter().print(e.getName()+"  "+e.getValue());
			}
		} else {
			resp.getWriter().print("No cookies in the request");
		}
	}

}
