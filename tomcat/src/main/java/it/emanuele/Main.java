package it.emanuele;


import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

	public static void main(String[] args) {

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8091);

        Context ctx = tomcat.addContext("/manu", new File(".").getAbsolutePath());
        
        Primaservlet primaServlet = new Primaservlet();
        
        Tomcat.addServlet(ctx, "manu", primaServlet);

        ctx.addServletMapping("/*", "manu");

        try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        tomcat.getServer().await();
	}

}