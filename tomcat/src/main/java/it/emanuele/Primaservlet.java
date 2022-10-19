package it.emanuele;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Primaservlet extends HttpServlet {

		

			private static final long serialVersionUID = 1L;

			@Override
		    protected void service(HttpServletRequest req, HttpServletResponse resp) 
		            throws ServletException, IOException {
		        
		        Writer w = resp.getWriter();
		        
		        
		        
		        
		        
				w.write("  <b> prova </b>"
						+ " <p><a href=\"#\">Home</a> | <a href=\"#\">Chi siamo</a> | <a href=\"#\">Java</a></p>\r\n"
						+ "<b> prova completa </b>"
						+ "<!DOCTYPE html>\r\n"
						+ "<html lang=\"en\">\r\n"
						+ "<head>\r\n"
						+ "<meta charset=\"utf-8\">\r\n"
						+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
						+ "<style>\r\n"
						+ "* {\r\n"
						+ "  box-sizing: border-box;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "body {\r\n"
						+ "  margin: 0;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Style the header */\r\n"
						+ ".header {\r\n"
						+ "  background-color: #f1f1f1;\r\n"
						+ "  padding: 20px;\r\n"
						+ "  text-align: center;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Style the top navigation bar */\r\n"
						+ ".topnav {\r\n"
						+ "  overflow: hidden;\r\n"
						+ "  background-color: #333;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Style the topnav links */\r\n"
						+ ".topnav a {\r\n"
						+ "  float: left;\r\n"
						+ "  display: block;\r\n"
						+ "  color: #f2f2f2;\r\n"
						+ "  text-align: center;\r\n"
						+ "  padding: 14px 16px;\r\n"
						+ "  text-decoration: none;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Change color on hover */\r\n"
						+ ".topnav a:hover {\r\n"
						+ "  background-color: #ddd;\r\n"
						+ "  color: black;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Create three equal columns that floats next to each other */\r\n"
						+ ".column {\r\n"
						+ "  float: left;\r\n"
						+ "  width: 33.33%;\r\n"
						+ "  padding: 15px;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Clear floats after the columns */\r\n"
						+ ".row:after {\r\n"
						+ "  content: \"\";\r\n"
						+ "  display: table;\r\n"
						+ "  clear: both;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */\r\n"
						+ "@media screen and (max-width:600px) {\r\n"
						+ "  .column {\r\n"
						+ "    width: 100%;\r\n"
						+ "  }\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "/* Style the footer */\r\n"
						+ ".footer {\r\n"
						+ "  background-color: #f1f1f1;\r\n"
						+ "  padding: 10px;\r\n"
						+ "  text-align: center;\r\n"
						+ "}\r\n"
						+ "</style>\r\n"
						+ "</head>\r\n"
						+ "<body>\r\n"
						+ "\r\n"
						+ "<div class=\"header\">\r\n"
						+ "  <h1>RF Tecnoformazione Java</h1>\r\n"
						+ "  <p>Prima prova html in java </p>\r\n"
						+ "</div>\r\n"
						+ "\r\n"
						+ "<div class=\"topnav\">\r\n"
						+ "  <a href=\"#\">Home</a>\r\n"
						+ "  <a href=\"#\">Chi siamo</a>\r\n"
						+ "  <a href=\"#\">Java</a>\r\n"
						+ "</div>\r\n"
						+ "\r\n"
						+ "<div class=\"row\">\r\n"
						+ "  <div class=\"column\">\r\n"
						+ "    <h2>colonna sinistra</h2>\r\n"
						+ "    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>\r\n"
						+ "  </div>\r\n"
						+ "  \r\n"
						+ "  <div class=\"column\">\r\n"
						+ "    <h2>colonna centro</h2>\r\n"
						+ "    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>\r\n"
						+ "  </div>\r\n"
						+ "  \r\n"
						+ "  <div class=\"column\">\r\n"
						+ "    <h2>colonna destra</h2>\r\n"
						+ "    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis velit nec neque ultricies, eget elementum magna tristique. Quisque vehicula, risus eget aliquam placerat, purus leo tincidunt eros, eget luctus quam orci in velit. Praesent scelerisque tortor sed accumsan convallis.</p>\r\n"
						+ "  </div>\r\n"
						+ "</div>\r\n"
						+ "\r\n"
						+ "<div class=\"footer\">\r\n"
						+ "  <p>copyright</p>\r\n"
						+ "</div>\r\n"
						+ "  \r\n"
						+ "</body>\r\n"
						+ "</html>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "");
				
		        w.flush();
		        w.close();
		    }
			
			
		}

		
		
		
	


