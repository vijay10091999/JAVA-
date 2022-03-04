package com.servlets;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.GsonUtility;
import com.entities.Setup;
import com.entities.User;
import com.entities.jsongetdata;




public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try{
			String code = request.getParameter("code");
		      String urlParameters = "code=" + 
		        code + 
		        "&client_id=" + Setup.CLIENT_ID +
		        "&client_secret=" + Setup.CLIENT_SECRET + 
		        "&redirect_uri=" + Setup.REDIRECT_URL +
		        "&grant_type=authorization_code";
		      URL url = new URL("https://accounts.google.com/o/oauth2/token");
		      URLConnection conn = url.openConnection();
		      conn.setDoOutput(true);
		      OutputStreamWriter writer = new OutputStreamWriter(
		        conn.getOutputStream());
		      writer.write(urlParameters);
		      writer.flush();
		      String line1 = jsongetdata.CLIENT_DATA;
		      BufferedReader reader = new BufferedReader(new InputStreamReader(
		        conn.getInputStream()));
		      String line;
		      while ((line = reader.readLine()) != null)
		      {
		        line1 = line1 + line;
		      }
		      String s = GsonUtility.getJsonElementString("access_token", line1);
		      
		      url = new URL(
		        "https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + 
		        s);
		      conn = url.openConnection();
		      line1 = "";
		      reader = new BufferedReader(new InputStreamReader(
		        conn.getInputStream()));
		      while ((line = reader.readLine()) != null) {
		        line1 = line1 + line;
		      }
		      User data = (User)new Gson().fromJson(line1, User.class);
		      writer.close();
		      reader.close();
		      request.setAttribute("auth", data);
		      request.getRequestDispatcher("/google.jsp").forward(request, response);
		    }
		    catch (MalformedURLException e)
		    {
		      e.printStackTrace();
		    }
		    catch (ProtocolException e)
		    {
		      e.printStackTrace();
		    }
		    catch (IOException e)
		    {
		      e.printStackTrace();
		    }
		  }
		  
		  protected void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException
		  {}
		}


